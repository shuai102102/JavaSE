package com.atguigu.java;

/*
 * 
 * 
 * 	变量：
 * 		一 按数据类型分类 ： 基本数据类型  vs  引用数据类型
 * 		二 按位置分类 ： 成员变量  vs 局部变量
 * 
 *      三 成员变量  vs 局部变量
 *     		 相同点：
 *      		1.声明的格式：变量的类型  变量名  = 变量值;
 *      		2.先声明后使用
 *      		3.作用域：都是在声明它的那对大括号内
 *      
 *      	不同点：
 *      		1.内存：
 *      			  成员变量 ：在堆内存中.
 *      			  局部变量 ：在栈中
 *              2.默认值：
 *              	成员变量：
 *              			基本数据类型:
 *              					byte short int long : 0
 *              					float double: 0.0
 *              					char: \u0000
 *              					boolean:false
 *              			引用数据类型：null
 *              	局部变量：没有默认值
 *              3.位置：
 *              	成员变量：在类中，方法等结构外.
 *              	局部变量：在构造器中，方法中，代码块中，方法的形参，构造器的形参.
 *              
 *              4.权限修饰符：private 缺省的  protected public
 *              	成员变量：可以被权限修饰符所修饰
 *              	局部变量：不可以被权限修饰符所修饰
 * 
 */
public class StudentTest {

	public static void main(String[] args) {
		
		//创建对象
		Student stu = new Student();
		//调用属性或方法  对象名.属性  对象名.方法
		stu.id = 10;
		stu.study();
		
		System.out.println("-------------------------------------");
		
		NumberTest numberTest = new NumberTest();
		//复制：ctrl + alt + down
		System.out.println(numberTest.b);
		System.out.println(numberTest.s);
		System.out.println(numberTest.i);
		System.out.println(numberTest.l);
		System.out.println(numberTest.f);
		System.out.println(numberTest.d);
		System.out.println(numberTest.c);
		System.out.println(numberTest.boo);
		System.out.println(numberTest.str);
		numberTest.show();
		
		System.out.println("--------------------------------------------");
		int a;
		a = 1;
		System.out.println(a);
		
	}
}

class NumberTest{
	
	public byte b = 30;
	protected short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean boo;
	String str;
	
	//构造器
	public NumberTest(){
		System.out.println(b);
	}
	
	public NumberTest(int a){
		byte b = 10;
	}
	//代码块
	{
		
	}
	//方法
	public void show(){
		byte b = 20;
		System.out.println(b);
	}
	
}


class Student{
	
	//属性
	int id = 20;
	String name;
	int age;
	
	
	//方法
	public void study(){
		System.out.println("学生在学习");
	}
	
}
