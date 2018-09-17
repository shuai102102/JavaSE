package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

/*
 * 
 * 增强for循环 : 用来遍历集合和数组中的元素
 * 
 * 格式：
 * 		for(元素类型  变量名 ： 集合、数组的对象){
 * 			执行语句;
 * 		}
 * 
 */
public class ForeachTest {

	@Test
	public void test(){
		List c = new ArrayList();
		String[] str = {"aaa","ccc","ddd","fff"};
		for(String name : str){
			c.add(name);
		}
		
		System.out.println("-------------");
		
		
		c.add("AAA");
		c.add("BBB");
		c.add("CCCC");
		c.add(1111);
		
		for(Object obj : c){
			System.out.println(obj);
		}
	}
	
	@Test
	public void test2(){
		String[] str = {"aaa","ccc","ddd","fff"};
		
		/*
		for (int i = 0; i < str.length; i++) {
			str[i] = "GGGG";
		}
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		*/
		
		
		System.out.println("-------------------");
		
		/*
		 * String name = str[i];
		 * name = "GGG";
		 */
		for(String name : str){
			name = "GGGG";
		}
		
		for(String name : str){
			System.out.println(name);
		}
	}
}
