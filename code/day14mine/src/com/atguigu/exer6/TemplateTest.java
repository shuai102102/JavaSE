package com.atguigu.exer6;

public class TemplateTest {
	
	public static void main(String[] args) {
		computer co = new CodeTest();
		co.codeTime();
	}
}

abstract class computer{
	public void codeTime(){
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	public abstract void code();
}

class CodeTest extends computer{
	
	public void code(){
		for (int i = 0; i < 100; i++) {
			System.out.println("aaa");
		}
	}
}