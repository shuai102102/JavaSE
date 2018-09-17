package com.atguigu.exer4;

public class Test {

	public static void main(String[] args) {
		
		//创建一个银行
		Bank bank = new Bank();
		//给银行填加用户
		bank.addCustomer("小", "泽泽");
		//从银行获取一个人
		Customer xiaozeze = bank.getCustomer(0);
		//给用户添加一个账户
		xiaozeze.setAccount(new Account(2000));
		//对小泽泽的账户进行操作
		Account account = xiaozeze.getAccount();
		account.deposit(2000);
		double balance = account.getBalance();
		System.out.println("小泽泽的余额" + balance);
		
		
		
		//给银行填加小龙哥用户
		bank.addCustomer("小","龙哥");
		Customer xiaoloongge = bank.getCustomer(1);
		xiaoloongge.setAccount(new Account(2000000));
		System.out.println(xiaoloongge.getAccount().getBalance());
		
	}
}
