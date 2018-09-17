package com.atguigu.java;

import org.junit.Test;

/*
 * 抓抛模型：
 * 
 * 	抛：在java程序执行的过程中，一旦代码发生了异常。系统就会创建对应的异常类的对象，
 * 		并抛出，抛出给方法的调用者。并且终止程序的运行。
 * 
 * 		①系统向外抛异常    ②手动向外抛异常 throw 异常类型的对象
 * 
 *	抓：
 *		方式一：
 *				try{
 *					可能会发生异常的代码；
 *				}catch(异常类型 e){
 *					代码发生异常会进行的处理
 *				}finally{
 *					无论代码是否发生异常都会执行f该语句中的代码
 *				}
 * 			
 * 			说明：
 * 				1.try-catch中的代码一旦发生了异常，系统就会创建相应的异常类的对象并抛出。
 * 				    然后我们会根据catch后面的异常类型进行捕获。
 * 					一旦抓取成功，就会执行catch中相应的执行语句。执行finally中的代码。
 * 						try-catch后面的代码仍然执行。
 * 					一旦没有抓取成功，直接执行finally中的代码。并终止程序。
 * 				2.try中用来写可能会发生异常的代码。
 * 				3.catch后面用来抓取可能发生的异常类型。catch可以写多个。
 *    				如果多个catch后面异常类型的关系是子父类关系，子类在上父类在下。如果是兄弟关系谁上谁下都可以。
 *    			4.finally可以省略，finally中的代码一定会执行。
 *    			5.catch和finally只能省略其中一个。
 *    			6.常用输出异常信的方法：
 *    				printStackTrace();
 *    				getMessage();
 */		


public class ExceptionTest2 {
	
	@Test
	public void test(){
		try{
			System.out.println(1 / 0);
		}finally{
			System.out.println("finally");
		}
		System.out.println("代码执行完毕");
	}
	
	@Test
	public void test2(){
		try{
			int a = 1 / 0;
			System.out.println("aaaa");
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("发生异常了");
		}finally{
			System.out.println("finally");
		}
	}
	
}
