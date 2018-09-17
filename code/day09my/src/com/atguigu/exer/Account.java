package com.atguigu.exer;

public class Account {
	 private int id;
	 private double balance;
	 private double annualInterestRate;
	 //getter
	 public int getId(){
		 return id;
	 }
	 public double getBalance(){
		 return balance;
	 }
	 public double getAnnualInterestRate(){
		 return annualInterestRate;
	 }
	 //setter
	 public void setId( int id){
		 this.id = id;
	 }
	 public void setBlance( double balance){
		 this.balance = balance;
	 }
	 public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate =  annualInterestRate;
	 }
	 //取钱
	 public void withdraw (double amount){
		 if(balance<amount){
			 System.out.println("余额不足，取款失败");
		 }else{
		 balance -= amount;
		 System.out.println("成功取出："+amount);
		 }
	 }
	 //存钱
	 public void deposit (double amount){
		 balance += amount;
		 System.out.println("成功存入："+amount);
	 }
	 
}
