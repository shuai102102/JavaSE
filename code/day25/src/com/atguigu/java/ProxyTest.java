package com.atguigu.java;

import org.junit.Test;

/*
 * 
 * 静态代理 ： 代理设计模式
 * 
 */
public class ProxyTest {

	@Test
	public void test(){
		
		XiaoMi itXiaoMi = new XiaoMi(new ITBoss());
		
		itXiaoMi.eat();
	}
}
