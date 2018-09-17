package com.atguigu.java;

/*
 * 
 * 枚举类实现接口
 */

public class EnumTest4 {

	public static void main(String[] args) {
		
		Season4.SPRING.show();
		Season4.WINTER.show();
	}
}


enum Season4 implements DESC{
	
	SPRING{
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("春天");
		}
	},
	WINTER{
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("冬天");
		}
	};
	
}


interface DESC{
	void show();
}