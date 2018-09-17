package com.atguigu.team.domain;

public class Printer implements Equipment {

	private String name;
	private String type;
	
	
	public Printer(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}


	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return name +"("+ type + ")";
	}

}
