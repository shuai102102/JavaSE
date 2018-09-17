package com.atguigu.java;


/*
 * javaBeen
 * 1.必须有空参的构造器
 * 2.提供set/get方法
 */
public class Person {
	
	String name;
	int age;
	int number;
	
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Person(){
		
	}

}
