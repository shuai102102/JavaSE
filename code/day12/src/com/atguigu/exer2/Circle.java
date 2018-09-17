package com.atguigu.exer2;

public class Circle extends Shape {

	private double radius;

	/*
	 *  Circle(): 构造器,将radius属性初始化为1
		+setRadius(double radius) : void
		+getRadius(): double
		+findArea():double  计算圆的面积

	 */
	
	public Circle(){
		radius = 1;
	}
	
	public Circle(double radius){
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double findArea(){
		return Math.PI * radius * radius;
	}
	
}
