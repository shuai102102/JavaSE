package com.atguigu.exer;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Account(){
		
	}
	
	public Account(int id,double balance,double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	//alt + shift + s
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	
	public double getMonthlyInterest(){ //获取月利率
		return annualInterestRate / 12;
	}
	//取款
	public void withdraw (double amount){
		if(amount > balance){
			System.out.println("取款失败");
		}else{
			balance -= amount;
			System.out.println("取款成功，取款金额:" + amount);
		}
		System.out.println("余额为:" + balance);
	}
    //	存款
	public void deposit (double amount){
		
		balance += amount;
		System.out.println("存款成功，余额为:" + balance);
	}
	

}
