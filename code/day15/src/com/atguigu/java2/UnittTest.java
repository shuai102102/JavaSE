package com.atguigu.java2;

import org.junit.Test;

/*
 * 
 * 单元测试
 * 
 * 1.导包 ： JUnit4包  
 * 2.写一个方法加上一个注解 @Test
 * 3.右键 - runas - JnuitTest进行行运
 * 4.如果显示的是红条说明代码出现异常，如果是绿条运行成功
 * 5.一个类中可以有多个测试方法，需要运行哪个将光标移动到该方法名上再进行运行
 * 6.测试方法的类名不能叫做 Test
 */
public class UnittTest {

	
	@Test
	public void test1(){
		System.out.println(1 / 0);
	}
	
	
	@Test
	public void test2(){
		System.out.println( 1 + 1);
	}
}
