package com.atguigu.exer;

public class StudentTest1 {

	public static void main(String[] args){
		
		Student1 s = new Student1();
		s.name = "王帅";
		s.age = 20;
		s.sex = 1;
		
		System.out.println(s.addAge(2));
		s.Study();
		s.sexing();
		
	}
}
