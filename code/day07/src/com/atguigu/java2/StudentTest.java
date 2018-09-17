package com.atguigu.java2;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.name = "小泷老师";
		student.age = 26;
		student.interests = "拍电影";
		student.major = "演员";
		
		String info = student.say();
		System.out.println(info);
	}
}
