package com.atguigu.java3;


/*
 * 向TreeSet中天健自定义类对象的元素 
 * 需要自定义类实现Comparable接口
 * 
 */
public class Student2 {
	
	String name;
	int age;
	
	public Student2(){
		
	}
	
	public Student2(String name,int age){
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return "(" + name + " " + age + ")";
	}
	
}
