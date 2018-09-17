package com.atguigu.exer;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle(1.0, "red", 2.0);
		Circle circle2 = new Circle(1.0, "blue", 2.0);
		System.out.println(circle.equals(circle2));
		System.out.println(circle);
		System.out.println(circle.findArea());
	}
}
