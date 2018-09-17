package com.atguigu.exer;

import java.util.Scanner;

public class CircleTest1 {
	
	public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	Circle c = new Circle();
	c.r = s.nextDouble();
	System.out.println(c.CircleArea());
	}
}

 class Circle{
	
	double r ;
	double CircleArea(){
		
		double a = Math.PI*r*r;
		return a ;
	}
}