package com.atguigu.java;

/*
 * 
 * 使用enum关键字定义枚举类
 */
public class EnumTest2 {

	public static void main(String[] args) {
		
		Season2 s = Season2.AUTUMN;
		
		switch (s) {
		case AUTUMN:
			System.out.println("我是秋天");
			break;
		case SUMMER:
			break;
		}
	}
}

/*
 * 枚举类 : enum 类名{}
 */
enum Season2 {

	// 创建四个对象
	/*
	 * 1.对象必须放在首行，多个对象之间用","隔开，最后以";"结尾
	 * 2.构造器只能用private
	 * 3.声明对象 只写对象名即可，如果有参数直接（形参列表）.
	 * 
	 * 
	 */
	SPRING,SUMMER,AUTUMN,WINTER;
	
}