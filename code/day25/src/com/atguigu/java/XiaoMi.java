package com.atguigu.java;

public class XiaoMi implements Boss {

	private Boss Boss;
	
	public XiaoMi(Boss Boss){
		this.Boss = Boss;
	}
	
	public void meeting(){
		System.out.println("-----代理开始了-------");
		Boss.meeting();
		System.out.println("-----代理结束了-------");
	}
	
	public void eat(){
		System.out.println("-----代理开始了-------");
		Boss.eat();
		System.out.println("-----代理结束了-------");
	}
}
