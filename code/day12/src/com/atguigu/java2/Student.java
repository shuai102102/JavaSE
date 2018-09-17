package com.atguigu.java2;

public class Student extends Person {

	
	//String name = "红孩儿";
	String schoolName;
	
	
	public Student(){
		//System.out.println("aaa");
		super("小龙哥"); //调用父类的空参构造器
		//this("小泽泽");
		System.out.println("student()");
	}
	
	public Student(String schoolName){
		super("小龙哥");
		this.schoolName = schoolName;
	}
	

//	public void say() {
//		System.out.println("孩子=说话了");
//	}
	
	public void study(){
		//say()方法前省略的是this.还是super.
		//省略的是this.
		/*
		 * this.和super.调用父类的区别？
		 * this.先从本来找方法或者属性，找不到去父类找，父类找不到错了.
		 * super.只在父类中找，找不到报错。
		 */
		say();
		System.out.println("学生学习了");
	}
	
	
	public void show(){
		//思考：需要调用父类中的show方法
		super.show(); //通过子类对象调用父类被重写的方法的时候就需要用到super.被重写的方法名
		System.out.println(schoolName);
	}
	
	
	public void showField(){
		System.out.println(super.name);
		System.out.println(name);
	}
}
