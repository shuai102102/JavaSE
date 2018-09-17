package com.atguigu.java2;

import org.junit.Test;

public class ExceptionTest {

	@Test
	public void test(){
//		try{
//			add2(-10);
//		}catch(MyException e){
//			System.out.println(e.getMessage());
//		}
		
		try {
			add(-10);
			System.out.println("---------------------");
		} catch (MyException2 e) {
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * 抛出一个编译时异常
	 */
	public void add(int a) throws MyException2{
		if(a < 0 || a >100){
			throw new MyException2("0-100之间");
			//throw new String("aaa");
		}
	}
	
	/*
	 * 抛出一个运行时异常
	 */
	public void add2(int b) throws MyException{
		if(b < 0 || b >100){
			throw new MyException("a的值只能在0-100之间");
		}
	}
}
