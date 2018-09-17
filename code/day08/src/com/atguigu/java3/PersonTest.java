package com.atguigu.java3;
/*
 * 
 * this关键字：表示当前对象
 * 
 * this可以用来调用属性，方法，构造器
 * 
 * this调用属性和方法：
 * 			在方法和构造器中往往我们调用属性和类中的方法时都会省略"this."。但是如果在构造器和
 * 	方法中有局部变量的名字和属性的名字一样，为了加以区分我们会在属性名前加上"this."
 * 
 * 
 * this调用构造器：为了调用其它的构造器
 * 
 * 		格式：this(形参列表)
 * 	 说明：
 * 		1.必须放在构造器的首行
 *      2.一个构造器中只能有一个this(形参列表)
 *      3.如果一个类中有N个构造器，那么最多有N-1个this(形参列表)
 * 		
 * 		
 */
public class PersonTest {

	public static void main(String[] args) {
		
		//Person person = new Person("小龙哥",16);
		Person person2 = new Person();
		//person.show();
		//person.say("哈哈嘿嘿么么哒");
	}
}

class Person{
	
	String name;
	int age;
	String address;
	
	public Person(){
		//必须要执行的代码
		System.out.println("---------");
		System.out.println("---------");
		System.out.println("---------");
		System.out.println("---------");
		System.out.println("---------");
		System.out.println("---------");
		System.out.println("---------");
		System.out.println("---------");
		
		System.out.println("Person()");
	}
	
	
	public Person(String name){
		this();
		this.name = name;
	}
	
	/*
	 * this代表当前对象
	 * 
	 * 什么情况下必须写this.?
	 * 		在构造器中和方法中为了区分相同名字的局部变量和属性必须加this.
	 */
	public Person(String name,int age){
		this(name);
		this.age = age;
	}
	
	public Person(String name,int age,String address){
		this(name,age);
		this.address = address;
	}
	
	
	public void show(){
		int a = 10;
		//调用属性的时候，前边可以省略this. 
		System.out.println(name + " " + this.age);
		
	}
	
	public void say(String str){
		System.out.println("人说话了=" + str);
		this.show();
	}
	
}
