package com.atguigu.java;

/*
 * 
 * 
 * 值传递：
 *		形参：方法声明时的参数
		实参：方法调用时实际传给形参的参数值

 * 
 * 值传递：
 * 		1.如果传递的是引用数据类型实际上传递的是地址值
 * 		2.如果传递的是基本数据类型实际上传递的是变量中的值。
 */
public class ValTraTest {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 5;
		
//		int temp = a;
//		a = b;
//		b = temp;
		
		System.out.println("a=" + a + " b=" + b);
		//调用方法
		ValTraTest vt = new ValTraTest();
		vt.swap(a, b);
		
		System.out.println("a=" + a + " b=" + b);
		
		System.out.println("-----------------------");
		//创建对象
		Num num = new Num();
		num.a = 10;
		num.b = 5;
		
//		int temp = num.a;
//		num.a = num.b;
//		num.b = temp;
		
		System.out.println("num.a=" + num.a + " num.b=" + num.b);
		//实现数据的交换
		vt.swap(num); //值传递：如果传递的是引用数据类型实际上传递的是地址值
		
		System.out.println("num.a=" + num.a + " num.b=" + num.b);
		
	}
	
	public void swap(Num num){
		int temp = num.a;
		num.a = num.b;
		num.b = temp;
	}
	
	public void swap(int a,int b){
		int temp = a;
		a = b;
		b = temp;
	}
}

class Num{
	int a;
	int b;
}


