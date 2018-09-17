package com.atguigu.java2;

public class Person {

	String name;
	int age;
	int sex;
	
	
//	public Person(){
//		System.out.println("person()");
//	}

	public Person(String name){
		this.name = name;
		System.out.println("person(name)");
	}
	
//	public Person(String name,int age,int sex){
//		this.name = name;
//		this.age = age;
//		this.sex = sex;
//	}
	
	
	public void say(){
		System.out.println("父亲=人说话了");
	}
	
	public void show(){
		System.out.println("父亲的=" + name + age + sex);
	}
}
