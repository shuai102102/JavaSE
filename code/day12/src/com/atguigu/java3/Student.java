package com.atguigu.java3;

public class Student extends Person {

	String schoolName;
	
	public Student(){
		System.out.println("student()");
	}
	
	public Student(String name,String schoolName){
		super(name);
		this.schoolName = schoolName;
	}
}
