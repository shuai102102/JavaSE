package com.atguigu.java;


/*
 * 
 * 
 * 一 java中类和对象的具体的体现
 * 1.创建一个java文件，写一个相应的类
 * 2.在类中提供必要的属性和方法
 * 3.创建对象（对象是new出来的）
 * 4.调用属性和方法:对象.属性     对象.方法名
 * 
 * 二 内存解析
 * 
 * 
 */
public class PersonTest {

	/*
	 * 基本数据类型
	 * 
	 * 引用数据类型 ： 类  接口  数组
	 */
	public static void main(String[] args) {
		
		//对象是由类派生出来的（new出来的）
		Person p = new Person(); //创建对象
		//对象名.属性   对象名.方法
		p.age = 18;
		p.name = "小泽泽";
		p.say();
		System.out.println(p.age);
		
		System.out.println("---------------------------------------");
		
		Person cangLaoShi = new Person();
		cangLaoShi.age = 26;
		cangLaoShi.name = "苍老师";
		cangLaoShi.say();
		
		System.out.println("-----------------------------------------");
		
		Person p1 = new Person();
		p1.name = "小a";
		p1.age = 20;
		
		
		Person p2 = new Person();
		p2.name = "小b";
		p2.age = 30;
		p2.age = 50;
		
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		
		Person p3 = p2;
		p3.age = 60;
		System.out.println(p2.age); //60
		System.out.println(p3.age);  //60
		
	}
}



