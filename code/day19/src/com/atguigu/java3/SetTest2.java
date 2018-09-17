package com.atguigu.java3;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

/*
 * 
 * TreeSet:
 * ①底层是使用红黑树进行存储的
 * ②可以根据某个属性进排序
 * 
 * 注意：1.TreeSet中添加的元素的类型必须保持一致。
 *      2.TreeSet根据comparTo的结果来决定两个元素是否一样
 *      
 *      
 * 排序：自然排序  vs 定制排序
 * 
 * 自然排序：
 * 1.实现Comparable接口
 * 2.重写comparTo方法
 * 3.安照某个属性进行排序
 * 4.向集合中添加元素
 * 
 * 
 * 
 * 定制排序：
 * 1.创建一个Comparator接口的实现类 
 * 2重写compare方法
 * 3.安照某个属性进行排序
 * 4.将Comparator接口实现类的对象传入TreeSet构造器中
 * 5.添加元素` 
 * 
 * 
 * 问题：定制排序和自然排序都存在的情况下哪个管用？两种排序方式哪个更好？
 * 		1.定制排序
 * 		2.定制排序更加灵活
 */
public class SetTest2 {

	@Test
	public void test(){
		TreeSet set = new TreeSet();
//		set.add(1);
//		set.add(30);
//		set.add(20);
//		set.add(18);
//		set.add(16);
		
//		set.add("aaa");
//		set.add("fff");
//		set.add("ddd");
//		set.add("ccc");
//		set.add("bbb");
		
		
		set.add(new Student("aaa",18));
		set.add(new Student("ccc",18));
		set.add(new Student("fff",15));
		set.add(new Student("ddd",13));
		System.out.println(set);
	}
	
	
	/*
	 * 定制排序
	 * 1.创建一个Comparator接口的实现类
	 * 2.重写compare方法
	 * 3.安照某个属性进行排序
	 * 4.将Comparator接口实现类的对象传入TreeSet构造器中
	 * 5.添加元素
	 */
	@Test
	public void test2(){
		
		Comparator c = new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Student2 && o2 instanceof Student2){
					Student2 stu = (Student2) o1;
					Student2 stu2 = (Student2) o2;
					return stu.name.compareTo(stu2.name);
				}
				return 0;
			}
		};
		
		TreeSet set = new TreeSet(c);
		set.add(new Student2("aaa",18));
		set.add(new Student2("ccc",18));
		set.add(new Student2("fff",15));
		set.add(new Student2("ddd",13));
		System.out.println(set);
	}
	
	/*
	 * 定制排序更灵活一些
	 */
	public void test5(Comparator c){
		TreeSet set = new TreeSet(c);
		set.add(new Student2("aaa",18));
		set.add(new Student2("ccc",18));
		set.add(new Student2("fff",15));
		set.add(new Student2("ddd",13));
		System.out.println(set);
	}
}
