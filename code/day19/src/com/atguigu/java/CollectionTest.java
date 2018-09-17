package com.atguigu.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CollectionTest {

	
	@Test
	public void test(){
		String[] str = {"aa","bb"};
		int[] i = new int[]{1,2,34};
		List<String>  asList = Arrays.asList(str);
		
		for (Object object : asList) {
			System.out.println(object);
		}
		
		List<int[]> asList2 = Arrays.asList(i);
		for (int[] js : asList2) {
			System.out.println(js);
		}
	}
}
