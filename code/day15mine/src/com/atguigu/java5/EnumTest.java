package com.atguigu.java5;

public class EnumTest {
	
	public static void main(String[] args) {
		
		Season[] season = Season.values();
		for (int i = 0; i < season.length; i++) {
			System.out.println(season[i]);
		}
		
		Season spring = Season.valueOf("SPRING");
		System.out.println(spring);
	}
}

enum Season{
	
	SPRING,SUMMUER,AUTUM,WINTER;
}

