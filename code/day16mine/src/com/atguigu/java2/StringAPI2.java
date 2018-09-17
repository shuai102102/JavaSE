package com.atguigu.java2;

import org.junit.Test;

public class StringAPI2 {
	
	/*
	 *  public String substring(int startpoint) //截取字符串从当前字符串的第startpoint的位置开始
	 *  //截取字符串从当前字符串的第start的位置开始到end结束(包头不包尾)
		public String substring(int start,int end)
		//将当前字符串中的oldChar替换成newChar
		pubic String replace(char oldChar,char newChar)
		//将当前字符串中的old替换成new
		public String replaceAll(String old,String new)
		//将字符串两头的空格去掉
		public String trim()
		//将当前字符串和str进行拼接
		public String concat(String str)
		//当前字符串中是否包含s
		public boolean contains(CharSequence s)
		//将当前字符串以regex的格式切成不同的字符串
		public String[] split(String regex)

	 */
	@Test
	public void test(){
		
		String str = "abcdeag";
		//截取字符串从当前字符串的第startpoint的位置开始
		//public String substring(int startpoint) 
		System.out.println(str.substring(1));
		
		//截取字符串从当前字符串的第start的位置开始带end结束（包头不包尾）
		System.out.println(str.substring(0, 3));              
		
		//将当前字符串中的oldChar替换成newChar
		System.out.println(str.replace('a', 'i'));
		
		//将当前字符串中的oldString替换成newString
		System.out.println(str.replaceAll("abc", "abcd"));
		
		//将字符串两头的空格去掉
		System.out.println("  absad ds as  ".trim());
		
		//将两个字符串进行拼接
		System.out.println("nishi".concat("sb"));
		
		//当前字符串是否包含i
		System.out.println("nishi sb".contains("i"));
		
		String str2 = "abc def fgk";
		String[] split = str2.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
	}
		
}




