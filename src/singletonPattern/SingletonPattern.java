package singletonPattern;

public class SingletonPattern {

	
	private SingletonPattern(){}
/**
 * �򵥶���ʽ��    ��һ���ؾͻ�ʵ���������ŵ��ǰ�ȫ��ȱ����
 */
	/*private static SingletonPattern sp=new SingletonPattern();
	public static SingletonPattern getSingletonPattern(){
		return sp;
	}*/
	
	/**
	 * ����ʽ�����ھ�̬�������
	 */
	/*private static SingletonPattern sp;
	static {
		sp =new SingletonPattern();
	}
	public static SingletonPattern getSingletonPattern(){
		return sp;
	}*/
	
	/**
	 * ����ʽ�������ã������̰߳�ȫ����
	 */
	/*private static SingletonPattern sp;
	
	public static SingletonPattern getSingletonPattern(){
		if(sp==null){
		sp=new SingletonPattern();
		}
		return sp;
	}*/
	/**
	 * ����ʽ�����ã����Ƽ� Ч�ʵ�
	 */
/*private static SingletonPattern sp;
	
	public static synchronized SingletonPattern getSingletonPattern(){
		if(sp==null){
		sp=new SingletonPattern();
		}
		return sp;
	}*/
	/**
	 * ����ʽͬ������飬���ã����Ƽ� Ч�ʵ�
	 */
/*private static SingletonPattern sp;
	
	public static SingletonPattern getSingletonPattern(){
		if(sp==null){
		synchronized(Object.class){
		sp=new SingletonPattern();
		}
		}
		return sp;
	}*/
	/**
	 * ˫�ؼ���������ã��Ƽ�
	 */
/*private static SingletonPattern sp;
	
	public static SingletonPattern getSingletonPattern(){
		if(sp==null){
		synchronized(Object.class){
			if(sp==null){
		}
		sp=new SingletonPattern();
		}
		}
		return sp;
	}*/
	
	/**
	 * ��̬�ڲ��࣬�Ƽ�ʹ��
	 */
	/*private static class Instans{
		private static SingletonPattern sp=new SingletonPattern();	
	}
	
	public static SingletonPattern getInstans(){
		return  Instans.sp;
	}*/
}
