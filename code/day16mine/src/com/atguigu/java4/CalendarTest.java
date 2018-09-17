package com.atguigu.java4;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/*
 * 
 * Calendar 日历类 （了解）
 */

public class CalendarTest {
	
	@Test
	public void test(){
		
		Calendar c = Calendar.getInstance();
		
		//获取当前是当月的第几天
		int i = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(i);
		
		//add(int field,int amount) : 
		//在当前的当月（周、年）天数 多添加 amount天
		c.add(Calendar.DAY_OF_MONTH, 1);
		int j = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(j);
		
		
		//set(int field,int amount):
		//将当前是在当月的第几天改成amount天
		c.set(Calendar.DAY_OF_MONTH, 10);
		int k = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(k);
		
		//获取当前日历的时间
		Date time = c.getTime();
		System.out.println(time);//Sat Mar 10 20:40:15 CST 2018
		
		
	}

}
