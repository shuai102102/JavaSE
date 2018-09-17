package com.atguigu.java4;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void test(){
		
		ITXiaoMi itXiaoMi = new ITXiaoMi(new BigBoss());
		itXiaoMi.meeting();
	}
}
