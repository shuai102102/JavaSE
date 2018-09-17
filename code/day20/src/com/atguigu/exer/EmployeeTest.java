package com.atguigu.exer;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String[] args) {
		
		/*
		 * 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（下一章：TreeSet 需使用泛型来定义）
			分别按以下两种方式对集合中的元素进行排序，并遍历输出：
			
			1). 使Employee 实现 Comparable 接口，并按 name 排序
			2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。
			
			提示：Employee类是否需要重
			写equals()方法？MyDate类呢？
		 */
		
		Employee employee = new Employee("aa", 18, new MyDate(1, 20, 2000));
		Employee employee2 = new Employee("bb", 17, new MyDate(2, 20, 2001));
		Employee employee3 = new Employee("cc", 16, new MyDate(5, 18, 2002));
		Employee employee4 = new Employee("ee", 15, new MyDate(4, 20, 2004));
		Employee employee5 = new Employee("dd", 14, new MyDate(6, 20, 2004));
		
		TreeSet set = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Employee && o2 instanceof Employee){
					Employee e1 = (Employee) o1;
					Employee e2 = (Employee) o2;
					return e1.getBirthday().compareTo(e2.getBirthday());
				}
				return 0;
			}
		});
		set.add(employee);
		set.add(employee2);
		set.add(employee3);
		set.add(employee4);
		set.add(employee5);
		
		System.out.println(set);
	}
}
