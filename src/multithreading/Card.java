package multithreading;
/**
 * 用来存钱的银行卡
 * @author issuser
 *
 */
public class Card implements Runnable{
	 private String name;
	 private Multithreading mu=new Multithreading();
	 
	 
	public Card(String name, Multithreading mu) {
		this.name = name;
		this.mu = mu;
	}


	public void run() {
		while(true){
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		mu.add(name,100);     
	}
	}
}
