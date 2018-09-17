package com.atguigu.java;


/*
 * 
 * 总结：
 * 		一个类创建多个对象，多个对象各自拥有一份属性。
 * 		如果给其中的一个对象的属性赋值并不会影响到其它对象的属性的值。
 */
class Person{
	
	//属性
	int age;
	String name;
	
	
	//方法
	public void say(){
		System.out.println(age + name + "人说话了");
	}
	
}