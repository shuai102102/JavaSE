package com.atguigu.java2;

/*
 * 
 * 对数组进行增删改查
 */
public class CustomerList {

	/*
	 * Customer[] customers：用来保存客户对象的数组 int total = 0 ：记录已保存客户对象的数量
	 * 
	 */

	private Customer[] customers;
	private int total = 0;



	public CustomerList(int totalCustomer) {
		// 初始化数组
		customers = new Customer[totalCustomer];
	}

	/**
	 * 添加用户
	 * @param customer 新用户
	 * @return 添加成功返回true 添加失败返回false
	 */
	public boolean addCustomer(Customer customer) {
		//校验 
		//先判断customer是否为空
		if(customer == null){
			return false;
		}
		if(total >= customers.length){
			return false;
		}
//		customers[total] = customer;
//		total++;
		
		customers[total++] = customer;
		
		return true;
	}

	/**
	 * 替换用户
	 * @param index  索引值
	 * @param cust  需要替换的用户
	 * @return 替换成功返回true 替换失败返回false
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		
		//在数组中不是null的范围内
		if(index < 0 || index >= total){
			return false;
		}
		
		if(cust == null){
			return false;
		}

		customers[index] = cust;
		return true;
	}

	/**
	 * 删除用户
	 * @param index 索引值
	 * @return 删除成功返回true 删除失败返回false
	 */
	public boolean deleteCustomer(int index) {
		//校验 
		if(index < 0 || index >= total){
			return false;
		}

		for(int i = index; i < total - 1; i++){
			customers[i] = customers[i + 1];
		}
		
//		customers[total-1] = null;
//		total--;
		
		customers[--total] = null;
		
		return true;
	}

	/**
	 * 获取所有的用户
	 * @return 返回所有的用户的数组
	 */
	public Customer[] getAllCustomers() {
		Customer[] cus = new Customer[total];
		for (int i = 0; i < total; i++) {
			cus[i] = customers[i];
		}
		return cus;
	}
	
	/**
	 * 根据索引值返回指这下的用户
	 * @param index 索引值
	 * @return 返回一个用户
	 */
	public Customer getCustomer(int index) {
		//校验 
		if(index < 0 || index >= total){
			return null;
		}
		return customers[index];
	}

}
