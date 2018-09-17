package com.atguigu.java2;

import org.junit.Test;

public class StringAPI3 {

	
	@Test
	public void test(){
		//将字符串 -> char[]
		char[] charArray = "abcdefg".toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		
		System.out.println("---------------------");
		
		//char[] -> 字符串
		String string = new String(charArray);
		System.out.println(string);
		
		//字符串 -> byte[]
		byte[] bytes = "abcdefg".getBytes();
		//byte[] -> 字符串
		String string2 = new String(bytes);
		
	}
}
