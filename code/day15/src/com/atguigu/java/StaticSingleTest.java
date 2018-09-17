package com.atguigu.java;

/*
 * 
 * 单例模式：使用static关键字实现
 */
public class StaticSingleTest {

}


class Bank{
	private Bank(){}
	
	private static Bank bank = null;
	
	static{ //不可以使用非静态代码块，因为非静态代码是随着对象的创建而加载的
		bank = new Bank();
	}
	
	public static Bank getInstance(){
		
		return bank;
	}
}
