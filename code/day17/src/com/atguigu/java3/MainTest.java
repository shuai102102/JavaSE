package com.atguigu.java3;

public class MainTest {

	/*
	 * main方法是程序的入口
	 * 1.静态方法
	 * 2.如何给main方法的参数传值--调试的时候会用
	 * 	  命令行方式给main方法传参  java 字节码文件名    参数1  参数2  ......
	 */
	public static void main(String[] a) {
		System.out.println("aaaa");
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		new Person().main(new String[]{"aa"});
	}
}

class Person{
	public static void main(String[] args) {
		System.out.println("aaaaa");
		System.out.println(args.length);
	}
}
