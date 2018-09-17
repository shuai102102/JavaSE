package com.atguigu.erec;

public class ArrayTest2 {
	public static void main(String [] args){
		
		Student a = new Student();
		for(int i=0; i<a.s.length; i++){
			a.s[i] = i+1 ;
			System.out.print("\n学号为："+a.s[i]);
			
			int b = (int)((Math.random())*2.9+1);
			System.out.print("年级为："+b);
			
			int c = (int) ((Math.random())*100);
			System.out.print("\t分数为"+c);
			
			
		}
		
	}

}

class Student{
	
	int[] s = new int[20];
}
