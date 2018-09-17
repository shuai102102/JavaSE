package com.atguigu.exer;

public class Customer {
	
	private String firstName;
	private String lastName;
	private Account account;
	public Customer(String f,String l){
		firstName = f;
		lastName = l;
	}

	public String getFirstName(){
		return firstName;
	}
	public String getlastName(){
		return lastName;
	}
	
	public void setAccount(Account account){
		this.account = account;
	}
	
	public Account getAccount(){
		return account;
	}
	//Customer [Smith, Jane] has a account: id is 1000, 
	//annualInterestRate is 1.23％, balance is 1140.0
	public void printCustomer(){
		System.out.println("\tCustomer["+lastName+" "+firstName+"]has a account: id is "+account.getId()+",\nannualInterestRate is "+account.getAnnualInterestRate()+"％, balance is "+account.getBalance());
	}
}
