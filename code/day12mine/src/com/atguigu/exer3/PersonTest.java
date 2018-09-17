package com.atguigu.exer3;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person person = new Person("小龙哥", 18);
		System.out.println(person.say());
		
		Student student = new Student(1000,100,"小鸭鸭",20);
		System.out.println(student.say());
	}
}
