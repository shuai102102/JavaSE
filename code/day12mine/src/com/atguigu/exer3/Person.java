package com.atguigu.exer3;

public class Person {
	
	String name;
	int age;
	
	public Person(){
		
	}
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
		
	}
	
	public String say(){
		return name + " " + age;
		
	}
}

class Student extends Person{
	int ID;
	int score;
	
	public Student(){
		
	}
	
	public Student(int ID,int score,String name,int age){
		super(name,age);
		this.ID = ID;
		this.score = score;
	}
	
	public String say(){
		return super.say() + " " + ID + " " + score;
		
	}
}