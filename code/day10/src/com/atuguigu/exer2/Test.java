package com.atuguigu.exer2;

public class Test {

	public static void main(String[] args) {
		/*
写一个测试程序。
（1）	创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
（2）	对Jane Smith操作。
存入 100 元，再取出960元。再取出2000元。
打印出Jane Smith 的基本信息

		 */
		
		Customer customer = new Customer("Jane","Smith");
		
		customer.setAccount(new Account(1000, 2000, 0.0123));//给用户设置一个账户
		
		
		//获取用户的账户
		Account account2 = customer.getAccount();
		account2.deposit(100);
		account2.withdraw(960);
		account2.withdraw(2000);
		
		System.out.println("Customer [" + customer.getFirstName() + customer.getLastName() + "] has a account: "
				+ "id is " + account2.getId()  +","
				+ " annualInterestRate is " + account2.getAnnualInterestRate() * 100 + "％,"
						+ " balance is " + account2.getBalance());
		
	
	}
}
