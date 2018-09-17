package com.atguigu.java.domain;

public class Employee {
	
//	id: int 
//	 name:String
//	 age: int
//	 salary: double
	
	private int id;
	private String name;
	private	int age;
	private double salary;
	
	public Employee(){
		
	}

	public Employee(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
}
