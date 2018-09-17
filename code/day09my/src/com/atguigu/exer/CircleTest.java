package com.atguigu.exer;

import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args){
		
		Circle c = new Circle();
		Scanner s = new Scanner(System.in) ;
		int time = s.nextInt();
		PassObject p = new PassObject();
		p.PrintAreas(c, time);
		System.out.println("now raduis is: "+(double)time);
	}
 }
		
class PassObject{
	
	public void PrintAreas(Circle c, int time){
		 System.out.println("radius\t\tArea");
		for(int i=1; i<time; i++){
			  c.setRaduis(i);
			  System.out.println(i+"\t\t"+c.findArea());
		}
	}
}	

	
class Circle {
	
	double raduis;
	double findArea(){
		double s;
		s = Math.PI*raduis*raduis;
		return s;
	}
	
	void setRaduis(double x){
		this.raduis = x;
	}
	
	double getRaduis(){
		return this.raduis;
	}
}