package com.atguigu.java3;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {

	public static void main(String[] args) {

		/*
		 * 类A是类B的父类 那么A<G>和B<G>具有子父类关系 ： A<G> = B<G> 类A是类B的父类 那么G<A> 和
		 * G<B>不具有子父类关系<
		 */
		// Animal<String> animal = new Student<String>();
		//
		// ArrayList<Student> list = null;
		// list = new ArrayList<Student>();
		//
		// ArrayList<String> list2 = null;
		// list2 = new ArrayList<String>();
		//
		AnimalTest test = new AnimalTest();
		// test.set(list);
		// test.set(list2);

		System.out.println("----------------------");

		/*
		 * 通配符：？ - 是所有泛型类型的父类 1.可以读取 2.只能写入null
		 */

		List<?> list3 = null;
		List<String> list4 = new ArrayList<String>();
		list4.add("aaaa");
		list4.add("bbb");
		list3 = list4;

		list3.add(null);

		for (Object obj : list3) {
			System.out.println(obj);
		}

		// test.set(list4);
		test.set(new ArrayList<Integer>());
		test.set(new ArrayList<Number>());
		// test.set(new ArrayList<Object>());
		
		test.set2(new ArrayList<Number>());
		test.set2(new ArrayList<Object>());

	}

	/*
	 * ? extends Number : 泛型的类型只能是Number以及子类
	 * 
	 * ? super Number : 泛型的类型只能是Number以及父类
	 * 
	 */
	public void set(List<? extends Number> list) {

	}

	public void set2(List<? super Number> list) {

	}
}

class Animal<T> {

}

// class Student<T> extends Animal<T>{
//
// }
