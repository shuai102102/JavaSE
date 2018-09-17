package com.atguigu.java2;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {

		Person<String> person = new Person<String>();
		person.set("aaa");
		System.out.println(person.getT());

		Student<String, Integer> student = new Student<String, Integer>();
		student.setK("小苍老师");
		student.setV(111);

		System.out.println(student.getK());
		System.out.println(student.getV());

		English<String> english = new English<String>() {

			@Override
			public String getT() {
				return "小泽老师";
			}
		};

		System.out.println(english.getT());
	}

	/*
	 * 泛型方法的使用
	 */
	@Test
	public void test2() {
		Student2 student2 = new Student2();
		String e = student2.getE("aaa");
		Integer e2 = student2.getE(new Integer(111));
		System.out.println(e + " " + e2);

		// Person<String> person = new Person<String>();
		//
		// Integer e3 = person.getE(new Integer(111));

		/*
		 * 注意：在泛型方法所在的类中，如果该类是一个泛型类，
		 * 那么泛型类必须进行具体泛型类型的指明。否则泛型方法中的泛型默认是Object
		 */
		Person person = new Person();
		Object e3 = person.getE("aaa");

	}
}
