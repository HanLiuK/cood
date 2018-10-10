package test;

import java.text.DecimalFormat;


public class PanDaun {
	public static void main(String[] args) {

DecimalFormat    df   = new DecimalFormat("######0.00");   
		Double i=15.0;
		Integer e=3;
		System.out.println(df.format(e/i*100));
	}
}
