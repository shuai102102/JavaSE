package com.atguigu.java4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/*
 * java.text 包下都是关于国际化方面的类
 * 
 * java.text.SimpleDateFormat : 格式化日期
 */
public class SimpleDateFormatTest {

	@Test
	public void test() throws Exception{
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		//将当前时间转成字符串
		String format = sdf.format(date);
		System.out.println(format); //18-3-21 下午4:00
		
		//将字符串转成时间
		Date parse = sdf.parse("18-3-21 下午4:00");
		
	}
	
	/*
	 * 
	 * 将时间转成字符串    -  format(Date d)
	 * 
	 * 将字符串转成时间    -  parse(String str)
	 * 
	 * 注意：不同格式之间不能相互转换
	 */
	@Test
	public void test2() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		String format = sdf.format(new Date());
		System.out.println(format); //2018-03-21T16:05:39.542+0800
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-'W'ww-u");
		String format2 = sdf2.format(new Date());
		System.out.println(format2); //2018-W12-3
		
		//记住
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format3 = sdf3.format(new Date());
		System.out.println(format3); //2018-03-21 16:07:46
		Date parse = sdf3.parse(format3);
	}
}
