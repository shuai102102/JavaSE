package com.atguigu.exer2;

public class Cylinder extends Circle {

	private double length;
	
	/*
	 *  Cylinder():  构造器,将length属性初始化为1
		+setLength(double length):void
		+getLength():double
		+findVolume() :double   计算圆柱体积

	 */
	
	public Cylinder(){
		length = 1;
	}
	
	public Cylinder(double length,double radius){
		super(radius);
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	/*
	 * 圆的体积   圆的面积 * 高
	 */
	public double findVolume(){
		return super.findArea() * length;
	}
	
	/*
	 * 圆柱的表面积  Math.PI * radius * radius * 2 两个圆的面积
	 * 圆的周长 * 高   Math.PI * 2 * radius * length
	 */
	@Override
	public double findArea() {
		
		//return Math.PI * getRadius() * getRadius() * 2 + Math.PI * 2 * getRadius() * getLength();
		return super.findArea() * 2 + Math.PI * 2 * getRadius() * getLength();
	}
	
	
}
