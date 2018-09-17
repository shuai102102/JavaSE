package com.atguigu.java;

import com.atguigu.exer2.Circle;

public class Person {

	String name;
	int age;
	int sex;
	
	
	public Person(){
		
	}
	
	public Person(String name,int age,int sex){
		this();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public void say(){
		System.out.println("人在说话");
	}
	
	protected  void show(){
		//System.out.println(name + " " + age + " " + sex);
	}
	
	public Circle info(){
		return null;
	}
	
	public double getComputer(){
		return 1.0;
	}
	
	
	private void run(){
		
	}
}
