package multithreading;

import java.util.concurrent.locks.ReentrantLock;
/**
 * 
 * @author issuser
 * 实现多线程有四种方式，但是我比较熟系的只有两种继承thread类和实现Runnable接口，平常我们都说实现Runnable接口的比较好用，因为一个类可以实现多个接口但是只能继承一个类，所以他不太方便，但是相对来说继承thread类的写法比较简单，我个人习惯使用继承thread类的那种，我会使用内部类的方式避免单继承的不足之处
 *保证多线程线程安全的四种方式：容易出现线程安全问题的方法使用同步代码块，或者方法上加synchronization关键字，或者使用lock锁，或者使用trylock
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
				System.out.println(name+"取出"+money+",余额"+count);
			}
				else{
					System.out.println("余额不足");
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
		System.out.println(name+"存入"+money+",余额"+count);
	}
}
