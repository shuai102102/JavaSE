package com.atguigu.java;

/*
 * 
 * 枚举类 ： 一个类的对象是可数多个的，这类对象我们就叫做枚举类
 * 
 *  1.如何自定义枚举类
	2.如何使用关键字enum定义枚举类
	3.枚举类的主要方法
	4.实现接口的枚举类

 */
public class EnumTest {

	public static void main(String[] args) {
		
		Season spring = Season.SPRING;
		System.out.println(spring.getNAME() + spring.getDESC());
		
		Season winter = Season.WINTER;
		System.out.println(winter.getNAME() + winter.getDESC());
	}
	
	
	public void show(){
		System.out.println("大哥让你测一下");
	}
}

/*
 * 自定义枚举类
 *  Season类：
	SPRING;
	SUMMER;
	AUTUMN;
	WINTER;

 * 
 */

class Season{
	private final String NAME;
	private final String DESC;
	//私有化构造器
	private Season(String name,String desc){
		this.NAME = name;
		this.DESC = desc;
	}
	
	//创建四个对象
	public static final Season SPRING = new Season("春天","春眠不觉晓");
	public static final Season SUMMER = new Season("夏天","夏天蚊子咬");
	public static final Season AUTUMN = new Season("秋天","秋天多吃肉");
	public static final Season WINTER = new Season("冬天","冬天就长膘");
	
	
	public String getNAME() {
		return NAME;
	}
	public String getDESC() {
		return DESC;
	}
	
	
	
	
}
