package com.atguigu.exer4;

public class Bank {

	private Customer[] customers;
	private int numberOfCustomer; //统计当前有多少个用户
	
	public Bank(){
		//初始化数组
		customers = new Customer[10];
	}
	
	/*
	 * 添加用户
	 */
	public void addCustomer(String firstName,String lastName){
		Customer customer = new Customer(firstName, lastName);
//		customers[numberOfCustomer] = customer;
//		numberOfCustomer++;
		
		customers[numberOfCustomer++] = customer;
	}
	
	/*
	 * 获取当前用户的数量
	 */
	public int getNumOfCustomers(){
		return numberOfCustomer;
	}
	
	/*
	 * 根据index获取指定的用户
	 * 
	 * 如果返回值是null说明没有找到该用户
	 */
	public Customer getCustomer(int index){
		//索引值的范围应该在 0 - (numberOfCustomer-1)
		if(index >= 0 && index < numberOfCustomer){
			return customers[index];
		}else{
			return null;
		}
	}
}
