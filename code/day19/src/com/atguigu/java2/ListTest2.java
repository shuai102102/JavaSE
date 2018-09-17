package com.atguigu.java2;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

/*
 * 
 * |-----List
 * 		|---ArrayList : List的主要实现类，底层是使用数组来保存数据的。线程不安全的，效率高。增删慢，查找快。
 * 		|---Vector ：List的古老实现类，底层使用数组来保存数据的。线程安全的，效率低。
 * 		|---LinkedList ：底层是使用的链表来存储数据的。数据增删快，查找慢。
 * 
 * [面试题]
 * 		1.ArrayList和Vector的区别？
 * 		2.ArrayList和LinkedList的区别？
 * 
 * 
 * 	ArrayList构造器：
 * 		ArrayList():底层默认创建一个长度为10的数组
 * 		ArrayList(int initialCapacity):底层创建一个长度为initialCapacity的数组
 * 
 * 	ArrayList的底层实现？
 * 		创建一个空参的ArrayList的对象，底层默认创建一个长度为10的数组。当我们向集合中添加第11个元素时
 * 	 底层的数组会进行扩容。扩容为原来的1.5倍。把原来数组中的内容复制到新的数组中。
 * 		一般情况下我们会根据需要添加元素的数量使用new ArrayList(int initialCapacity)创建对象。
 * 	
 */
public class ListTest2 {

	@Test
	public void test(){
		ArrayList al = new ArrayList(10);
		al.add("aaa");
		al.add("aaa");
		al.add("aaa");
		al.add("aaa");
		al.add("aaa");
		al.add("aaa");
		al.add("aaa");
		al.add("aaa");
		al.add("aaa");
		al.add("aaa");
		al.add("aaa");
		
		al.clear();
		System.out.println(al.size());
	}
	
	/*
	 *  void addFirst(Object obj) //将obj添加到集合中的0索引的位置
		void addLast(Object obj)	
		Object getFirst() //获取集合中的第一个元素
		Object getLast()
		Object removeFirst() //将第一个元素从该集合中删除并返回
		Object removeLast()

	 */
	@Test
	public void test2(){
		LinkedList list = new LinkedList();
		list.add(123);
		list.add("aaa");
		
		list.addFirst("bbb");
		list.addLast("ccc");
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		Object removeFirst = list.removeFirst();
		System.out.println(removeFirst);
		System.out.println(list);
	}
}
