package com.atguigu.java;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		//animal.show();
		/*
		 * 在同一个包 不同类中 除private外 都可以访问
		 */
		System.out.println(animal.name);
		System.out.println(animal.nameProtected);
		System.out.println(animal.namePublic);
		
		animal.say();
		animal.sayProtected();
		animal.sayPublic();
	}
}


