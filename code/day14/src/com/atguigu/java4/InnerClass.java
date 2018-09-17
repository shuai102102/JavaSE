package com.atguigu.java4;

import com.atguigu.java4.A.B;
import com.atguigu.java4.A.C;

/*
 * 
 * 内部类：一个类A的内部又声明了一个类B。类A叫做外部类，类B叫做内部类
 * 
 * 类的成员 ： 属性 ，方法，构造器，代码块，内部类
 * 
 * 
 * 内部类 :
 * 			作为一个类的成员：
 * 					1.可以使用四种权限修饰符
 * 					2.可以使用static关键字
 * 					3.可以被final所修饰
 * 			作为一个类：
 * 					1.可以被继承，可以有类的成员
 * 					2.可以被abstract修饰
 * 
 *
 * 内部类：成员内部类  vs 局部内部类
 * 
 * 思考？
 * 		1.如何创建内部类的对象？
 * 		2.内部类如何访问外部类的属性？
 * 	    3.如何使用局部内部类
 */
public class InnerClass {

	public static void main(String[] args) {

		// 如何创建内部类的对象			
		A a = new A();
		// 创建内部类非static修饰的类的对象			B b = new A().new B();
		B b = new A().new B();
		// b.say();
		// 创建内部类static修饰的类的对象				C c = new A.C();
		C c = new A.C();
		// c.info();

		System.out.println("--------------------------------");

		// 内部类如何调用外部的属性和方法
		//b.say("小泽泽");
		c.info("小空空");

		System.out.println("-------------------------");
		
		InnerClass innerClass = new InnerClass();
		P p = innerClass.show();
		p.show();
	}
	
	//局部内部类了解即可
	public P show(){
		
		class Person implements P{
			public void show(){
				System.out.println("show");
			}
		}
		
		return new Person();
	}
}

interface P{
	void show();
}

class A {

	String name = "aname";
	static int age = 10;

	public A() {

	}

	public A(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("AAAAAA");
	}
	
	public static void show2(){
		System.out.println("static show2");
	}

	// 内部类
	// 非static修饰的内部类 内部的成员不能用static修饰
	class B {
		String address = "baddress";
		String name = "bname";
		int score;

		public void say(String name) {
			// 调用外部类的属性 类名.this.属性名
			System.out.println("B=  " + name + " " + this.name + " " + A.this.name);
			// 调用外部类的方法 类名.this.方法名
			A.this.show();

			System.out.println(A.age);
		}

	}

	static class C {
		int id;
		String name = "cname";

		public void info(String name) {
			//static修饰的内部类 不能访问外部非静态的属性，方法
			System.out.println(name + " " + this.name + " " + A.age);
			show2(); //调用的是静态的方法
			A.show2();
		}

		public static void say2() {

		}
	}

	abstract class D {

	}
}
