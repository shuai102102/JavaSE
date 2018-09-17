package com.atguigu.exer;

public class Circle extends GeometricObject {

	private double radius;
	
	public Circle(){
		super();
		this.radius = 1.0;
		/*
		 * 初始化对象的color属性为“white”，weight属性为1.0，radius属性为1.0。
		 */
	}
	
	public Circle(double radius){
		/*
		 * 初始化对象的color属性为“white”，weight属性为1.0，radius根据参数构造器确定。
		 */
		super();
		this.radius = radius;
	}
	
	public Circle(double radius,String color,double weight){
		super(color,weight);
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
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		
		if(obj instanceof Circle){
			Circle c = (Circle)obj;
			return this.radius == c.radius;
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		return "圆的半径：" + radius;
	}
}
