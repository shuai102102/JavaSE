package com.atguigu.java4;

public class ITBoss implements Boss{

	@Override
	public void meeting() {
		System.out.println("ITBoss去开会");
	}

	@Override
	public void eat() {
		System.out.println("ITBoss去吃饭");
	}

	
}
