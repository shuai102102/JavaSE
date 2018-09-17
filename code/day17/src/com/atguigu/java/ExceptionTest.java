package com.atguigu.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

/*
 * 
 * 异常：
 * 
 * 一 体系结构：
 * 			-----java.lang.Throwable
 * 
 * 				|-----Error : 没有针对性的代码可以进行处理
 * 
 * 
 * 				|-----Exception ：可以有针对性的代码进行处理
 * 
 * 					 |---编译时异常：
 * 								ParseException:解析异常
 * 
 * 					 |---运行时异常：
 * 								类型转换异常 ：ClassCastException
								下角标越界异常：ArrayIndexOutOfBoundsException
								空指针异常NullPointerException
								算术运算异常：ArithmeticException
									

 * 		总结：往往我们只对编译时异常进行处理。
 * 
 */
public class ExceptionTest {

	
	public static void main(String[] args) {
		
//		System.out.println( 1 / 0);
//		System.out.println("aaaaa");
		
		//main(args); //StackOverflowError
		
		try{
			int a = 1 / 0;
		}catch (Exception e) {
			System.out.println("哥们没事别瞎写");
		}
		
		System.out.println("aaaaaaa");
		
	}
	
	/*
	 * 编译时异常 ： 必须进行处理否则不能运行
	 */
	@Test
	public void test(){
		SimpleDateFormat sdf = new SimpleDateFormat();
		try {
			sdf.parse("12-01-01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 运行时异常 ：不用强制进行处理
	 */
	@Test
	public void test2(){
		int[] a = new int[2];
		System.out.println(a[2]);
	}
}
