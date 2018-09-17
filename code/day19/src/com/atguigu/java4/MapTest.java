package com.atguigu.java4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/*
 * 
 * |-----Map
 * 
 * 		|-----HashMap : Map的主要实现类
 * 			|----LinkedHashMap
 * 
 * 		|-----TreeMap :
 * 
 * 		|-----Hashtable :
 * 			|----properties :
 * 
 * 
 * Map中的key:可以看成是set的集合。无序的不可重复的。 --> 自定义类需要重写equals和hashCode方法
 * Map中的value : 可以看成是Collection集合。无序的可重复的。 --> 自定义类需要重写equals方法
 * Map中的entry : 可以看成是无序的不可重复。entry在内存中的位置由key来决定。
 * 
 * 
 */
public class MapTest {

	/*
	 *  Object put(Object key,Object value)//将一对key和value存放到当前集合中
		Object remove(Object key) //将key值为key的元素从当前集合中移除
		void putAll(Map t) //将t中的所有元素添加到当前集合中
		void clear()  //清除所有元素

	 */
	@Test
	public void test(){
		Map map = new HashMap();
		map.put("aaa", "AAA");
		map.put("bbb", "BBB");
		map.put("ccc", "CCC");
		map.put("ddd", "DDD");
		//如果该集合中有相同的key值那么value进行覆盖。
		map.put("aaa", "FFF");
		map.put("bbb", "abcd");
		
//		map.remove("aaa");
//		
//		Map map2 = new HashMap();
//		map2.put("111", "111");
//		map2.put("222", "222");
//		map.putAll(map2);
//		
//		map.clear();
		
		
		map.put(new Person("aa",18), "AAAAA");
		map.remove(new Person("aa",18));
		
		Set entrySet = map.entrySet();
//		System.out.println(entrySet);
		
		
		
		System.out.println(map);
	}
}
