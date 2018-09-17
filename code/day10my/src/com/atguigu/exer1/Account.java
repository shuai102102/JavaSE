package com.atguigu.exer1;

class Account {
	
	double balance;
	Account(){
		
	}
	public Account (double balance){
		this.balance = balance;
	}
	
	double getBalance(){
		return balance;
	}
	
	void deposit(double amt){
		if(amt > 0){
			balance += amt;
			System.out.println("存款成功："+amt);
		}
	}
	
	void withDraw(double amt){
		if(amt <= balance){
			balance -= amt;
			System.out.println("取款成功，取款金额为："+amt);
		}else{
			System.out.println("取款失败，余额不足");
		}
	}
}
