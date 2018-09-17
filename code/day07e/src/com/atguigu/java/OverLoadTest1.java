package com.atguigu.java;

public class OverLoadTest1 {
	
	

}

class OverLoad{
	
	void age(int a,int b){
		
		System.out.println("a="+a+","+"b="+b);
	}
	
	void age (int a,int b,int c){
		
		System.out.println("a="+a+",b="+b+",c="+c);
	}
}