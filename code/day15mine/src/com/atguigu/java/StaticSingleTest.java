package com.atguigu.java;

public class StaticSingleTest {

}



class Bank{
	private Bank(){
		
	}
	
	private static Bank bank = null;
	
	static {
		bank = new Bank();
	}
	
	public static Bank getInstance(){
		return bank;
	}
}