package com.atguigu.exer;

public class Boy {

	private String name;
	private int age;
	
	
	public Boy(){
		
	}
	
	public Boy(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void marry(Girl gril){
		System.out.println(gril.getName() + "我要娶你做老婆");
	}
	
	public void shout(){
		System.out.println("非你不娶");
	}
	
	
	/*
	 * 
	+setName(i: String)
	+getName(): String
	+setAge(i: int)
	+getAge(): int
	+marry(girl:Girl)
	+shout():void

	 */
	
	
}
