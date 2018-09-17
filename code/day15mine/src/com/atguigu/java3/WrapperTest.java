package com.atguigu.java3;

import org.junit.Test;

public class WrapperTest {

	

	@Test
	public void test(){
		@SuppressWarnings( "unused" )
		int a = 10;
		int maxValue = Integer.MAX_VALUE;
		System.out.println(maxValue);
	}
	
	/*
	 * 基本数据类型 -> 包装类
	 * 
	 * 包装类   变量名 = new 包装类（相应的基本数据类型）
	 */
	@Test
	public void test2(){
		int a = 10;
		Integer i = new Integer(a);
		System.out.println(i);
		
		Integer i1 = new Integer(10);
		System.out.println(i1);
		
		Boolean boolean1 = new Boolean("sssss");
		System.out.println(boolean1);
	}
	
	/*
	 * 包装类 -> 基本数据类型
	 * 
	 * Xxx（包装类）.xxx（相应的基本数据类型）Value();
	 */
	@Test
	public void test3(){
		Integer integer = new Integer(10);
		int i = integer.intValue();
		System.out.println(i);
		
		Boolean boolean1 = new Boolean(true);
		boolean boo = boolean1.booleanValue();
		System.out.println(boo);
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
		
		System.out.println();
		//自动装箱
		Integer I = 10;
		System.out.println(I);
	}
	
	
	/*
	 * 基本数据类型、包装类  -> 字符串
	 * 
	 * 基本数据类型 -> 字符串   1.基本数据类型 +　字符串　　　２.String.valueOf(基本数据类型)
	 * 
	 * 包装类 -> 字符串  1.包装类.toString()
	 */
	@Test
	public void test5(){
		//基本数据类型 - > 字符串
		int a = 1;
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
	 * 
	 * 字符串 -> 包装类 : 1.通过包装类的构造器
	 * 				  2.相应的包装类.valueOf("1")
	 */
	
	@Test
	public void test6(){
		//字符串->基本数据类型
		int i = Integer.valueOf("1");
		System.out.println(i);		
		
		//字符串 -> 包装类
		Integer integer = new Integer("1");
		System.out.println(integer);
		
		String str = "10";
		Integer valueOf = Integer.valueOf(str);
		System.out.println(valueOf);
	}
	
}



