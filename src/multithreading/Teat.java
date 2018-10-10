package multithreading;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Teat {

	public static void main(String[] args) {
		/*Multithreading mu=new Multithreading();
		Card c=new Card("���п�", mu);
		Paper p=new Paper("����", mu);
		*/
		/*Thread t1=new Thread(c);
		Thread t2=new Thread(p);
		Object o=new Object();*/
		String ss="([{(1((({{{{}2}}}{{{4[[3[]2]]])2)3))";
		char[] array = ss.toCharArray();
		Map<String, String> map=new HashMap<String, String>();
		Map<String, String> tab=new Hashtable<String, String>();
		map.clear();
		/*map.put("", "");
		map.get("");
		map.size();*/
		Set<String> set = map.keySet();
		/*t1.start();
		t2.start();*/
		Vector<String> ve=new Vector<String>(5,5);
		//ve.add("liuhan");
		//System.out.println(ve.size());
		for (int i = 0; i < array.length; i++) {
			/*char c = array[i];
			String.valueOf(c);*/
			/*if(String.valueOf(array[i]).equals("(") && String.valueOf(array[i+1]).equals(")")){
				map.put(String.valueOf(i+1),String.valueOf(array[i]));
			}else if(String.valueOf(array[i]).equals("[") && String.valueOf(array[i+1]).equals("]")){
				
			}else */if(String.valueOf(array[i]).equals("{") && String.valueOf(array[i+1]).equals("}")){
				map.put(String.valueOf(i+1),String.valueOf(array[i]));
			}
			//System.out.println(array[i]);
		}
		System.out.println(map.size());
	}
}
