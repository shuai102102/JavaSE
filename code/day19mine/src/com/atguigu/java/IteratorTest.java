package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class IteratorTest {

	@Test
	public void test(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add(111);
		
		System.out.println(c.iterator().next());
		System.out.println(c.iterator().next());
		System.out.println(c.iterator().next());
		System.out.println(c.iterator().next());
		
		System.out.println(c.iterator().hasNext());
	}
	
	@Test
	public void test2(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("dsad");
		c.add(123);
		c.add("bbbb");
		
		Iterator iterator = c.iterator();
		
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
		
		while(iterator.hasNext()){
			System.out.println("-----------");
			System.out.println(iterator.next());
		}
	}
	
	@Test
	public void test3(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("dsad");
		c.add(123);
		c.add("bbbb");
		/*
		 * 错误：死循环--因为c.iterator()返回的是一个iterator的实现类
		 */
		
//		while(c.iterator().hasNext()){
//			System.out.println(c.iterator().next());
//		}
		
		Iterator iterator = c.iterator();
		
		/*
		 * 错误：每next()一次指针下移一次
		 */
		while(iterator.next() != null){
			System.out.println(iterator.next());
		}
		
	}
	
	
}
