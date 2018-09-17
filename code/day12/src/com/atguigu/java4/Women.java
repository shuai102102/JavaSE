package com.atguigu.java4;

public class Women extends Person {

	String name = "women";
	boolean isShopping = true;
	
	@Override
	public void say() {
		
		System.out.println("美女说话娇滴滴");
	}
	
	@Override
	public void run() {
		
		System.out.println("女人走路晃屁股");
	}
	
	//女人独有的方法
	public void shopping(){
		System.out.println("女人逛街买买买");
	}
}
