package com.atguigu.java2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * |---------------Collection
 * 		|--------------List : 存储的元素时有序的且了重复的
 */
public class ListTest {
	
	/*
	 * void add(int index, Object ele) //将ele插入到当前集合的index位置上
		boolean addAll(int index, Collection eles) //将eles插入到当前集合的index位置上
		Object get(int index) //获取当前集合中index位置上的元素
		int indexOf(Object obj) //将obj在当前集合中的位置返回，如果有多个obj返回第一个位置,如果找不到返回-1
		int lastIndexOf(Object obj)//将obj在当前集合中的位置返回，从后向前找，如果有多个obj返回最后一个的位置。找不到返回-1
		Object remove(int index)//将当前集合中的index位置上的元素删除并返回删除的元素
		Object set(int index, Object ele)//将当前集合中index位置上的元素改成ele并将修改前的元素返回
		
		//包头不包尾
		List subList(int fromIndex, int toIndex)//将当前集合中fromIndex到toIndex位置上的元素截取成子集合
	 */
	@Test
	public void test(){
		List list = new ArrayList();
		list.add("aaa");
		list.add("aaa");
		list.add("ccc");
		list.add("ddd");
		
//		list.add(1, "fff");
		
		List list2 = new ArrayList();
		list2.add(1);
		list2.add(222);
		
//		list.addAll(1, list2);
		
		System.out.println(list);
		
//		System.out.println(list.get(0));
		
//		System.out.println(list.indexOf("aaa"));
		
//		System.out.println(list.lastIndexOf("aaa"));
		
		/*
		 * 
		 * remove(Object obj) : 将当前集合中obj元素删除
		 * remove(int index); 当集合中有元素1的时候，也是安照索引值来删除的
		 */
//		System.out.println(list.remove(1));
		
		System.out.println(list2.remove(new Integer(1)));
		
//		System.out.println(list.set(1, "bbb"));
		
		List list4 = list.subList(1, 3);
		System.out.println(list4);

		
	}
	
	@Test
	public void test2(){
		List list = new ArrayList();
		list.add(new Person(18,"aaa"));
		
		list.remove(new Person(18,"aaa"));
		System.out.println(list);
	}
}
