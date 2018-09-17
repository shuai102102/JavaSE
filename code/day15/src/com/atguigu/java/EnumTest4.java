package com.atguigu.java;

/*
 * 
 * 枚举类实现接口
 */
public class EnumTest4 {

	public static void main(String[] args) {
		
		Season4.SPRING.show();
		Season4.SUMMER.show();
		Season4.AUTUMN.show();
		Season4.WINTER.show();
	}
}

enum Season4 implements Desc{
	
	SPRING{
		@Override
		public void show() {
			System.out.println("我是春天");
		}
	},
	SUMMER{
		@Override
		public void show() {
			System.out.println("我是夏天");
		}
	},
	AUTUMN{
		@Override
		public void show() {
			System.out.println("我是秋天");
		}
	},
	WINTER{
		@Override
		public void show() {
			System.out.println("我是冬天");
		}
	};
	
}

interface Desc{
	void show();
}
