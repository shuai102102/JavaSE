package com.atguigu.java.domain;

public class NoteBook implements Equipment {
//	 model: String
//	 price: double
	
	private String model;
	private double price;
	
	public NoteBook() {
		
	}

	public NoteBook(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}