package com.atguigu.exer;

public class CustomerAccountTest {
	public static void main(String[] args){
		
		Customer c = new Customer("Jane","Smith");
		Account a =new Account();
		a.setId(1000);
		a.setBlance(2000);
		a.setAnnualInterestRate(1.23);
		a.deposit(100);
		a.withdraw(960);
		a.withdraw(2000);
		c.setAccount(a);
		c.printCustomer();
		
		
	}
}
