package com.atguigu.java.domain;

public class Architect extends Designer{

	int stock;
	
	public Architect() {
		
	}

	public Architect(int id, String name, int age, double salary, 
			Equipment equipment, double bonus,int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock  = stock;
	}
	
	
}
