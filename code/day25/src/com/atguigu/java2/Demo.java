package com.atguigu.java2;

public class Demo {

	public static void main(String[] args) {
		
		ProxyTest proxyTest = new ProxyTest();
		
		Boss boss = (Boss) proxyTest.getObject(new ITBoss());
		
		boss.eat();
		
		
		Boss boss2 = (Boss) proxyTest.getObject(new BigBoss());
		boss2.eat();
		
	}
}
