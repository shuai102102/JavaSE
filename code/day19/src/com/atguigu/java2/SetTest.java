package com.atguigu.java2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

/*Set 
 * 		HashSet	 LinkedHashSet
 * 
 * |----Set
 * 		
 * 		|-----HashSet : Set的主要实现类
 * 
 * 			|-----LinkedHashSet
 * 
 * 		|-----TreeSet
 * 
 * 
 * Set的特点：存储的元素是无序的且不可重复的
 * 
 * 
 * 无序性：无序不是指的随机性。指的是根据hashCode方法算出的哈希值来决定元素存储的位置
 * 
 * 不可重复的:如果是自定义类指的是两个对象equals后的结果。如果是true认为内容一样，如果是false内容不一样
 * 
 * 
 * [面试题]HashSet的底层实现原量？
 * 		当我们向HashSet中添加元素a时。会先根据hashCode方法算出一个哈希值。哈希值决定了元素在数组中存放的位置 。
 * 当我们根据哈希值向数组中相应的位置添加元素时，如果该位置已经存在元素b。会调用a对象中的equals方法进行比较。
 * 如果返回值是true说明内容相同，不同进行添加。如果返回值是false说明内容不同，以链表的形式进行添加。链表一旦数量超过8
 * 底层将改用成红黑树的方式进行存储（链表改成了红黑树）如果该位置没有其它任何元素则直接添加。
 * 
 * 
 * 注意：向Set中添加元素时，如果是自定义类，必须重写equals方法和hashCode方法
 * 
 */
public class SetTest {

	@Test
	public void test(){
		Set set = new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add("eee");
		set.add("aaa");
		set.add(new Person("aa",18));
		set.add(new Person("aa",18));
		set.add(new Person("a",18));
		
		for (Object obj : set) {
			System.out.println(obj);
		}
		System.out.println(set);
		
	}
	
	/*
	 * LinkedHashSet:LinkedHashSet是HashSet的子类和HashSet底层实现一样，
	 * LinkedHashSet可以安照添加元素时的顺序
	 * 进行遍历。LinkedHashSet底层维护了一对指针（链表）用来记录元素存放的顺序。
	 */
	@Test
	public void test2(){
		LinkedHashSet  set = new LinkedHashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add("eee");
		System.out.println(set);
	}
}
