package com.atguigu.exer2;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(){
		radius = 1;
	
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double findArea(){
		return Math.PI * radius * radius;
	}
	
}
