package com.atguigu.exer;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.age = 20;
		person.name = "小班长";
		person.sex = 1;
		
		person.study();
		person.showAge();
		int addAge = person.addAge(2);
		System.out.println(addAge);
	}
}
