package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class IteratorTest {

	/*
	 * Iterator用来遍历集合中的元素
	 * 
	 */
	@Test
	public void test(){
		
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add(123);
		c.add("ccc");
		System.out.println(c.iterator().hasNext());
		
		/*
		 * next():
		 * 作用：1.指针下移  2.返回指针指向的元素
		 */
		Iterator iterator = c.iterator();
		Object next = iterator.next();
		System.out.println(next);
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		
		//System.out.println(iterator.next());
		
	}
	
	/*
	 * boolean hasNext() :如果还有下一个元素就返回true
	 */
	@Test
	public void test2(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add(123);
		c.add("ccc");
		Iterator iterator = c.iterator();
		/*
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		*/
		
		while(iterator.hasNext()){
			System.out.println("----------------");
			System.out.println(iterator.next());
		}
	}
	
	/*
	 * 常见的错误
	 */
	@Test
	public void test3(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add(123);
		c.add("ccc");
		
		/*
		 * 错误：死循环 - 因为c.iterator()返回的是一个iterator的实现类的对象
		while(c.iterator().hasNext()){
			System.out.println(c.iterator().next());
		}
		*/
		
		Iterator iterator = c.iterator();
		/*
		 * 错误：每next()一次指针下移一次
		while(iterator.next() != null){
			System.out.println(iterator.next());
		}
		*/
	}
}
