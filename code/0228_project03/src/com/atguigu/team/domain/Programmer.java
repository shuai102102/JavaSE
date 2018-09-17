package com.atguigu.team.domain;

public class Programmer extends Employee {

	/*
	 * - memberId : int
		 status: Status
		 equipment: Equipment

	 */
	private int memberId; //成员id
	private Status status = Status.FREE; //状态
	private Equipment equipment; //设备
	
	public Programmer(){
		
	}
	
	public Programmer(int id,String name,double salary,int age,Equipment equipment){
		super(id, name, salary, age);
		this.equipment = equipment;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
	@Override
	public String toString() {
		return getEmployeeInfo() + "\t" + "程序员" + "\t" + status + "\t\t\t" + equipment.getDescription();
	}
	
	
	public String getMemberInfo(){
		return memberId + "/" + getId() + "\t" + getName() + "\t" 
					+ getAge() + "\t" + getSalary() + "\t程序员";
	}
	
}
