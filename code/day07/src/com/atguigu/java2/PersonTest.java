package com.atguigu.java2;

/*
 * 
 * 匿名对象：一般情况下我们将匿名对象作为实参进行传递
 */
public class PersonTest {

	public static void main(String[] args) {
		
		Person2 person2 = new Person2();
		person2.name = "小龙哥";
		person2.show();
		
		Student stu = new Student();
		person2.say2(stu);
		person2.say2(new Student()); //将匿名对象作为实参进行传递
		
		//匿名对象
		new Person2().show();
		new Person2().name = "小泽老师";
		
		
	}
}

class Person2{
	
	String name;
	
	public void show(){
		System.out.println("小龙哥真帅！！！");
	}
	
	public void say(){
		System.out.println("有人说小龙哥真帅");
		
	}
	
	
	/*
	 * 值传递：
	 */
	public void say2(Student stu){
		stu.age = 18;
		stu.say();
		
	}
}
