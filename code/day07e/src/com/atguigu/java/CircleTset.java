package com.atguigu.java;

public class CircleTset {
	
	public static void main(String [] args){
	
	Circle c =new Circle();
	c.r = 2 ;
	c.CircleArea();
	
	}
}

class Circle{
	
	double r ;
	void CircleArea(){
		
		double Area = Math.PI * r *r;
		System.out.println(Area);
	}
}
