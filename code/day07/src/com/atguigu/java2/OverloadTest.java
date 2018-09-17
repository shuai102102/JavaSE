package com.atguigu.java2;

/*
 * 
 * 方法的重载 :
 * 		1. 在同一个类中，相同的方法名不同的形参列表构成重载
 * 
 * 		2.两同一不同：同一个类，同一个方法名，不同的形参列表
 *  
 *      3.不同的形参列表：个数，类型
 *      
 *      4.方法的重载与权限修饰符，返回值类型，形参的名称都没有关系。
 *      
 *   
 * 
 * 如何确定调用某个方法：方法名 + 形参列表
 */
public class OverloadTest {

	public static void main(String[] args) {
		
	   Computer com = new Computer();
	   com.add(10, 20);
	   com.add(12.3, 12.3);
	}
}

class Computer{
	
	public void add(int a,int b){
		System.out.println("int");
		System.out.println(a + b);
	}
	
	public void add(int a,double b){
		
	}
	
	
	public void add(double b,int a){
		
	}
	
	/*
	 * 不构成重载  ： 与形参名称没有关系
	public void add(int age,int age2){
		
	}
	*/
	
	/*
	 * 不构成重载：与权限修饰符无关
	private void add(int age,int age2){
		
	}
	*/
	
	
	/*
	 * 不构成重载：与返回值类型无关
	public int add(int age,int age2){
		return 20;
	}
	*/
	
	public void add(int a,int b,int c){
		System.out.println(a + b + c);
	}
	
	public void add(double a,double b){
		System.out.println("double");
		System.out.println(a + b);
	}
	
	public void add(float a,float b){
		System.out.println(a + b);
	}
}
