package com.atguigu.java4;

import java.util.Date;

import org.junit.Test;

public class DateTimeTest {
	
	/*
	 * java.lang.System
	 * currentTimeMillis()用来返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
	 */
	@Test
	public void test(){
		System.out.println(System.currentTimeMillis());
	}
	/*
	 * 
	 * java.util.Date
	 * 	
	 * 		---两个构造器
	 * 		   new Date(); //获取最新的时间
	 * 		   new Date(long time) //获取time对应的时间
	 * 		---两个方法
	 * 			toString() : //Wed Mar 21 15:38:02 CST 2018
	 * 			getTime(): 获取当前时间的毫秒数
	 * 
	 * java.sql.Date
	 * 		----一个构造器
	 * 			new Date(long time);//根据time获取对应的日期 2018-03-21
	 * 		-----两个方法
	 * 			toString(); //2018-03-21
	 * 			getTime():获取对应日期的毫秒数
	 */
	@Test
	public void test1(){
		Date date = new Date();
		System.out.println(date);//Wed Mar 21 16:26:14 CST 2018
		long time = date.getTime();
		System.out.println(time);//1521620774023
		
		System.out.println("------------------");
		
		Date date2 = new Date(1521620774023L);
		System.out.println(date2);//Wed Mar 21 16:26:14 CST 2018
		System.out.println(date2.getTime());//1521620774023
	}
	
	@Test
	public void test2(){
		java.sql.Date date = new java.sql.Date(1521620774023L);
		System.out.println(date);
		long time = date.getTime();
		System.out.println(time);
	}
	
	/*
	 * 将java.util.Date转成java.sql.Date的时间
	 */
	@Test
	public void test3(){
		java.sql.Date date = new java.sql.Date(new Date().getTime());
		System.out.println(date);
	}
	
}


