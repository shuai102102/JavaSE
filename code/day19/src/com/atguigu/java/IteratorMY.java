package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class IteratorMY {

	@Test
	public void test(){
		List<String> list = new ArrayList<String>();
		String[] str = new String[]{"abc","bcd","das"};
		for (String s : str) {
			list.add(s);
		}
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
