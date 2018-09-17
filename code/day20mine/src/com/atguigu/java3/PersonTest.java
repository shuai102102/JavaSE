package com.atguigu.java3;

import java.util.ArrayList;
import java.util.Collection;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Student<Integer> student = new Student<Integer>();
		student.setT(1111);
		
		A<String> a = new A<String>();
		a.setT("sad");
		
//		Collection<int> c = new ArrayList<int>();
	}

}

class Person<T>{
	
	T t;
	
	public T getT(){
		return t;
	}
	
	public void setT(T t){
		this.t = t;
	}
}


class Student<T> extends Person<T>{
	
}

class A<T> extends Person<T>{}

