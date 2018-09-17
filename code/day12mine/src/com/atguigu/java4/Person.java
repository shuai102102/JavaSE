package com.atguigu.java4;

public class Person extends Creature {
	
	String name = "person";
	int age;
	
	public void say(){
		System.out.println("人说话勒");
	}
	
	@Override
	public void run() {
		System.out.println("人跑起来勒");
	}

}
