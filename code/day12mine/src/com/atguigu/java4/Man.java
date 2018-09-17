package com.atguigu.java4;

public class Man extends Person {
	
	boolean isSmoking = true;
	
	@Override
	public void say() {
		System.out.println("老男人说话很嚣张");
	}
	
	@Override
	public void run() {
		System.out.println("老男人跑步慢悠悠");
	}
	
	public void love(){
		System.out.println("老男人喜欢小波波");
	}
}
