package com.atguigu.java;

/*
 * 父类
 */
public class Person {
	private String name;
	int age;
	
	public Person(){
		
	}
	
	public void show(){
		System.out.println(name + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
