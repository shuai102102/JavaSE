package com.atguigu.java4;

public class ITXiaoMi implements Boss{

	private Boss boss;
	
	public ITXiaoMi(Boss boss){
		this.boss = boss;
	}

	@Override
	public void meeting() {
		System.out.println("-----代理开始了-------");
		boss.meeting();
		System.out.println("-----代理结束了-------");
		
	}

	@Override
	public void eat() {
			System.out.println("-----代理开始了-------");
			boss.eat();
			System.out.println("-----代理结束了-------");
	}
	
}
