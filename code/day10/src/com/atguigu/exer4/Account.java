package com.atguigu.exer4;

public class Account {

	private double balance;
	
	public Account(){
		
	}
	
	public Account(double balance){
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	//存款
	public void deposit(double amt){
		
		if(amt > 0){
			balance += amt;
		}
	}
	
	//取款
	public void withdraw(double amt){
		
		if(amt > balance){
			System.out.println("余额不足");
		}else{
			balance -= amt;
			System.out.println("取款成功：取款 金额" + amt);
		}
	}
}
