package com.atguigu.java;

import java.util.Date;

/*
 *  Object中的equals方法
 * 
 * 	一 .Object中的equals方法
 * 	public boolean equals(Object obj) {
        return (this == obj);
    }
    
          二 .像String，File,Date等系统提供的类一般都重写了equals方法，用来比较属性
          
    
          三 .一般自定义的类都需要我们重写equals方法，因为我们往往调用equals方法的时候都是比较两个对象中的属性是否相等。
          如果不重写equals方法那么调用的是Object中的equals方法，比较的就是地址值了.
    
    
    [面试题] == 和 equals的区别？
    	== ：
    		两边如果是基本数据类型：比较的是变量中的值。
    		两边如果是引用数据类型：比较的是地址值。 （两个引用是否指向同一块内存）
       equlas:
       		如果没有重写equals方法比较的仍是地址值
       		如果重写equals方法后，安照重写equals方法的内容来比较。（比较的是属性）
 * 
 */
public class EqualsTest {

	public static void main(String[] args) {
		
		Student student = new Student("小明",20);
		boolean equals = student.equals("aaa");
		System.out.println(equals);
		
		System.out.println("------------------------------");
		
		int a = 10;
		int b = 5;
		System.out.println(b == a); //false
		
		double c = 5.0;
		System.out.println(b == c); //true
		
		//== 两边如果是引用数据类型 比较的是地址值
		Student student2 = new Student("小明",20);
		//比较的是地址值
		System.out.println(student == student2); //false
		System.out.println(student);
		System.out.println(student2);
		
		System.out.println("----------------------------");
		
		String str = new String("aaa");
		String str2 = new String("aaa");
		System.out.println(str == str2); //false
		//因为String类重写了Object中的equals方法，比较的是字符串的内容
		System.out.println(str.equals(str2));//true
		
		System.out.println("-------------------------------");
		//比较的是对象中的属性
		System.out.println("Student====" + (student.equals(student2)));
	}
}


