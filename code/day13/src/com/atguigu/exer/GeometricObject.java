package com.atguigu.exer;

public class GeometricObject {

	protected  String  color; 
	protected  double  weight;
	
	public GeometricObject(){
		/*
		 * 初始化对象的color属性为“white”，weight属性为1.0
		 */
		color = "white";
		weight = 1.0;
	}
	
	public GeometricObject(String color,double weight){
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
