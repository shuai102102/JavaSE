package com.atguigu.java2;

public class StaticTest2 {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.name = "aaa";
		stu.show();
		
		Student stu2 = new Student();
		stu2.name = "bbb";
		stu2.show();
		
		Student stu3 = new Student();
		stu3.name = "ccc";
		stu3.show();
	
		//统计创建了多少个对象
		//System.out.println(Student.getCount());
		
	}
}


//思考？如何统计创建了多少个对象
class Student{
	
	String name;
	int id;
	
	static int count;
	
	public Student(){
		id = ++count;
		
	}
	
	
	public static int getCount(){
		return count;
	}
	
	public void show(){
		System.out.println(id + " = " + name);
	}
}
