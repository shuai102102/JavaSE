package com.atguigu.java3;

@MyAnn
public class Student extends Person<String> {

	@MyAnn(age = 20)
	public int studentId;
	private String address;
	
	public Student(){
		
	}
	
	
	public void info(){
		System.out.println(studentId + " " + address);
	}
	
	private void say(String name){
		System.out.println("我是私有的我骄傲" + " " + name);
	}
}
