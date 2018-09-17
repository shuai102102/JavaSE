package com.atguigu.java;

import java.io.Serializable;

public class Address implements Serializable{
	
	String id;
	String name;
	
	public Address(){
		
	}
	
	public Address(String id,String name){
		this.id = id;
		this.name = name;
		
	}
	
	public void say(){
		System.out.println(id + name);
	}
}
