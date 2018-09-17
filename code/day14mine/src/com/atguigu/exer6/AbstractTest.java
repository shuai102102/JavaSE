package com.atguigu.exer6;

public class AbstractTest {
	
	public static void main(String[] args) {
		
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

class R extends B{
	
	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
}

abstract class A{
	public A(){
		System.out.println("A()");
	}
	
	abstract void run();
}

abstract class Shape extends A{
	
	public Shape(){
		System.out.println("shape()");
	}
	
	String name;
	
	public abstract void findArea();
	
	public void say(){
		System.out.println("我是形状我骄傲");
	}
	
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("我是抽象我还重写抽象方法");
	}

}

class Circle extends Shape{
	
	double radius;
	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		System.out.println(Math.PI * radius * radius);
	}
}





