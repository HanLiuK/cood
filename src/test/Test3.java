package test;

import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		/*Integer a=256;
		Integer b=256;
		Integer c=new Integer(256);
		//String [] a={"a",}
		System.out.println(a==c);*/
		//冒泡排序 倒序
		int [] a={1,2,5,4,3,9,7,6,8,0};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j]<a[j+1]){
					int jg=a[j];
					a[j]=a[j+1];
					a[j+1]=jg;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(123445);
		
	}
}
