package com.atguigu.java5;

import org.junit.Test;

public class ExceptionTest {
	
	@Test
	public void test(){
		
		try {
			int[] i = new int[2];
			System.out.println(i[2]);
		} catch (Exception e) {
			System.out.println("出错了");
			
		}finally{
			System.out.println("运行完毕");
		}
		
	}
	
	
	@Test
	public void test2(){
		
		try{
		add(-1);
		}catch (myException e) {
			// TODO: handle exception
			System.out.println("请输入0-123之间的数");
		}
	}
	
	
	
	public void add(int a) throws myException{
		if(a < 0 || a>123)
		throw new myException("0-123之间");
	}

}

