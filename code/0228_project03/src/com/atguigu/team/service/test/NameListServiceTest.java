package com.atguigu.team.service.test;

import org.junit.Test;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;

public class NameListServiceTest {

	/*
	 * 测试员工的信息
	 */
	@Test
	public void getAllEmployess(){
		NameListService list = new NameListService();
		Employee[] allEmployee = list.getAllEmployee();
		for (int i = 0; i < allEmployee.length; i++) {
			System.out.print(allEmployee[i].getName());
			
			if(allEmployee[i] instanceof Programmer){
				Programmer p = (Programmer) allEmployee[i];
				String description = p.getEquipment().getDescription();
				System.out.print(description);
			}
			
			System.out.println();
		}
	}
	
	/*
	 * 测试是否根据指定id能够找到相应的用户
	 */
	@Test
	public void getEmployee(){
		NameListService nl = new NameListService();
		try {
			Employee employee = nl.getEmployee(100);
			System.out.println(employee.getName());
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
	}
}
