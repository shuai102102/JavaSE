package com.atguigu.java;

/*
 * 
 * 权限修饰符 ：private 缺省的  protected  public
 * 
 * 
 */
public class LimitTest {

	public static void main(String[] args) {
		
		Limit limit = new Limit();
		System.out.println(limit.age);
		System.out.println(limit.ageProtected);
		System.out.println(limit.agePublic);
		
		limit.say();
		limit.sayProtected();
		limit.sayPublic();
		
	}
}

class Limit{
	
	public int agePublic = 3;
	protected int ageProtected = 2;
	private int agePrivate = 0;
	int age = 1;
	
	
	public void sayPublic(){
		System.out.println("sayPublic");
	}
	
	void say(){
		System.out.println("say");
	}
	
	protected void sayProtected(){
		System.out.println("sayProtected");
	}
	
	private void sayPrivate(){
		System.out.println("sayPrivate");
	}
	
	public void show(){
		System.out.println(age);
		System.out.println(agePrivate);
		System.out.println(ageProtected);
		System.out.println(agePublic);
		
		sayPublic();
		say();
		sayProtected();
		sayPrivate();
	}
}
