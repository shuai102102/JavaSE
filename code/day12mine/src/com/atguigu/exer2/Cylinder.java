package com.atguigu.exer2;

public class Cylinder extends Circle {
	
private double length;
	
	public Cylinder(){
		length = 1;
	}
	
	public Cylinder(double length,double radius){
		super(radius);
		this.length = length;
	}
	
	public double getLength(){
		return length;
	}
	
	public void setLength(double length){
		this.length = length;
	}
	
	public double findVolume(){
		return super.findArea() * length;
	}
	
	@Override
		public double findArea() {
			
			return super.findArea() * 2 + Math.PI * 2 *  getRadius() * getLength();
		}
}
