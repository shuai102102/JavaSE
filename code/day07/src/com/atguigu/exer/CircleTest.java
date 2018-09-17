package com.atguigu.exer;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.radius = 1;
		System.out.println(circle.getArea());
		
		Circle circle2 = new Circle();
		circle2.radius = 1;
		
		System.out.println(circle.getArea() + circle2.getArea());
	}
}

/*
 * 
 * 如何设计方法选择是否有返回值？重点看返回值需不需要进行其它的使用
 */
class Circle{
	
	double radius;
	
	public double getArea(){
		//return 3.14 * radius * radius;
		return Math.PI * radius * radius;
	}
	
	/*
	public void printArea(){
		System.out.println(Math.PI * radius * radius);
	}
	*/
	
	/*
	 * 
	 * 设计不合理
	 */
	/*
	public double getArea(double radius){
		return Math.PI * radius * radius;
	}
	*/
	
}
