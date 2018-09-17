package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Equipment;
import com.atguigu.team.domain.NoteBook;
import com.atguigu.team.domain.PC;
import com.atguigu.team.domain.Printer;
import com.atguigu.team.domain.Programmer;

public class NameListService {

	private Employee[] employees; // 用来存放员工

	public NameListService(){
		//初始化数组
		employees = new Employee[Data.EMPLOYEES.length];
		//将数组中的信息抽取根据类型封装成对象，并装进数组中
		for (int i = 0; i < Data.EMPLOYEES.length; i++) {
			//获取员工的类型
			String type = Data.EMPLOYEES[i][0];
			//提取二维数组中的共有的信息
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name = Data.EMPLOYEES[i][2];
			int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
			double bonus = 0;
			//根据类型创建相应的对象
			switch(Integer.parseInt(type)){
			case Data.EMPLOYEE:
				//根据提取的信息创建对象
				Employee employee = new Employee(id, name, salary, age);
				//将创建好的对象放进数组
				employees[i] = employee;
				break;
			case Data.PROGRAMMER:
				Programmer programmer = new Programmer(id, name, salary, age, createEquipment(i));
				employees[i] = programmer;
				break;
			case Data.DESIGNER:
			    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				Designer designer = new Designer(name, id, age, salary, createEquipment(i), bonus);
				employees[i] = designer;
				break;
			case Data.ARCHITECT:
				bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				int stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
				Architect architect = new Architect(name, age, salary, id, createEquipment(i), bonus, stock);
				employees[i] = architect;
				break;
			}
		}
	}
	
	
	//创建设备
	public Equipment createEquipment(int i){
		//获取设备的类型
		String type = Data.EQIPMENTS[i][0];
		String model = Data.EQIPMENTS[i][1];
		switch(Integer.parseInt(type)){
		case Data.PC:
			String display = Data.EQIPMENTS[i][2];
			PC pc = new PC(model, display);
			return pc;
		case Data.NOTEBOOK:
			double price = Double.parseDouble(Data.EQIPMENTS[i][2]);
			NoteBook noteBook = new NoteBook(model,price);
			return noteBook;
		case Data.PRINTER:
			String equipmentType = Data.EQIPMENTS[i][2];
			Printer printer = new Printer(model, equipmentType);
			return printer;
		}
		return null;
	}

	/*
	 * 获取所有的员工
	 */
	public Employee[] getAllEmployee() {
		return employees;
	}

	/*
	 * 根据id获取对应的员工
	 */
	public Employee getEmployee(int id) throws TeamException {
		for (int i = 0; i < employees.length; i++) {
			if(employees[i].getId() == id){
				return employees[i];
			}
		}
		throw new TeamException("没有找到该用户");
	}
}
