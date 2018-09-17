package com.atguigu.java.domain;

public class Programmer extends Employee {

//	 memberId : int
//	 status: Status
//	 equipment: Equipment

	private int meberId;
	private Status status;
	private Equipment equipment;
	
	public Programmer() {
	}

	public Programmer(int id,String name, int age, double salary, Equipment equipment) {
		super(id, name, age, salary);
		
		this.equipment = equipment;
	}
	
	
}
