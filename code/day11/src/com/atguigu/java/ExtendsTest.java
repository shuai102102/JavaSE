package com.atguigu.java;

/*
 * 
 * 面向对象的三大特性之 继承性
 * 
 * 好处：①减少了代码的冗余性，提高了代码的复用性  ②提高了代码的扩张性  ③为多态提供了前提
 * 
 * 格式：class A extends B{}
 * 
 * 		class A : 子类 （subClass）
 * 		class B : 父类 （superClass） 超类 ，基类
 * 
 * 说明：
 * 		1.子类可以继承父类中的属性和方法。同时子类可以定义独有的属性和方法。
 * 				我们不认为子类可以继承父类中的构造器。
 *      2.父类在封装的前提下，子类不能直接访问父类中的属性和方法。但是我们不认为没有继承到。
 *      		可以通过间接的方式去访问父类中的属性和方法。
 *      3.子类可以继承直接父类和间接父类中的属性和方法。
 *      4.一个子类只能有一个父类，一个父类可以有多个子类。（java中的类是单继承）
 */
public class ExtendsTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.age = 18;
		//person.name = "小岳岳";
		person.show();
		
		Student stu = new Student();
		stu.age = 20;
		//stu.name = "小泽泽";
		stu.setName("小泽泽");
		stu.school = "东京热大学";
		stu.info();
		stu.show();
		
		System.out.println("----------------------");
		Graduate graduate = new Graduate();
		graduate.major = "表演专业";
		graduate.school = "东京热大学";
		graduate.setName("小空空");
		graduate.info();
	}
}
