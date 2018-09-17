package com.atuguigu.exer2;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;

	public Account() {

	}

	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

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

	public void withdraw(double amount) {// 取钱

		if (amount > balance) {
			System.out.println("余额不足，取款失败");
			return;
		} 
		balance -= amount; // 将取款金额从余额减掉
		System.out.println("成功取出:" + amount);
	}

	public void deposit(double amount) {// 存钱
		if(amount < 0){ //校验
			
		}else{
			balance += amount;
			System.out.println("成功存入:" + amount);
		}
		
	}

}
