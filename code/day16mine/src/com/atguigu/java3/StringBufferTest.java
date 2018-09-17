package com.atguigu.java3;

import org.junit.Test;

/*
 * 
 * String : 不可变的字符序列，底层是final char[]
 * 
 * StringBuffer:可变的字符序列，线程安全的，效率低,底层是char[]
 * 
 * StringBuilder:可变的字符序列，线程不安全的，效率高,底层是char[]
 * 
 * 
 */

public class StringBufferTest {

	
	
	/*
	 *  1．StringBuffer()初始容量为16的字符串缓冲区
	 *  		当我们添加的容量一旦超过16 会自动进行扩容 扩容到原来的2倍+2
		2．StringBuffer(int size)构造指定容量的字符串缓冲区
		3．StringBuffer(String str)将内容初始化为指定字符串内容    

	 */
	@Test 
	public void test1(){
		
		StringBuffer sb = new StringBuffer();
		sb.append("abcdefg");
		sb.append(true);
		String s = null;
		sb.append(s);
		sb.append("adsfjahsdfkkjhfakjasdkfjha;khf");
		System.out.println(sb);
	}
	
	/*
	StringBuffer append(String s),   StringBuffer append(int n) ,  
	StringBuffer append(Object o) ,  StringBuffer append(char n),
	StringBuffer append(long n),  StringBuffer append(boolean n),
	//在当前字符串index的位置插入str
	StringBuffer insert(int index, String str) 
	//反转
	public StringBuffer reverse() 
	//从当前字符串中将startIndex到endIndex位置上的元素删除（包头不包尾）
	StringBuffer delete(int startIndex, int endIndex) 
	//获取第n个索引位置上的字符
	public char charAt(int n )
	//修改当前字符串中n的位置上的元素改成ch
	public void setCharAt(int n ,char ch)
	//将当前字符串中startIndex到endIndex的位置上的元素清除并替换成str
	StringBuffer replace( int startIndex ,int endIndex, String str) 
	//str在当前字符串中的哪个索引位置
	public int indexOf(String str)
	//将当前字符 串从start到end的位置进行截取(包头不包尾)
	public String substring(int start,int end)
	//字符串长度
	public int length()

		 */
	@Test 
	public void test2(){
		String str = "aAbBcCdD";
		StringBuffer st = new StringBuffer(str);
		
		//在当前字符串index的位置插入str
		//StringBuffer insert(int index, String str) 
		st.insert(1,"sss");
		
		//反转
		//public StringBuffer reverse() 
		st.reverse();
		st.reverse();
		
		//从当前字符串中将startIndex到endIndex位置上的元素删除（包头不包尾）
		//StringBuffer delete(int startIndex, int endIndex)
		st.delete(1, 4);
		System.out.println(st);
		
	}
}
