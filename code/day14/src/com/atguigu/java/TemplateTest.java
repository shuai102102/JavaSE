package com.atguigu.java;

/*
 * 
 * 模板设计模式：当功能内部一部分实现是确定，一部分实现是不确定的。这时可以把不确定的部分暴露出去，让子类去实现。

 * 
 */
public class TemplateTest {

	public static void main(String[] args) {
		
		Computer c = new CodeTest();
		c.codeTime();
	}
}

abstract class Computer{
	
	public void codeTime(){
		//开始的时间
		long start = System.currentTimeMillis();
		
		code();
		
		//结束的时间
		long end = System.currentTimeMillis();
		//时间差
		System.out.println(end - start);
	}
	
	public abstract void code();
}

class CodeTest extends Computer{

	@Override
	public void code() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("aaa");
		}
	}
}
