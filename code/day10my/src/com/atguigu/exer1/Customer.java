package com.atguigu.exer1;

public class Customer {
	String firstName;
	String lastName;
	Account account;
	public Customer(){
		
	}
	
	public Customer(String f,String l){
		firstName = f;
		lastName = l;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public Account getAccount(){
		return account;
	}
	
	void setAccount(Account account){
		this.account = account;
	}
}
