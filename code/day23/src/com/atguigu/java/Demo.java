package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Demo {

	@Test
	public void test(){
		
		List list = new ArrayList();
		list.add("aaa");
		
		ArrayList al = (ArrayList) list;
		System.out.println(al);
	}
}
