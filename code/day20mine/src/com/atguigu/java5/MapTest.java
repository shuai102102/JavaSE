package com.atguigu.java5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class MapTest {
	
	@Test
	public void test(){
	HashMap map = new HashMap();
	map.put("aaa", "AAA");
	map.put("bbb", "BBB");
	
	Set entry = map.entrySet();
	for(Object obj : entry){
		
		Map.Entry en = (Entry) obj;
		System.out.println(en.getValue());
		}
		
	
	}
	
	
	
}
