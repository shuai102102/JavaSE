package com.atguigu.java.domain;

public class Designer extends Programmer{

	private double bonus;
	
	public  Designer() {
		
	}

	public Designer(int id, String name, int age, double salary,  Equipment equipment,double bonus) {
		super(id, name, age, salary, equipment);
		this.bonus = bonus;
	}
	
}
