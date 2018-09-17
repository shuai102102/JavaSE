package com.atguigu.exer;

/*
 * 
 *  (2)定义类Kids继承ManKind，并包括
成员变量int yearsOld；
方法printAge()打印yearsOld的值。
   (3)在Kids类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法。
 */
public class Kids extends ManKind {

	int yearsOld;
	
	public void printAge(){
		System.out.println(yearsOld);
	}
	
	@Override
	public void employeed() {
		super.employeed(); //调用父类中的方法
		System.out.println("Kids should study and no job");
	}
	
	public static void main(String[] args) {
		//ctrl + 1
		Kids someKid = new Kids();
		someKid.salary = 100000;
		someKid.sex = 1;
		
		someKid.employeed();
		someKid.manOrWomen();
	}
}
