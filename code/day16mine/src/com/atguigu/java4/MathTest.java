package com.atguigu.java4;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

public class MathTest {

	/*
	 * Math类
	 * 
	 */
	
	@Test
	public void test(){
		int abs = Math.abs(10);//取绝对值
		System.out.println(abs);
		
		int max = Math.max(10, 20);
		System.out.println(max);	
	}
	
	/*
	 * Integer类作为int的包装类，能存储的最大整型值为2^31−1，
	 * BigInteger类的数值范围较Integer类、Double类的数值范围要大得多，可以支持任意精度的整数。
	 */
	@Test
	public void test2(){
		int a = Integer.MAX_VALUE + 1;
		System.out.println(a);
		
		BigInteger b2 = new BigInteger(String.valueOf(Integer.MAX_VALUE));
		BigInteger b3 = new BigInteger(String.valueOf(1));
		System.out.println(b2.add(b3));
		
		BigInteger b4 = new BigInteger("1");
		System.out.println(b4);
	}
	
	/*
	 * 一般的Float类和Double类可以用来做科学计算或工程计算，但在商业计算中，
	 * 要求数字精度比较高，故用到java.math.BigDecimal类
	 */
	@Test
	public void test3(){
		double d = 1.0 - 0.41;
		System.out.println(d);
		
		BigDecimal b1= new BigDecimal(String.valueOf(1.0));
		BigDecimal b2= new BigDecimal(String.valueOf(0.41));
		System.out.println(b1.subtract(b2));
	}
	
}


