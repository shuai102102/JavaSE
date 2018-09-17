package com.atguigu.java;

import java.io.Serializable;

public class Person implements Serializable {

	int age;
	String name;
	Address address;
	
	public Person(String name,int age,Address address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void show(){
		System.out.println(name + " " + age);
	}
}
