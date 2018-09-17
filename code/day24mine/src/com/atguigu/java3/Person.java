package com.atguigu.java3;

public class Person<T> {

	public String name;
	public int age;
	private int sex;
	
	public Person(){
		
	}
	
	Person(String name){
		this.name = name;
	}
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	
	public void show(){
		System.out.println(name + " " + age);
	} 
}
