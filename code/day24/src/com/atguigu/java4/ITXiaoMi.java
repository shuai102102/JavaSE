package com.atguigu.java4;

public class ITXiaoMi implements Boss {

	private ITBoss itBoss;
	
	public ITXiaoMi(ITBoss itBoss){
		this.itBoss = itBoss;
	}
	
	public void meeting(){
		System.out.println("-----代理开始了-------");
		itBoss.meeting();
		System.out.println("-----代理结束了-------");
	}
	
	public void eat(){
		System.out.println("-----代理开始了-------");
		itBoss.eat();
		System.out.println("-----代理结束了-------");
	}
}
