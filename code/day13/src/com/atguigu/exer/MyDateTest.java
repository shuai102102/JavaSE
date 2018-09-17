package com.atguigu.exer;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate myDate = new MyDate(2012,2,3);
		MyDate myDate2 = new MyDate(2012,2,5);
		System.out.println(myDate.equals(myDate2));
		
		System.out.println(myDate);
	}
}
