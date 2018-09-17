package com.atguigu.java2;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

/*
 * 
 * 	|----------Collection
 * 		|---------List : 存储的元素的是有序的且可重复的
 * 
 */
public class ListTest {

	/*
	 *  void add(int index, Object ele) //将ele插入到当前集合的index位置上
		boolean addAll(int index, Collection eles) //将eles插入到当前集合的index位置上
		Object get(int index) //获取当前集合中index位置上的元素
		int indexOf(Object obj) //将obj在当前集合中的位置返回，如果有多个obj返回第一个位置,如果找不到返回-1
		int lastIndexOf(Object obj)//将obj在当前集合中的位置返回，从后向前找，如果有多个obj返回最后一个的位置。找不到返回-1
		Object remove(int index)//将当前集合中的index位置上的元素删除并返回删除的元素
		Object set(int index, Object ele)//将当前集合中index位置上的元素改成ele并将修改前的元素返回
		//包头不包尾
		List subList(int fromIndex, int toIndex)//将当前集合中fromIndex到toIndex位置上的元素截取成子集合‘
		
	 */
	@Test
	public void test2(){
		List list = new ArrayList();
		list.add("aaa");
		list.add("aaa");
		list.add("ccc");
		list.add("ddd");
//		list.add(1, "dasd");
		
		System.out.println(list.set(2, "bbb"));
		//list.add(0, "AAA");
		
//		List list2 = new ArrayList();
//		list2.add(111);
//		list2.add(222);
//		list.addAll(0, list2);
		
//		System.out.println(list.get(0));
//		System.out.println(list.indexOf("abc"));
		
//		Object object = list.remove(2);
//		System.out.println(object);
		
//		Object set = list.set(0, "AAA");
//		System.out.println(set);
		
		List subList = list.subList(0, 2); //包头不包尾
		System.out.println(subList);
		
		System.out.println("--------------------");
		System.out.println(list);
		
	}
	
	/*
	 * 
	 * remove(Object obj) : 将当前集合中obj元素删除
	 * remove(int index); 当集合中有元素1的时候，也是安照索引值来删除的
	 */
	@Test
	public void test3(){
		List list = new ArrayList();
		list.add("aaa");
		list.add(2);
		list.add(1);
		
		//list.remove(1); //安照索引值来删
		//list.remove(new Integer(1)); //删除元素为1的内容
		
		boolean remove = list.remove("1");
		System.out.println(remove);
		System.out.println(list);
	}
	
	/*
	 * 自定义类，一定要重写equals方法，否则删除不掉
	 */
	@Test
	public void test4(){
		List list = new ArrayList();
		list.add(new Person("aa",18));
		
		list.remove(new Person("aa",18));
		System.out.println(list);
	}
}
