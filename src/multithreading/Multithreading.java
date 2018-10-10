package multithreading;

import java.util.concurrent.locks.ReentrantLock;
/**
 * 
 * @author issuser
 * ʵ�ֶ��߳������ַ�ʽ�������ұȽ���ϵ��ֻ�����ּ̳�thread���ʵ��Runnable�ӿڣ�ƽ�����Ƕ�˵ʵ��Runnable�ӿڵıȽϺ��ã���Ϊһ�������ʵ�ֶ���ӿڵ���ֻ�ܼ̳�һ���࣬��������̫���㣬���������˵�̳�thread���д���Ƚϼ򵥣��Ҹ���ϰ��ʹ�ü̳�thread������֣��һ�ʹ���ڲ���ķ�ʽ���ⵥ�̳еĲ���֮��
 *��֤���߳��̰߳�ȫ�����ַ�ʽ�����׳����̰߳�ȫ����ķ���ʹ��ͬ������飬���߷����ϼ�synchronization�ؼ��֣�����ʹ��lock��������ʹ��trylock
 */
public class Multithreading {

	private ReentrantLock lock = new ReentrantLock(); 
	private int count=0;
	
	public void minus(String name,int money){
		lock.lock();
		//synchronized (this) {
		try {
			if(count-money>=0){
				this.count-=money;
				System.out.println(name+"ȡ��"+money+",���"+count);
			}
				else{
					System.out.println("����");
				}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	
	}
	//}
	public void add(String name,int money){
		this.count+=money;
		System.out.println(name+"����"+money+",���"+count);
	}
}
