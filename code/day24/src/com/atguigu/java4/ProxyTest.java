package com.atguigu.java4;

import org.junit.Test;

/*
 * 
 * 静态代理 ： 代理设计模式
 * 
 */
public class ProxyTest {

	@Test
	public void test(){
		
		ITXiaoMi itXiaoMi = new ITXiaoMi(new ITBoss());
		
		itXiaoMi.eat();
	}
}
