package com.atguigu.java3;

public class Person extends Creature {

	String name;
	
	public Person(){
		System.out.println("person()");
	}
	
	public Person(String name){
		this.name = name;
	}
}
