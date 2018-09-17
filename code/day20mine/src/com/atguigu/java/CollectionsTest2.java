package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

import org.junit.Test;

public class CollectionsTest2 {

	/*
	 * synchronizedList(list) : 获取一个线程安全的List的实现类对象
	 */	
	@Test
	public void test(){
	
		List<String> list = new ArrayList<String>();
		System.out.println(list.getClass());
		
		List list2 = Collections.synchronizedList(list);
		System.out.println(list2.getClass());
		
		/*
		 *  class java.util.ArrayList
			class java.util.Collections$SynchronizedRandomAccessList
		 */
	}
	
	@Test
	public void test2(){
		/*
		 * 了解（古老的）
		 */
		StringTokenizer stringEnum = new StringTokenizer("a-b*c-d-e-g", "-");
		while(stringEnum.hasMoreElements()){//是否有下一个元素
			Object obj = stringEnum.nextElement(); //指针下移，获取指针指向的元素
			System.out.println(obj);
		}
	}
}
