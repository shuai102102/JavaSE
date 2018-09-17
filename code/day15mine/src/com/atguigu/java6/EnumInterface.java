package com.atguigu.java6;

public class EnumInterface {
	
	public static void main(String[] args) {
		
	Season.SPRING.show();
	Season.SUMMER.show();
	Season.AUTUMN.show();
	Season.WINTER.show();
	
	
	}
	
	public void doo(){
		System.out.println("sys");
	}
}

enum Season implements Desc{
	
	SPRING{
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("我是春天");
		}	
		
	},
	SUMMER{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("我是夏天");
	
			}
	},
		AUTUMN{
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("我是秋天");
			
					}
			}
		,WINTER{
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("我是冬天");
			
					}
			};

	
}

interface Desc{
	void show();
}

class Person{
	public void say(){
		System.out.println("老子让你测一下");
	}
}

