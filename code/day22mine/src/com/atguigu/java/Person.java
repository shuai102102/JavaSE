package com.atguigu.java;

import java.io.Serializable;

public class Person implements Serializable {
	
	int age;
	String name;
	Address address;
	
	public Person(int age, String name,Address address){
	this.age = age;
	this.name = name;
	this.address = address;
	}
	
	public void show(){
		System.out.println(name + " " + age);
	}
}
