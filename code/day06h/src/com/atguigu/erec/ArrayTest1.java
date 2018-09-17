package com.atguigu.erec;

import java.util.Scanner;

class ArrayTest1 {
	
	public static void main(String[] args){
		
			Scanner s = new Scanner(System.in);
			long[] num = new long[2];
			String[] f = new String[2];
			num[0] = 97 ;
			for (int y=0; y<num.length ; y++){
				System.out.println("请输入一个数：");
			 num[y] = s.nextLong();
			}
			
			for (int x=0; x<num.length ; x++){
				System.out.println(num[x]);
				System.out.println(f[x]);
		}
	}
}