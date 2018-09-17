package com.atguigu.java3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class SetTestMy {

	@Test
	public void test(){
		
		Comparator<Object> c = new Comparator<Object>() {

			@Override
			public int compare( Object o1, Object o2) {
				if(o1 instanceof Student2 && o2 instanceof Student2){
					Student2 s1 = (Student2)o1;
					Student2 s2 = (Student2)o2;
					return s1.name.compareTo(s2.name);
				}
				return 0;
			}
		};
		
		Set<Student2> set = new TreeSet<>(c);
		
		set.add(new Student2("aaa",18));
		set.add(new Student2("ccc",18));
		set.add(new Student2("fff",15));
		set.add(new Student2("ddd",13));
		
		System.out.println(set);
	}
	
	@Test
	public void test2(){
		TreeSet<StudentMy> set = new TreeSet<>();
		set.add(new StudentMy("aaa",18));
		set.add(new StudentMy("ccc",18));
		set.add(new StudentMy("fff",15));
		set.add(new StudentMy("ddd",13));
		System.out.println(set);
	}
}
