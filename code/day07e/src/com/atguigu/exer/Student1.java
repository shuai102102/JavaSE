package com.atguigu.exer;


class Student1{
	
	String name;
	int age;
	int sex;
	
	void Study(){
		System.out.println("studying");
	}
	
	int addAge(int a){
		a += age;
		return a;
	}
	
	void sexing(){
		if (sex == 1){
		System.out.println("男");
		}else{
			System.out.println("女");
		}
		
	}
}