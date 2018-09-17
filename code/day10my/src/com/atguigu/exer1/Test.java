package com.atguigu.exer1;

public class Test {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addCustomer("小","帅帅");
		Customer xss = new Customer(); 
		xss=bank.getCustomer(0);
		System.out.println(xss.getFirstName()+xss.getLastName());
		//Account account = new Account(2000);
		xss.setAccount(new Account(2000));//xss.setAccount(Account);
		Account	account = xss.getAccount();//
		account.deposit(200);
		account.withDraw(1000);
		
		System.out.println(account.getBalance());
		
		//给“小星星”添加一个用户
		bank.addCustomer("小", "星星");
		//System.out.printlnbank.getCustomer(0)getFirstName()+bank.getCustomer(1).getLastName());
		Customer xxx = bank.getCustomer(bank.getNumOfCustomer()-1);//bank.getNumOfCustomer()
		xxx.setAccount(new Account(200000));
		System.out.println(xxx.getAccount().balance);
		
	}
}
