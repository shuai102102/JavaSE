package com.atguigu.Demo;

import org.junit.Test;

public class DemoTest {

	@Test
	public void test(){
		A a = new Demo();
		B b = (B) a;
		b.say();
	}
}
