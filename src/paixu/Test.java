package paixu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Test {
	 public static void main(String[] args) {
		 List<Student> li=new ArrayList<Student>();
		 Student s1=new Student();
		 Student s2=new Student();
		 s1.setName("liu");
		 s2.setName("han");
		 li.add(s1);
		 li.add(s2);
		//String[] ss={"aa","bb"};
		/*for (int i = 0; i < ss.length; i++) {
			if("a".equals(ss[i])){
				System.out.println(123);
			}else{
				System.out.println(13);
			}
		}*/
		 StringBuffer asd=new StringBuffer();
		 for (Student student : li) {
			 asd.append(","+student.getName());
		}
		 
		 String[] split = asd.toString().substring(1).split(",");
		 for (int i = 0; i < split.length; i++) {
			 if("lu".equals(split[i])){
				 System.out.println(123);
			 }else{
				 System.out.println(split[i]);
			 }
		}
	}
	 
}
