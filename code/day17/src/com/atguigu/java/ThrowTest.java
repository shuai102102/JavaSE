package com.atguigu.java;

import org.junit.Test;

/*
 * 
 * throw : 手动抛出异常
 * 
 * 格式： throw new 异常类();
 * 
 * [面试题]throw和throws的区别？
 */
public class ThrowTest {

	@Test
	public void test(){
		
//		try {
//			add(-5);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
		try {
			add2(-100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 抛出一个编译时异常
	 */
	public void add(int a) throws Exception{
		if(a < 0 || a >100){
			throw new Exception("a的值只能在0-100之间");
			//throw new String("aaa");
		}
	}
	
	/*
	 * 抛出一个运行时异常
	 */
	public void add2(int b) throws Exception{
		if(b < 0 || b >100){
			throw new RuntimeException("a的值只能在0-100之间");
		}
	}
}
