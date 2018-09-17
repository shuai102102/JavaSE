package com.atguigu.java;

public class Student {

	String name;
	int age;
	
	public Student(){
		
	}
	
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	
	public void show(){
		System.out.println(name + " " + age);
	}

	

	
	@Override
	public boolean equals(Object obj) {
		if(this == obj){ //如果两个对象是同一块同存 直接返回true
			return true;
		}
		
		if(obj instanceof Student){
			Student stu = (Student)obj;
			if(this.name.equals(stu.name) && this.age == stu.age){
				return true;
			}
		}
		
		return false;
	}

	
	
	
	@Override
	public String toString() {
		return name + " " + age;
	}
	
	
	
	
}
