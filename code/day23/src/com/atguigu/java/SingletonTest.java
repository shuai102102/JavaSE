package com.atguigu.java;

public class SingletonTest {

	/*
	 * 懒汉式 - 解决线程安全问题
	 */
	public static void main(String[] args) {

	}

}

/*
 * 
 * 懒汉式
 * 
 */
class Bank {
	// 第一步私有化构造器
	private Bank() {
	}

	private static Bank bank = null;

	public static Bank getInstance() {
		if(bank == null){
			synchronized (Bank.class) {
				if (bank == null) {
					bank = new Bank();
				}
			}
		}
		return bank;
	}
}
