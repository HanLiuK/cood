package multithreading;
/**
 * 用来取钱的存折
 * @author issuser
 *
 */
public class Paper implements Runnable{
private String name;
private Multithreading mu=new Multithreading();


public Paper(String name, Multithreading mu) {
	super();
	this.name = name;
	this.mu = mu;
}


public void run() {
	while(true){
	try {
		Thread.sleep(1000);
	} catch (Exception e) {
		e.printStackTrace();
	}
	mu.minus(name, 50);
}
}
}
