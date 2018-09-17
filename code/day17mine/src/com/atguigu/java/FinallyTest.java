package com.atguigu.java;

import org.junit.Test;

/*
 * finaly: finally中的代码一定会执行
 */

public class FinallyTest {
	
	@Test
	public void test(){
		System.out.println(getAge());
	}
	
	/*
	 * 无论是否在try中catch中有无return，最后一定执行的时finally中的return
	 * catch中大声了异常finally一样会执行。
	 */
	public int getAge(){
		try{
			System.out.println(1 / 0);
			return 1;
		}catch (Exception e) {
			return 2;
		}finally{
			return 3;
		}
	}
	
	@Test
	public void test2(){
		try{
			if(true){
			System.out.println(1 / 0);
			throw new Exception();
			}
		}catch (Exception e) {
			System.out.println("发生异常了");
			System.out.println(1 / 0);
			
		}
		System.out.println("代码执行完毕");
	}
}
