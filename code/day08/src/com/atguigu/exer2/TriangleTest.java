package com.atguigu.exer2;

/*
 * 编写两个类，TriAngle和TriAngleTest，其中TriAngle中声明私有的底边长base和高height，
 * 同时声明公共方法访问私有变量。此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。

 * 
 */
public class TriangleTest {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(3,6);
		System.out.println(triangle.getTriangleArea());
	}
}

class Triangle{
	
	private int base;
	private int height;
	
	public Triangle(){
		
	}
	
	public Triangle(int b,int h){
		base = b;
		height = h;
	}
	
	
	//获取三角形的面积
	public double getTriangleArea(){
		//return base * height / 2;
		return getBase() * getHeight() / 2;
	}
	
	
	public void setBase(int b){
		base = b;
	}
	
	public int getBase(){
		return base;
	}
	
	public void setHeight(int h){
		height = h;
	}
	
	public int getHeight(){
		return height;
	}
}
