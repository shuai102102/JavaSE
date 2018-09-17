package com.atguigu.java;

import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) {
		
		int[] numbers = new int[2];
		/*
		 * 
		 * ArrayIndexOutOfBoundsException
		 */
		//numbers[2] = 5; 下角标越界
		//numbers[-1] = 10;
		//int[][] n = new int[2][];
		//n[2] = new int[10];
		
		
		
		/*
		 * NullPointerException
		 */
		String[] str = {"aa","bb"};
//		String string = str[0].toUpperCase();
//		System.out.println(string);
		str = new String[2];
		//System.out.println(str[0].toString());
		
		
		ArrayException ae = new ArrayException();
		ae.say();
	}
	
	private Scanner s;
	public void say(){
		//s.nextInt();
	}
}
