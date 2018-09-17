package com.atguigu.java2;

import java.util.Arrays;

/*
 * static:静态的
 * 
 * static可以修饰：属性 ，方法，代码块，内部类
 * 
 * 成员变量：类变量（static修饰的变量）  vs 实例变量（没有static修饰的变量）
 * 
 * 			static修饰属性：
 * 				①一个类创建多个对象，多个对象共同拥有一份类变量，各个对象拥有一份实例变量。
 * 				②可以能过类名.类变量名    对象名.类变量名 进行调用
 * 				③类变量是随着类的加载而加载的
 * 				④类的加载优先于对象的创建
 * 
 * 			static修饰方法：
 * 				①静态方法是随着类的加载而加载的
 * 				②可以通过类名.静态方法名  对象名.静态方法名进行调用
 * 				③静态方法中不能调用非静态方法和实例变量
 * 					非静态方法中可以调用类变量和静态方法。
 * 				④静态方法中不能使用this和super关键字
 * 
 * 思考？什么时候用类变量和静态方法？
 * 	类变量：
 * 		1.多个对象需要拥有同一份属性的时候
 * 		2.往往常量都会用static修饰
 *  静态方法：
 *  	1. 工具类中的方法都是静态方法
 *  	2. 需要调用类变量的时候使用的方法通常也会是静态方法。
 * 
 */
public class StaticTest {

	public static void main(String[] args) {
		
		
		//创建三个人
//		Person person = new Person("张三",38,"中国");
//		person.show();
//		Person person2 = new Person("李四",36,"中国");
//		person2.show();
//		Person person3 = new Person("王二麻子",63,"中国");
//		person3.show();
		
		//通过类名.类变量名进行调用
		Person.nation = "小小小日本";
		
		Person p1 = new Person();
		//p1.setNation("小日本");
		p1.setName("小泽泽");
		p1.show();
		
		Person p2 = new Person();
		p2.setName("小空空");
		p2.show();
		
		System.out.println("--------------------");
		
//		p2.setNation("小小日本");
//		p2.show();
//		p1.show();
		
//		Person p3 = new Person();
//		p3.setName("小泷泷");
//		p3.show();
		
		//类名.静态方法名
		Person.say();
		Person p = new Person();
		p.say();
	}
}

class Person{
	String name;
	int age;
	//类变量
	static String nation;
	
	public Person(){
		
	}
	
	public Person(String name,int age,String nation){
		this.name = name;
		this.age = age;
		this.nation = nation;
	}
	
	/*
	 * 静态方法
	 */
	
	public static void say(){
		
		//System.out.println("我是静态方法" + name); 静态方法中不能调用实例变量。
		//show(); 静态方法中不能调用非静态方法
		info();
		System.out.println(nation);
	}
	
	public static void info(){
		System.out.println("info");
	}
	
	/*
	 * 非静态方法
	 */
	public void show(){
		System.out.println("name=" + name + " age=" + age + " nation=" + nation);
		info();
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	
	
}
