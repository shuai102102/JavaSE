package com.atguigu.exer;

public class Manager extends Employee {

	double bonus;
	
	public Manager(String name,int id,double salary,double bonus){
		super(name, id, salary);
		this.bonus = bonus;
	}
	
	@Override
	public void work() {
		System.out.println(name + " " + id + " " + salary + " " + bonus);
	}

	
}
