package com.atguigu.exer;

public class ManKind {
	
	int sex;
	int salary;
	
	public void manOrWomen(){
		if (sex == 1) {
			System.out.println("man");
			
		}else if(sex == 0) {
			System.out.println("women");
		}
	}
	
	public void employeed(){
		if(salary  == 0){
		System.out.println("no job");
		}
		else{
			System.out.println("job");
		}
	}
	
}
