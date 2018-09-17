package com.atguigu.java2;

import java.util.Date;

/*
 * 注解：可以对类中的结构（属性，方法，构造器等）进行补充说明，并不会改变原来的结构
 * 
 * 系统三个基本注解：
 * 		@Override 用来限定说明该方法是被重写的方法，只能用在方法上
 * 		@Deprecated  用来说明类中的结构（方法，属性，构造器等），已经过时了。
 * 		@SuppressWarnings  抑制编译器警告
 * 
 * 元注解：
 * 		@Retention ：注解的生命周期是什么
			    SOURCE: 源文件 - 编译期间
			    CLASS: 编译期间 - 运行期间
			    RUNTIME: 运行期间 （如果需要反射拿到注解的值，那么必须是RUNTIME）
		@Target ：限定当前修饰的注解可以用在类的哪些结构上。
		@Documented ：是否可以被javadoc所解析
		@Inherited ：该注解是否可以被继承

 * 		
 */
public class AnnotationTest {

}


/*
 * 自定义注解
 * 格式 ：＠interface 注解名称 {}
 */

@interface MyAnn{
	String name() default "小龙哥";
	int age();
}

@interface MyAnnn{
	
}

@MyAnn(name = "小龙哥", age = 0)
class Person{
	
	@MyAnn(age = 0)
	String name = "aaaa";
	//@MyAnn2 - 只能用在方法上
	int age;
	
	@MyAnn2
	public void say(){
		System.out.println("person");
	}
	
	public void show(){
		//@SuppressWarnings("unused")
		int a = 10;
		System.out.println("aaa");
	}
	
}


@Deprecated
class Student extends Person{
	@Deprecated
	String name;
	
	@Deprecated
	public Student(){
		
	}
	
	@Override //重写的方法
	public void say() {
		
	}
	
	@Deprecated
	public void show(){
		new Date();
	}
}
