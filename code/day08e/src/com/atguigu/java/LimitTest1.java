package com.atguigu.java;

public class LimitTest1 {
	public static void main(String[] args){
		
		Limit a = new Limit();
		System.out.println(a.getAge());
		a.setAge(20);
		int b = a.getAge();
		System.out.println(b);
		
	}

}

class Limit{
	
	private int age;
	
	public  Limit(){
		age = 18;
	}
	
	void setAge(int a){
		
		age = a ;
		
	}
	
	int getAge(){
		
		return age;
	}
}