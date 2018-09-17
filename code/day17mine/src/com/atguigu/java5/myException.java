package com.atguigu.java5;

public class myException extends RuntimeException{
	
	private static final long serialVersionUID = 22583144564656007L;
	
	public myException(){
		
	}
	
	public myException(String n){
		super(n);
	}
}
