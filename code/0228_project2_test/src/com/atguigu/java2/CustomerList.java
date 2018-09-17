package com.atguigu.java2;

public class CustomerList {
	
	Customer[] customers;
	int total;
	//初始化数组
	public CustomerList(int totalCustomer){
		customers = new Customer[totalCustomer]; 
	}
	//添加用户
	public boolean addCustomerList(Customer customer){
		if (customer == null) {
			return false;
		}
		if (total >= customers.length) {
			return false;
		}
		customers[total++] = customer;
		return true;			
	}
	
	//更改用户
	public boolean replaceCustomer(int index, Customer cust){
		if (index<0 || index>=total) {
			return false;
		}
		if (cust== null) {
			return false;
		}
		customers[index] = cust;
		return true;
	}
	
	//删除用户
	public boolean deleteCustomer(int index){
		if (index<0 || index>total-1) {
			return false;
		}
		for (int i = index; i < total-1; i++) {
			 customers[i] = customers[i+1];
		}
		customers[--total] = null;
		return true;
	}
	
	//获取所有用户数组
	public Customer[] getAllCustomers(){
		Customer[] cus = new Customer[total];
		for (int i = 0; i < cus.length; i++) {
			  cus[i] = customers[i];	
		}
		return cus;
	}
	
	//根据索引号返回对应用户
	public Customer getCustomer(int index){
		if (index<0 || index>=total) {
			return null;
		}
		return customers[index];
	} 

}
