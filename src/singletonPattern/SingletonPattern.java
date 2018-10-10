package singletonPattern;

public class SingletonPattern {

	
	private SingletonPattern(){}
/**
 * 简单饿汉式的    类一加载就会实例化对象，优点是安全，缺点是
 */
	/*private static SingletonPattern sp=new SingletonPattern();
	public static SingletonPattern getSingletonPattern(){
		return sp;
	}*/
	
	/**
	 * 饿汉式，放在静态代码块中
	 */
	/*private static SingletonPattern sp;
	static {
		sp =new SingletonPattern();
	}
	public static SingletonPattern getSingletonPattern(){
		return sp;
	}*/
	
	/**
	 * 懒汉式，不可用，会有线程安全问题
	 */
	/*private static SingletonPattern sp;
	
	public static SingletonPattern getSingletonPattern(){
		if(sp==null){
		sp=new SingletonPattern();
		}
		return sp;
	}*/
	/**
	 * 懒汉式，可用，不推荐 效率低
	 */
/*private static SingletonPattern sp;
	
	public static synchronized SingletonPattern getSingletonPattern(){
		if(sp==null){
		sp=new SingletonPattern();
		}
		return sp;
	}*/
	/**
	 * 懒汉式同步代码块，可用，不推荐 效率低
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
	 * 双重检查锁，可用，推荐
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
	 * 静态内部类，推荐使用
	 */
	/*private static class Instans{
		private static SingletonPattern sp=new SingletonPattern();	
	}
	
	public static SingletonPattern getInstans(){
		return  Instans.sp;
	}*/
}
