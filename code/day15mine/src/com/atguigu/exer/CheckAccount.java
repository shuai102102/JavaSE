package com.atguigu.exer;

public class CheckAccount extends Account{
	
	double overdraft; 
	
	public CheckAccount(int id,double balance,double annualInterestRate,double overdraft) {
		super(id, balance,annualInterestRate);
		this.overdraft = overdraft;
		
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	@Override
	public void withdraw(double amount) {
		/*
		 *  如果（取款金额<账户余额），
			可直接取款
			如果（取款金额>账户余额），
			计算需要透支的额度
			判断可透支额overdraft是否足够支付本次透支需要，如果可以
				将账户余额修改为0，冲减可透支金额
			如果不可以
				提示用户超过可透支额的限额

		 */
		if (amount <= getBalance()) {
			setBalance(getBalance() - amount);
		}else{
			double draftMoney = amount - getBalance();
			if(draftMoney > overdraft){
				System.out.println("超过透支的额度，取款失败");
			}else{
				overdraft -= draftMoney;
				setBalance(0.0);
			}
		}
	}
}




