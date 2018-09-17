package com.atguigu.exer;

/*
 *  1.(1)定义一个ManKind类，包括
成员变量int sex和int salary；
方法void manOrWomen()：根据sex的值显示“man”(sex==1)或者“women”(sex==0)；
方法void employeed()：根据salary的值显示“no job”(salary==0)或者“ job”(salary!=0)。
  

 */
public class ManKind {

	int sex;
	int salary;

	public void manOrWomen(){
		if(sex == 1){
			System.out.println("man");
		}else if(sex == 0){
			System.out.println("women");
		}
	}
	
	public void employeed(){
		if(salary == 0){
			System.out.println("no job");
		}else{
			System.out.println("job");
		}
	}
}
