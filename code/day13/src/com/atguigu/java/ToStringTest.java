package com.atguigu.java;

import java.util.Date;

/*
 * 
 * toString方法
 * 
 * 一 . Object中的toString方法
 * 	  public String toString() {
         return getClass().getName() + "@" + Integer.toHexString(hashCode());
     }
     
       二 . 像String ,File ,Date 系统提供的类一般都重写了toString方法，用来显示内容。
       
       三. 一般自定义的类都需要我们重写toString方法，因为我们往往调用toString方法的时候都是输出属性的内容。
          如果不重写toString方法那么调用的是Objecgt中的toString方法，输出的是地址值.
 */
public class ToStringTest {

	public static void main(String[] args) {
		
		
		Student student = new Student("小明",20);
		
		System.out.println(student.toString()); //com.atguigu.java.Student@15db9742
		//当我们输出引用类型的变量名时，默认调用的是该类的toString()方法
		System.out.println(student); //com.atguigu.java.Student@15db9742
		
		
		System.out.println("-----------------------------------");
		
		String str = new String("aaa");
		System.out.println(str);
		System.out.println(str.toString());
		
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date);
	}
}
