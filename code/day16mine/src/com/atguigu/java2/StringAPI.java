package com.atguigu.java2;

import org.junit.Test;

public class StringAPI {
	
	/*
	 * 
public int length() //字符串的长度
public char charAt(int index) //获取第index索引位置上的值
public boolean equals(Object anObject) //比较字符串的内容
public int compareTo(String anotherString) //比较两个字符串的大小
public int indexOf(String s)//s在当前字符串的第几个索引值开始，找不到返回-1
//从当前字符串第startpoint的索引值开始找s
public int indexOf(String s ,int startpoint)
"abcdefgh"
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
		
		//public int length() //字符串的长度
		System.out.println(str.length());
		
		//public char charAt(int index) //获取第index索引位置上的值
		System.out.println(str.charAt(5));
		
		//public boolean equals(Object anObject) //比较字符串的内容
		System.out.println(str.equals("hellojava"));
		
		//public int compareTo(String anotherString) //比较两个字符串的大小
		System.out.println("a".compareTo("b"));
		
		//public int indexOf(String s)//s在当前字符串的第几个索引值开始，找不到返回-1
		System.out.println("abcdefgh".indexOf("cde"));
		
		//从当前字符串第startpoint的索引值开始找s
		//public int indexOf(String s ,int startpoint)
		System.out.println("abcdefghdef".indexOf("def", 4));
		
		//从当前字符串第startpoint的索引值从后开始向前找s
		//public int lastIndexOf(String s ,int startpoint)
		System.out.println("abcdefghdef".lastIndexOf("def", 7));
		
		//当前字符串是否以prefix开头如果不是返回false反之true
		//public boolean startsWith(String prefix)
		System.out.println(str.startsWith("hell"));
		
		//当前字符串是否以suffix结尾如果不是返回false反之true
		//public boolean endsWith(String suffix)
		System.out.println(str.endsWith("va"));
		
		//public boolean regionMatches(int firstStart,String other,int otherStart ,int length)
		System.out.println(str.regionMatches(5, "java", 0, 3));
		
		
		
	}
	
	
	/*
	 * 将字符串的大写变小写
	 */
	@Test
	public void test2(){
		String str = "aBcD";
		String sr = "";
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
				charAt = (char)(charAt + 32);
			}
		sr += charAt;
		}
		System.out.println(sr);
	}
	
	/*
	 * 实现字符串的反转
	 */
	@Test 
	public void test3(){
		String str = "aBcD";
		String sr = "";
		for (int i = str.length() - 1; i >=0; i--) {
			sr += str.charAt(i);
		}
		System.out.println(sr);
	}
	
	/*
	 * 大小写转换
	 * 
	 * 比较内容忽略大小写
	 */
	@Test
	public void test4(){
		String str = "ASFffdsaSDAd";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String str2 = "abc";
		String str3 = "ABC";
		System.out.println(str2.equals(str3));
		
		System.out.println(str2.equalsIgnoreCase(str3));
	}
	
	@Test
	public void test5(){
		System.out.println('a' + 1);
		System.out.println('z' + 1);
		System.out.println('A' + 1);
		System.out.println('Z' + 1);
		
	}
}
