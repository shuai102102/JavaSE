package com.atguigu.java3;

public class Demo {

	public static void main(String[] args) {

		Demo demo = new Demo();
		demo.shout(new Man());
		demo.shout(new Dog());
	}

	public void shout(A a) {
			a.say();
	}
}


interface A{
	void say();
}

class Person {

}

class Man extends Person implements A {
	public void say() {
		System.out.println("人说话了");
	}
}

class Animal {

}

class Dog extends Animal implements A {

	public void say(){
		System.out.println("狗叫了");
	}
}
