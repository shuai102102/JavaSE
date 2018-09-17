package com.atguigu.java;

public class SwapVarTest {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		//思考？如何实现两个变量中数据的交换
		//这种方式用的非常多 ： 基本数据类型和引用数据类型都可以。缺点：多造一个临时变量
		/*
		int temp = a;
		a = b;
		b = temp;
		*/
		
		//效率高一些，少一个临时变量。缺点：只能用于数值间的交换，可能会超出范围
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a= " + a + " b=" + b);
	}
}
