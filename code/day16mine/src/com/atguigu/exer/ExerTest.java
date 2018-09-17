package com.atguigu.exer;

import org.junit.Test;

import com.atguigu.java.Person;

public class ExerTest {
	
	@Test
	public void test(){
		
		Object o1 = true? new Integer(1) : new Double(2.0);
		
		System.out.println(o1);//1.0
		
	}

	@Test
	public void test2(){
		Person person = new Person();
		//自动装箱
		person.equals(10);
	}
	
	@Test
	public void test3(){
		Object o2;
		if(true)
			o2 = new Integer(1);
		else
			o2 = new Double(2.0);
		
		System.out.println(o2);//1
	}
	
	@Test
	public void test4(){
			
		Integer i = new Integer(1);	
		Integer j = new Integer(1);
		System.out.println(i == j);//fasle
		
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);//true
		
		Integer x =128;
		Integer y =128;
		System.out.println(x == y);//fasle

	}
}
