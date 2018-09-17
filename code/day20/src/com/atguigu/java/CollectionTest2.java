package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

import org.junit.Test;

public class CollectionTest2 {

	/*
	 * synchronizedList(list) : 获取一个线程安全的List的实现类对象
	 */
	@Test
	public void test(){
		List list = new ArrayList();
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
		 * 了解
		 */
		Enumeration stringEnum = new StringTokenizer("a-b*c-d-e-g", "-");
		while(stringEnum.hasMoreElements()){ //是否有下一个元素
			Object obj = stringEnum.nextElement(); //指针下移，获取指针指向的元素
			System.out.println(obj); 
		}

	}
}


