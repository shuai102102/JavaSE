package com.atguigu.java;


public class ITBoss implements Boss {

	public void meeting(){
		System.out.println("IT老板要开会");
	}
	
	public void eat(){
		System.out.println("IT老板要吃饭");
		
		meeting();
	
		
	}
}
