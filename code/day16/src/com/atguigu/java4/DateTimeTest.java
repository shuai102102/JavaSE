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
	public void test2(){
		Date date = new Date();
		//获取当前时间
		System.out.println(date); //Wed Mar 21 15:38:02 CST 2018
		//获取当前时间对应的毫秒数
		long time = date.getTime();
		System.out.println(time); //1521617963913
		
		
		System.out.println("---------------------");
		////获取time对应的时间
		Date date2 = new Date(1521617963913L);
		System.out.println(date2);
		//获取毫秒数对应时间的毫秒数1521617963913
		System.out.println(date2.getTime());
	}
	
	@Test
	public void test3(){
		java.sql.Date date = new java.sql.Date(1521617963913L);
		//2018-03-21
		System.out.println(date);
		//1521617963913
		System.out.println(date.getTime());
	}
	
	/*
	 * 将java.util.Date转成java.sql.Date的时间
	 */
	@Test
	public void test4(){
		java.sql.Date date = new java.sql.Date(new Date().getTime());
		System.out.println(date);
	}
}
