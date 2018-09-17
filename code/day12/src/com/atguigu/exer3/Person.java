package com.atguigu.exer3;

/*
 * 
编写一个Person类，包括属性（name、age），构造器、方法say(返回自我介绍的字符串）。
编写一个Student类，继承Person类，增加ID、score属性，以及构造器，并覆盖say方法。
编写StudentTest类，创建分别Person和Student对象，调用say方法输出自我介绍。

 */
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
	
	@Override
	public String say() {
		return super.say() + " " + ID + " " + score;
	}
}
