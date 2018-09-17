package com.atguigu.java2;

import java.util.ArrayList;

import org.junit.Test;

/*
 * |-------List
 * 		|---ArrayList : List的主要实现类，底层是使用数组来保存数据的。线程不安全，效率高，数据增删慢， 查找快。
 * 		|---Vector ： List的古老实现类，底层使用数组来保存数据的。线程安全，效率低。
 * 		|---LinkedList ： 底层是使用的链表来存储数据的。数据增删快，查找慢。
 * 
 * [面试题]
 * 		1.ArrayList和Vector的区别？
 * 		2.ArrayList和LinkedList的区别？
 * 
 * 	ArrayList构造器：
 * 		ArrayList():底层默认创建一个长度为10的数组
 * 		ArrayList(int initialCapacity):底层创建一个长度为initialCapacity的数组
 * 
 * 	ArrayList的底层实现？
 * 		创建一个空参的ArrayList的对象，底层默认创建一个长度为10的数组。当我们向集合中添加第11个元素时
 * 	 底层的数组会进行扩容。扩容为原来的1.5倍。把原来数组中的内容复制到新的数组中。
 * 		一般情况下我们会根据需要添加元素的数量使用new ArrayList(int initialCapacity)创建对象。
 */

public class ListTest2 {
	
	@Test
	public void test(){
		ArrayList a1 = new ArrayList(10);
		
		a1.add("aaa");
		a1.add("aaa");
		a1.add("aaa");
		a1.add("aaa");
		a1.add("aaa");
		a1.add("aaa");
		a1.add("aaa");
		a1.add("aaa");
		a1.add("aaa");
		a1.add("aaa");
		a1.add("aaa");
		
//		a1.clear();
		System.out.println(a1.size());
	}

}
