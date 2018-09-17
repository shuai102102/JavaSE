package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class Foreach {

	/*
	 * 增强for循环：用来遍历计划人和书中的元素
	 * 
	 * 格式：
	 * for(元素类型 变量名 ：集合、数组的对象){
	 * 		执行语句
	 * }
	 * 
	 */
	
	@Test
	public void test(){
		
		String[] str ={"aaa","bbb","ccc","ddd"};
		for(String name : str){
			System.out.println(name);
		}
		
		System.out.println("-----------------");
		
		Collection c = new ArrayList();
		c.add("qqq");
		c.add('a');
		c.add(123);
		System.out.println(c);
		System.out.println("-------------");
		for(Object obj : c){
			System.out.println(obj);
		}
		
		System.out.println("--------------");
		
		for(String name : str){
			name = "GGG";
			System.out.println(name);
		}	
	}
}
