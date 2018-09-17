package com.atguigu.java2;

/*
 * 
 *  JavaBeen
 *  1.类是公共的
	2.有一个无参的公共的构造器
	3.有属性，且有对应的get、set方法
 */
public class Student {

	private String name;
	private int id;
	private int state;
	
	public Student(){
		
	}
	
	public Student(String n){
		name = n;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public void show(){
		
	}
	
}
