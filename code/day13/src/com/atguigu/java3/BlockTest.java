package com.atguigu.java3;

/*
 * 代码块：
 * 格式：
 * 		{
 * 			执行语句;
 * 		}
 * 
 * 作用：对java类或对象进行初始化
 * 
 * 说明：可以被static所修饰
 * 
 * 	   			静态代码块：（静态代码块执行的顺序优先于非静态代码块）
 * 					1.可以有输出语句
 * 					2.静态代码块随着类的加载而加载，只执行一次
 * 					3.若有多个静态代码块，那么按照从上到下的顺序依次执行
 * 					4.不可以调用非静态方法和实例变量
 * 					5.可以对类的属性(类变量)、类的声明进行初始化操作
 * 
 * 				非静态代码块：
 * 					1.可以有输出语句
 * 					2.随着对象的创建而加载，创建几次对象就执行几次。
 * 					3.若有多个非静态代码块，那么按照从上到下的顺序依次执行
 * 					4.可以调用类变量和静态方法
 * 					5.可以对类的属性、类的声明进行初始化操作
 * 
 * 属性的赋值方式？   
 * 		1.默认值   2.显示赋值  5.代码块  3.构造器赋值   4.对象.方法名/对象.属性    
 * 赋值的顺序？
 * 		
 */
public class BlockTest {

	public static void main(String[] args) {
		
//		new Person();
//		new Person();
//		new Person().show();
		
//		Person person = new Person("小龙哥",14);
//		person.show();
		
		Person person = new Person();
		person.show();
	}
}

class Person{
	
	//非静态代码块
	{
		//System.out.println("我是非静态代码块" + count);
		//say();
		age = 20;
	}
		
		
	String name;
	int age = 30;
	static int count;
	
	public Person(){
		
	}
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	
	
	//静态代码块
	static{
		System.out.println("我是静态代码块");
		count = 100;
	}
	
	
	
	
	
//	static{
//		System.out.println("我是静态代码块1");
//	}
//	static{
//		System.out.println("我是静态代码块2");
//	}
	
	
	
//	{
//		System.out.println("我是非静态代码块1");
//	}
//	{
//		System.out.println("我是非静态代码块2");
//	}
	
	
	public static void say(){
		System.out.println("say");
	}
	
	public void show(){
		System.out.println("name=" + name + " age=" + age + " count=" + count);
	}
	
}
