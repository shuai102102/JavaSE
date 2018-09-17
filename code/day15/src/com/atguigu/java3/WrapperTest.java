package com.atguigu.java3;

import org.junit.Test;

/*
 * 
 * 包装类 ： 针对八种基本数据类型 提拱了相应的 包装类
 * 
 * 
 */
public class WrapperTest {

	
	@Test
	public void test(){
		
		int a = 10;
		int maxValue = Integer.MAX_VALUE;
		System.out.println(maxValue);
	}
	
	/*
	 * 基本数据类型 -> 包装类
	 * Integer i = 12;
	 * 包装类   变量名 = new 包装类（相应的基本数据类型）
	 */
	@Test
	public void test2(){
		int a = 10;
		Integer i = new Integer(a);
		System.out.println(i);
		
		Integer integer = new Integer("10");
		System.out.println(integer);
		
		Boolean boolean1 = new Boolean("aaaaa");
		System.out.println(boolean1);
	}
	
	
	/*
	 * 包装类 -> 基本数据类型
	 * int i = new Integer(12);
	 * Xxx（包装类）.xxx（相应的基本数据类型）Value();
	 */
	@Test
	public void test3(){
		//包装类
		Integer integer = new Integer(10);
		//调用包装类的方法返回基本数据类型
		int intValue = integer.intValue();
		System.out.println(intValue);
		
		Boolean boolean1 = new Boolean(true);
		boolean booleanValue = boolean1.booleanValue();
		System.out.println(booleanValue);
	}
	
	/*
	  * 自动拆箱-装箱（JDK1.5之后，支持自动装箱，自动拆箱。但类型必须匹配。）
		自动拆箱 ： int a = new Integer(10);
		自动装箱: Integer integer = 10;
	 */
	@Test
	public void test4(){
		Integer integer = new Integer(10);
		//自动拆箱
		int i = new Integer(10);
		System.out.println(i);
		//自动装箱
		integer = 10;
	}
	
	
	/*
	 * 基本数据类型、包装类  -> 字符串     // 
	 * 
	 * 基本数据类型 -> 字符串   1.基本数据类型 +　字符串　　　２.String.valueOf(基本数据类型)
	 * 			// int a = 10; String str = String.valueof(10);
	 * 包装类 -> 字符串  1.包装类.toString()
	 *   //   Integer i = 10;  String str2 = i.toString();
 	 */ 
	@Test
	public void test5(){
		//基本数据类型 - > 字符串
		int a = 10;
		System.out.println(a + "");
		String str = String.valueOf(a);
		System.out.println(str);
		
		//包装类 - > 字符串
		Integer integer = new Integer(10);
		String str2 = integer.toString();
		System.out.println(str2);
	}
	
	/*
	 * 字符串 -> 基本数据类型、包装类
	 * 
	 * 字符串->基本数据类型 : 基本数据类型对应的包装类.parse基本数据类型("1")
	 *     //Int parseInt = Integer.parseInt("10");
	 * 字符串 -> 包装类 : 1.通过包装类的构造器	 //Integer integer = new Integer ("10");
	 * 				  2.相应的包装类.valueOf("1")		//Integer valueOf = Integer.valueOf("10");
	 */
	@Test
	public void test6(){
		//字符串->基本数据类型
		int parseInt = Integer.parseInt("1");
		System.out.println(parseInt);
		
		//字符串  -> 包装类
		Integer integer = new Integer("1");
		System.out.println(integer);
		
		String str = "10";
		Integer valueOf = Integer.valueOf(str);
		System.out.println(valueOf);
		
	}
}
