package test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		li.add("l");
		li.add("i");
		li.add("u");
		li.add("h");
		li.add("a");
		li.add("n");
		String s="";
		for (String ss : li) {
			s+=","+ss;
		}
		String substring = s.substring(1);
		String[] split = substring.split(",");
		for (String string : split) {
			System.out.println(string);
		}
		//System.out.println(s.substring(1));
	}
}
