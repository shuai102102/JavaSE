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
		
		Calendar  c = Calendar.getInstance();
	
		//获取当前是当月的第几天
		int i = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(i);
		
		//add(int field,int amount) :
		//在当前的当月（周、年）天数 多添加 amount天
		c.add(Calendar.DAY_OF_MONTH, 1);
		i = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(i);
		
		c.add(Calendar.DAY_OF_MONTH, -2);
		i = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(i);
		
		//set(int field,int amount):将当前是在当月的第几天改成amount天
		c.set(Calendar.DAY_OF_MONTH, 10);
		i = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(i);
		
		//获取当前日历上的时间
		Date time = c.getTime();
		System.out.println(time);
		
		Calendar c2 = Calendar.getInstance();
		
		Date time2 = c2.getTime();
//		System.out.println(c2.get(Calendar.DAY_OF_MONTH));
		
		
		
	}
}
