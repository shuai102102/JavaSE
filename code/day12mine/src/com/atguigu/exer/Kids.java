package com.atguigu.exer;

public class Kids extends ManKind {
	
	int yearsOld;
	
	public void printAge(){
		System.out.println(yearsOld);
		
	}
	
	@Override
	public void employeed() {
		super.employeed();
		System.out.println("Kids should study and no job");
	}
	
	public static void main(String[] args) {
		
		Kids someKid = new Kids();
		someKid.salary = 100000;
		someKid.sex = 1;
		
		someKid.employeed();
		someKid.manOrWomen();
		
	}
	
}
