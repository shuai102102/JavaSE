package com.atguigu.exer1;

public class Bank {
	private Customer customers[];
	private int numOfCustomer;
	public Bank(){
		customers = new Customer[10];
	}
	
	public void addCustomer(String f,String l){
		customers[numOfCustomer++] =new Customer(f,l);
	}
	
	public int getNumOfCustomer(){
		return numOfCustomer;
	}
	
	public Customer getCustomer(int index){
		if (index >=0 && index <= numOfCustomer) {
			return customers[index];
		}else {
			return null;
		}
		
	}
}
