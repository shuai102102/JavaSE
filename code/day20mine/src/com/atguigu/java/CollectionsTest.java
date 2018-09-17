package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Person> list2 = new ArrayList<Person>();
//		list.add("aaa");
//		list.add("ccc");
//		list.add("ddd");
//		list.add("bbb");
		list2.add(new Person("aa",16));
		list2.add(new Person("cc",15));
		list2.add(new Person("dd",18));
		list2.add(new Person("ff",19));
		list2.add(new Person("ee",20));
		
		System.out.println(list);
		
//		Collections.reverse(list);
		
//		Collections.shuffle(list);
		
//		Collections.sort(list);
		
		Collections.sort(list2, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if(o1 instanceof Person && o2 instanceof Person){
					Person p1 = o1;
					Person p2 = o2;
					return p1.age - p2.age;
					
				}
				return 0;
			}
		});
		
//		Collections.swap(list2, 1, 2);
		System.out.println(list2);
		
	}
}
