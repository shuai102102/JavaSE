package com.atguigu.java2;

import org.junit.Test;

public class StringAPI {

	/*
	 * 
public int length() //字符串的长度
public char charAt(int index) //获取第index索引位置上的值    	//String.charAt
public boolean equals(Object anObject) //比较字符串的内容
public int compareTo(String anotherString) //比较两个字符串的大小
public int indexOf(String s)//s在当前字符串的第几个索引值开始，找不到返回-1
//从当前字符串第startpoint的索引值开始找s
public int indexOf(String s ,int startpoint)
//从当前的字符串后面向前找s
public int lastIndexOf(String s)
//从当前字符串第startpoint的索引值从后开始向前找s
public int lastIndexOf(String s ,int startpoint)
//当前字符串是否以prefix开头如果不是返回false反之true
public boolean startsWith(String prefix)
//当前字符串是否以suffix结尾如果不是返回false反之true
public boolean endsWith(String suffix)
//
public boolean regionMatches(int firstStart,String other,int otherStart ,int length)

	 */
	
	@Test
	public void test(){
		String str = "hellojava";
		System.out.println(str.length()); //多
		System.out.println(str.charAt(0));//多
		//了解即可
		System.out.println("a".compareTo("b"));
		//s在当前字符串的第几个索引值开始，找不到返回-1
		System.out.println(str.indexOf("adf"));//多
		//从当前字符串第startpoint的索引值开始找s
		System.out.println("hellohellohelloa".indexOf("hello",0));
		//从当前的字符串后面向前找s
		System.out.println("hellohellohelloa".lastIndexOf("hello"));
		//当前字符串是否以dell开头，如果不是返回false反之true
		System.out.println("hellojava".startsWith("dell"));//多
		System.out.println("hellojava".endsWith("va"));
		//"hellojava"从第5个索引值开始和“javc”从0到第3个索引值（不包含3）的数据是否相同
		//把两个字符串都进行截取然后进行比较
		boolean boo = "hellojava".regionMatches(5, "javc", 0, 3);
		System.out.println(boo);
		
	}
	
	/*
	 * 将字符串中的大写变成小写
	 * 
	 * 将字符串的小写变成大写
	 * 
	 * 将字符串中的大写变小写，小写变大写
	 * 
	 */
	/*
	 * 实现字符串的反转
	 */
	@Test
	public void test2(){
		String str = "abcdefg";
		String str2 = "";
		for (int i = str.length() - 1; i >= 0 ; i--) {
			str2 += str.charAt(i);
		}
		System.out.println(str2);
	}
	
	/*
	 * 将字符串的大写变小写
	 */
	@Test
	public void test3(){
		String str = "AbcDefg";
		String str2 = "";
		
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if(charAt >= 65 && charAt <= 90){
				charAt = (char) (charAt + 32);
			}
			str2 += charAt;
		}
		System.out.println(str2);
	}
	
	@Test
	public void test4(){
		System.out.println('a' + 1); //97
		System.out.println('A' + 1); //65
		System.out.println('z' + 1); //122
		System.out.println('Z' + 1); //90
	}
	
	/*
	 * 大小写转换
	 * 
	 * 比较内容忽略大小写
	 */
	@Test
	public void test5(){
		String str = "AbcDefg";
		//将字符串中的内容全部转成大写
		System.out.println(str.toUpperCase());
		//将字符串中的内容全部转成小写
		System.out.println(str.toLowerCase());
		
		String str2 = "abc";
		String str3 = "ABC";
		System.out.println(str2.equals(str3)); //false
		//字符串比较内容忽略大小写
		System.out.println(str2.equalsIgnoreCase(str3));//true
	}
}
