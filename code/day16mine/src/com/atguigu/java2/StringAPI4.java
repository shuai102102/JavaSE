package com.atguigu.java2;

import org.junit.Test;

import com.atguigu.java.Person;

public class StringAPI4 {
	
	/*
	 *String类：不可变得字符序列 
	 *
	 *说明：
	 *		1、被final修饰，String类不能被继承
	 *		2、实现了Serializable接口：用来序列化，
	 *		     可以在不同进程之间，前后台之间传输数据
	 * 		3、实现了Comparable<String>,:用来比较内容
	 * 		4、实现了CharSequence ：提供了一个char[]用来存放数据
	 * 
	 * 		5、字符串的底层是用char[]来保存数据的，并且是用final修饰的。
	 */
	@Test
	public void  test(){
		
		//字符串的赋值方式
		String str = "aaa";
		String str2 = "aaa";
		
		String str3 = new String("bbb");
		String str4 = new String("bbb");
		
		System.out.println(str == str2);// true
		System.out.println(str3 == str4);// fasle
		
	}
	
	/*
	 * 不可变的字符序列：(无论替换字符或者在原来的基础上做连接运算都会创建常量池中创建一个新的字符串)
	 */
	@Test
	public void test2(){
		String str = "aaa";
		String str2 = "aaa";
		System.out.println(str == str2); //true
		
		str += "a";
		System.out.println(str == str2);//fasle
	}
	
	@Test
	public void test3(){
		Person p1 = new Person(); 
		p1.setName("aaa");
		
		Person p2 = new Person();
		p2.setName("aaa");
		
		System.out.println(p1.getName() == p2.getName());//true
	}
	
	
	//字符串做拼接，如果有变量的话，我们认为会在堆中去声明值
	@Test
	public void Test4(){
		
		String str = "hello";
		String str2 = "java";
		
		String str3 = "hellojava";
		
		String str4 = "hello" + "java";
		
		String str5 = str + "java";
		
		String str6 = "hello" + str2;
		
		String str7 = (str + str2).intern();
		
		System.out.println(str3 == str4);//true
		System.out.println(str3 == str5);//fasle
		System.out.println(str3 == str6);//fasle
		System.out.println(str4 == str6);//fasle
		System.out.println(str5 == str6);//fasle
		System.out.println(str3 == str7);//true
		
	}
}


