package com.atguigu.exer6;

/*
 * 编写一个Employee类，声明为抽象类，包含如下三个属性：name，id，salary。
 * 提供必要的构造器和抽象方法：work()。对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
 * 请使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问。

 */

abstract class CommonEmployee {
	String name;
	int id;
	int salary;
	
	public abstract void work();
}

