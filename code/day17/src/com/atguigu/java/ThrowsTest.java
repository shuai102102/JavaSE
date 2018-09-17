package com.atguigu.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/*
 * 
 * 抓抛模型:
 * 
 * 
 * 抓:
 * 		方式一 ： try-catch -finally
 * 
 * 		方式二： throws 
 * 			格式： 方法名() throws 异常类型1，异常类型2
 * 
 * 			说明：1.并不是真正的处理异常，而是将异常向上抛，抛给方法的调用者。
 * 
 * 
 * 	try-catch-finally和throws的区别？
 * 		1.try-catch-finally 是真正意义上的解决了该异常的问题
 * 		2.throws并没有处理异常，只是把异常向上抛，抛给了方法的调用者。最后的异常还是需要使用到try-catch-finally去处理。
 * 
 *  两者之间的用法？
 *  	1.try-catch-finally：如果要解决异常的处理必须使用该方式
 *  	2.throws: 在main方法中如果需要多层调用多个方法可能发生异常，
 *  			这个时候如果有异常应该逐层向上抛，抛给方法的调用者。
 *      3.子类重写父类的方法。如果父类被重写的方法没有抛出异常，那么子类重写的方法一定不能抛出异常
 *      4.子类重写父类的方法。子类重写方法抛出的异常类型不大于父类被重写方法抛出的异常类型
 *      5.父类没有throws抛,子类一定不能抛
 */
public class ThrowsTest {

	@Test
	public void test() {

		date();

		try {
			date3();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void date3() throws ParseException {

		date2();

	}

	public void date2() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
		String str = sdf.format(new Date());
		sdf.parse(str);
	}

	/*
	 * try-catch-finally
	 */
	public void date() {
		SimpleDateFormat sdf = new SimpleDateFormat();
		String str = sdf.format(new Date());
		try {
			sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
