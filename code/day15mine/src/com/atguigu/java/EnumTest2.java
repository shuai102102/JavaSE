package com.atguigu.java;

public class EnumTest2 {

	public static void main(String[] args) {
		Season2 a = Season2.AUTUM;
		
		switch (a) {
		
		case AUTUM:
			System.out.println("我是秋天");
			break;
			
		case SUMMER:
			System.out.println("我是夏天");
			break;
		}
	}
}


enum Season2{
	
	//创建四个对象
	/*
	 * 1.对象必须放在首行，多个对象之间用“，”隔开，最后以“；”结尾
	 * 2.构造器只能用private
	 * 3.声明对象只写对象名即可，如果有参数直接（形参列表）。
	 * 
	 * 
	 */
	SPRING,SUMMER,AUTUM,WINTER;
}



