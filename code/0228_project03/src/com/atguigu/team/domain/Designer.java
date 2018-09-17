package com.atguigu.team.domain;

public class Designer extends Programmer {
	
	/*
	 * bonus : double
	 */
	private double bonus;
	
	public Designer(){
		
	}
	
	public Designer(String name,int id,int age,double salary,Equipment equipment,double bonus){
		super(id, name, salary, age, equipment);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return getEmployeeInfo() + "\t" + "设计师" + "\t" + getStatus() 
				+ "\t" + bonus + "\t\t" + getEquipment().getDescription();
	}
	
	@Override
	public String getMemberInfo(){
		return getMemberId() + "/" + getId() + "\t" + getName() + "\t" 
				+ getAge() + "\t" + getSalary() +  "\t设计师\t" + getBonus();
	}

}
