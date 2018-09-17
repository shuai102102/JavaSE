package com.atguigu.exer;

public class Girl {

	private String name;
	private int age;
	
	
	/*
		+setName(i: String)
		+getName(): String
		+marry(boy:Boy)
		+compare(girl:Girl)

	 */
	public Girl(){
		
	}
	
	public Girl(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void marry(Boy boy){
		if(boy.getAge() < 18){
			System.out.println("小屁孩一边玩去");
		}else if(boy.getAge() < 28){
			System.out.println("我们还是先恋爱吧");
		}else{
			System.out.println(this.name +"：我们结婚吧");
			boy.marry(this);
		}
	}
	
	public void compare(Girl girl){
		if(this.age > girl.age){
			System.out.println(this.name + "比不上你" + girl.getName());
		}
	}
}
