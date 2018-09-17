package com.atguigu.java.service;

import com.atguigu.java.domain.Employee;
import com.atguigu.java.domain.Programmer;

public class NameListService {

	private Employee[] employees;
	
	public NameListService(){
		
		//初始化数组
		employees =new Employee[Data.EMPLOYEES.length];
		//将数组中的信息抽取根据类型封装成对象，并装进数组中
		for (int i = 0; i < Data.EMPLOYEES.length; i++) {
			//获取员工类型
			String type = Data.EMPLOYEES[i][0];
			
			//提取二位数组中共有的信息
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name = Data.EMPLOYEES[i][2];
			int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
			
			//创建并初始化bonus
			double bonus = 0;
			
			switch(Integer.parseInt(type)){
			
			case Data.EMPLOYEE:
				Employee employee = new Employee(id, name, age, salary);
				employees[i] = employee;
				break;
				
			case Data.PROGRAMMER:
				bonus =Double.parseDouble(Data.EMPLOYEES[i][5]);
				new Programmer();
				break;
				
			case Data.DESIGNER:
				break;
				
			case Data.ARCHITECT:
				break;
			}
		}
	}
}
