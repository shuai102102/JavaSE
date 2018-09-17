package com.atguigu.java;

import org.junit.Test;

/*
 * 
 * finally: fianlly中的代码一定会执行
 * 
 * 
 */
public class FinallyTest {

	@Test
	public void test(){
		
		System.out.println(getAge());
	}
	
	/*
	 * 无论是否在try中catch中有return 最后一定执行的是finally中的return.
	 * catch中发生了异常finally一样会执行。
	 */
	public int getAge(){
//		try {
//			System.out.println(1 / 0);
//			return 1;
//		} catch (Exception e) {
//			return 2;
//		}finally{
//			return 3;
//		}
		
		try {
			System.out.println(1 / 0);
			return 1;
		} catch (Exception e) {
			System.out.println(1 / 0);
		}finally{
			System.out.println("aaaaaaa");
			return 3;
		}
	}
	
	
	@Test
	public void test2(){
		
		try {
			System.out.println( 1 / 0);
		} catch (Exception e) {
			System.out.println("发生异常了");
			System.out.println( 1 / 0);
		}
		
		System.out.println("代码执行完毕");
	}
}
