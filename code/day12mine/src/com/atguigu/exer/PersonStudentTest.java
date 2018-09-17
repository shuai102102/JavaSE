package com.atguigu.exer;

public class PersonStudentTest {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.age  = 14;
		student .computer = 100;
		student .english = 100;
		student .math  = 100;
		student .name = "小龙哥";
		student .number = 666666;
		
		System.out.println(student .aver());
		System.out.println(student .min ());
		System.out.println(student .max ());
		System.out.println(student .toString());
	}
	
}
