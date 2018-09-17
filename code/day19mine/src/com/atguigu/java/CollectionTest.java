package com.atguigu.java;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CollectionTest {
	
	@Test
	public void test(){
		String[] str = {"aa","bb"};
		List asList = Arrays.asList(str);
		for(String name : str)
			System.out.println(name);
		System.out.println("---------------");
		System.out.println(asList);
	}
}
