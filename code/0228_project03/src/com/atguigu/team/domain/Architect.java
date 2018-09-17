package com.atguigu.team.domain;

public class Architect extends Designer {

	private int stock;
	
	public Architect(){
		
	}
	
	public Architect(String name,int age,double salary,int id,
			Equipment equipment,double bonus,int stock){
		super(name, id, age, salary, equipment, bonus);
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return getEmployeeInfo() + "\t" + "架构师" + "\t" + getStatus()
		+ "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
	}
	
	@Override
	public String getMemberInfo(){
		return getMemberId() + "/" + getId() + "\t" + getName() + "\t" 
				+ getAge() + "\t" + getSalary() +  "\t架构师\t" + getBonus() + "\t" + getStock();
	}
	
}
