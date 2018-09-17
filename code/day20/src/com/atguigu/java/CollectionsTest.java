package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

/*
 * Collections工具类
 */
public class CollectionsTest {

	/*
	 *  reverse(List)：反转 List 中元素的顺序
		shuffle(List)：对 List 集合元素进行随机排序
		sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
		sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
		swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换

	 */
	@Test
	public void test(){
		
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("ccc");
		list.add("ddd");
		list.add("bbb");
//		list.add(new Person("aa",16));
//		list.add(new Person("cc",15));
//		list.add(new Person("dd",18));
//		list.add(new Person("ff",19));
//		list.add(new Person("ee",20));
		
//		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);
		
		
//		Collections.shuffle(list);
		
//		Collections.sort(list);
		
		
		
//		Collections.sort(list,new Comparator() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				if(o1 instanceof Person && o2 instanceof Person){
//					Person p1 = (Person) o1;
//					Person p2 = (Person) o2;
//					return p1.age - p2.age;
//				}
//				return 0;
//			}
//		});
		
		Collections.swap(list, 0, 2);
		
		System.out.println(list);
		
		
	}
	
	
	/*
	 * 
	 *  Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
		Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
		Object min(Collection)
		Object min(Collection，Comparator)
		int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
		void copy(List dest,List src)：将src中的内容复制到dest中
		boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值

	 */
	@Test
	public void test2(){
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("ccc");
		list.add("ddd");
		list.add("bbb");
		list.add("bbb");
		list.add("bbb");
		
//		System.out.println(Collections.max(list));
//		System.out.println(Collections.frequency(list, "bbb"));
		
//		List list2 = new ArrayList();
//		list2.add("");
//		list2.add("");
//		list2.add("");
//		list2.add("");
//		list2.add("");
//		list2.add("");
//		Collections.copy(list2, list);
		
		Collections.replaceAll(list, "bbb", "fff");
		
		System.out.println(list);
		
	}
	
	public List copy(List<String> list){
		List<String> list2 = new ArrayList<String>(list.size());
		for (int i = 0; i < list.size(); i++) {
			list2.add(list.get(i));
		}
		return list2;
	}
}
