package com.atguigu.java;

/*
 * 
 * abstract : 抽象的
 * 
 * abstract可以修饰类和方法。abstract修饰的类叫做抽象类修饰的方法叫做抽象方法
 * 
 * 
 * 修饰方法：
 * 		1.abstract修饰的方法所在的类必须用abstract修饰
 * 		2.抽像方法没有方法体
 *      3.抽像方法所在的类必须是抽像类，抽像类中不一定有抽像方法
 * 
 * 修饰类：
 * 		1.抽像类不能被实例化
 * 		2.思考？抽像类有构造器吗？- 子类对象的实例化过程
 * 		3.一个非抽像的子类必须重写父类中所有的抽像方法，除非抽像方法被父类给重写了。
 * 		4.抽像类可以继承非抽像类也可以继承抽像类
 * 
 * 思考？abstract不可以和哪些关键字一些使用？
 * 		final,static,private
 * 
 */
public class AbstractTest {

	public static void main(String[] args) {

		// new Shape().findArea(); 编译错误：抽像类不能被实例化

//		Circle circle = new Circle();
//		circle.radius = 1;
//		circle.findArea();
		
		
		//匿名子类
		B b = new B(){
			@Override
			public void say() {
				System.out.println("aaaaa");
			}
		};
		
		b.say();
		
		
		
	}
}


abstract class B{
	public abstract void say();
}

class D extends B{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
	
}

class E extends B{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
	
}



abstract class A {
	public A() {
		System.out.println("A()");
	}

	abstract void run();

}

abstract class Shape extends A { // 抽像类

	// 抽像类虽然不能被实例化但也有构造器：子类对象实例化过程
	public Shape() {
		System.out.println("shape()");
	}

	String name;

	public abstract void findArea(); // 抽像方法：没有方法体

	public void say() {
		System.out.println("我是形状我骄傲");
	}

	@Override
	public void run() {
		System.out.println("我是抽像类我还重写抽像方法");
	}
}

class Circle extends Shape {

	double radius;

	@Override
	public void findArea() {
		System.out.println(Math.PI * radius * radius);
	}

//	@Override
//	public void run() {
//
//	}
}
