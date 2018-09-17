package com.atguigu.java3;

/*
 * 
 *  final修饰的类不能被继承 : 比如 String StringBuffer
 *  
 *  final修饰的方法不能被重写 :
 *  
 *  final修饰的变量通常作为常量值只能赋值一次（不能被修改） : public static final double PI = 3.14159265358979323846;
 *  		final修饰的变量赋值的方式有： 显示赋值  ，代码块赋值 ,构造器赋值
 *  						
 *  		
 */
public class FinalTest {

	public static void main(String[] args) {
		
		
	}
}

class Animal{
	
	final int a;

	
	public Animal(){
		a = 10;
	}
	
	public Animal(int a){
		this.a = a;
	}
	
	public void say(){
		System.out.println("animal");
	}
}

class Dog extends Animal{
	@Override
	public void say() {
		System.out.println("dog");
	}
}
