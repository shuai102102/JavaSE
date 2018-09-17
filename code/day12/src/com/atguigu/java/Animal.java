package com.atguigu.java;

public class Animal{
	
	private String namePrivate = "namePrivate";
	String name = "name";
	protected String nameProtected = "nameProtected";
	public String namePublic = "namePublic";
	
	
	private void sayPrivate(){
		System.out.println("sayPrivate");
	}
	
	void say(){
		System.out.println("say");
	}
	
	protected void sayProtected(){
		System.out.println("sayProtected");
	}
	
	public void sayPublic(){
		System.out.println("sayPublic");
	}
	
	/*
	 * 在同一个类中所有权限修饰符都可以访问
	 */
	public void show(){
		System.out.println(namePrivate);
		System.out.println(name);
		System.out.println(nameProtected);
		System.out.println(namePublic);
		
		say();
		sayPrivate();
		sayProtected();
		sayPublic();
	}
	
}
