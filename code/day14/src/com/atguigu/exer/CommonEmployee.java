package com.atguigu.exer;

public class CommonEmployee extends Employee {

	
	public CommonEmployee(String  name,int id,double salary){
		super(name, id, salary);
	}
	@Override
	public void work() {
		System.out.println(name + " " + id + " " + salary);
	}

}
