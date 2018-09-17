package com.atguigu.exer2;

public class Test {

	public static void main(String[] args) {
		/*
		 * 建立Test 类，在类中定义方法method1(Person e);
			在method1中:
			(1)根据e的类型调用相应类的getInfo()方法。        
			(2)根据e的类型执行：
			如果e为Person类的对象，输出：“a person”;
			如果e为Student类的对象，输出
			“a student”
			“a person ” 
			如果e为Graduate类的对象，输出： 
			“a graduated student”						Test test = new Test();
			“a student”									test.method1(new Graduate());
			“a person” 

		 */
		
		Test test = new Test();
		test.method2(new Graduate());
	}
	
	/*
	 * 多态
	 */
	public void method1(Person e){
		System.out.println(e.getInfo());
	}
	
	public void method2(Person e){
		//多行注释  ctrl + shift + / \
		//单行注释 ctrl + /
		//错误的方式
//		if(e instanceof Person){
//			System.out.println("a person");
//		}else if(e instanceof Student){
//			System.out.println("a student");
//			System.out.println("a person");
//		}else if(e instanceof Graduate){
//			System.out.println("a graduate student");
//			System.out.println("a student");
//			System.out.println("a person");
//		}
		
		//第一种方式
		/*if(e instanceof Graduate){
			System.out.println("a graduate student");
			System.out.println("a student");
			System.out.println("a person");
		}else if(e instanceof Student){
			System.out.println("a student");
			System.out.println("a person");
		}else if(e instanceof Person){
			System.out.println("a person");
		}*/
		
		//第二种方式
		if(e instanceof Graduate){
			System.out.println("a graduate student");
			
		}
		
		if(e instanceof Student){
			System.out.println("a student");
		}
		
		if(e instanceof Person){
			System.out.println("a person");
		}
		
	}
}

class Person {
	protected String name = "person";
	protected int age = 50;

	public String getInfo() {
		return "Name: " + name + "\n" + "age: " + age;
	}
}

class Student extends Person {
	protected String school = "pku";

	@Override
	public String getInfo() {
		return "Name: " + name + "\nage: " + age + "\nschool: " + school;
	}
}

class Graduate extends Student {
	public String major = "IT";
	
	@Override
	public String getInfo() {
		return "Name: " + name + "\nage: " + age + "\nschool: " + school + "\nmajor:" + major;
	}
}
