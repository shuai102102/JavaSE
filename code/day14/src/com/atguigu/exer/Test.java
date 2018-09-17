package com.atguigu.exer;

import javax.activation.CommandInfo;

public class Test {

	public static void main(String[] args) {
		
		Employee manager = new Manager("小龙哥", 100, 100000, 1000);
		Employee commonEmployee = new CommonEmployee("小峰峰",10000,1000);
		
		manager.work();
		commonEmployee.work();
	}
}
