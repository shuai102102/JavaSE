package com.atguigu.java2;

/*
 * 
 * 接口 ： interface
 * 
 * 格式  ： interface 接口名{}
 * 
 * 说明：
 * 		1.接口和类是并列关系
 * 		2.接口中只能有常量和抽像方法。(jdk1.8之前)
 * 		3.类和接口的关系 : implements（实现）一个类可以实现多个接口
 * 		    接口和接口的关系：extends(继承) 接口和接口之间是多继承
 *      4.一个类实现接口后必须重写接口中的抽像方法，包括这个接口继承的其它接口中的抽像方法
 *      5.一个非抽像类必须重写接口中所有的抽像方法，除非抽像类已经重写了接口中的抽像方法。
 *      6.接口不能被实例化。接口中没有构造器。
 *      7.接口和类之间的多态性。
 *      
 */
public class InterfaceTest {

	public static void main(String[] args) {
		
		
	}
}

//类和接口的关系是：实现关系（implements）
abstract class Person implements B{

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
}

class Student extends Person{

	@Override
	public void run2() {
		// TODO Auto-generated method stub
		
	}
}


//声明了一个接口
interface A{
	//常量
	public static final String name = "小龙哥";
	String name2 = "小龙哥"; //默认省略了public static final
	
	//接口中抽像方法 : 权限修饰符只能是public
	public abstract void say();
	void run(); //默认省略了 public abstract
	
}

interface C{
	void run2();
}

//接口和接口之间的关系是多继承
interface B extends C{
	void sleep();
}
