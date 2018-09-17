package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

/*
* |-----Map
* 
* 		|-----HashMap : Map的主要实现类，线程不安全，效率高。底层是用数组实现的
* 				HashMap的key和value可以存放null.
* 
* 			|----LinkedHashMap : LinkedHashMap是HashMap的子类，底层的实现和HashMap一样。
* 					遍历的时候会安照添加元素的顺序进行输出。底层维护了一对针指（链表）用来记录存放元素的顺序。
* 
* 		|-----TreeMap :可以对key中元素的属性进行排序
* 
* 		|-----Hashtable :线程安全的，效率低。底层是用数组实现的。
* 				Hashtable的key和value不可以存放null.
* 
* 			|----properties :用来读取文件内容，key和value都是String类型，常常用来读取一些配置文件
* 
* 
* Map中的key:可以看成是set的集合。无序的不可重复的。 --> 自定义类需要重写equals和hashCode方法
* Map中的value : 可以看成是Collection集合。无序的可重复的。 --> 自定义类需要重写equals方法
* Map中的entry(一个键值对（key,value）) : 可以看成是无序的不可重复。entry在内存中的位置由key来决定。
* 
* 
* [面试题]HashMap和Hashtable的区别？
* 
* 
* 说明：
* 		1.new HashMap();创建一个空参的构造器，底层默认创建一个长度为16的数组，加载因子为0.75.
* 			当我们数组的元素超过12的时候，就会进行扩容。扩容为原来的2倍。
* 
* 		2.HashSet的底层就是HashMap
* 
* 		3.LinkedHashSet底层就是LinkedHashMap
* 
*       4.TreeSet底层就是TreeMap
* 
* [面试题]HashMap的底层实现原理？
* 		当我们向HashMap中添加一个元素a<k1,v1>.会根据a元素中的k1的hashCode的值来决定存储的位置。
* 当我们向该数组中的位置存储元素时，如果该位置没有其它元素则直接存放。如果该位置已经有了其它元素b<k2,v2>.
* 那么就会调用k1中的equals方法和k2进行比较。如果返回值是true那么v1会覆盖v2.如果返回值是false,a<k1,v1>会以链表的形式
* 存放到该位置。一旦链表的长度超过8就会改成以红黑树的形式进行存放。
* 		
*/
public class MapTest {
	
	/*
	 * Properties : 用来读取文件内容，key和value都是String类型
	 */
	@Test
	public void test6() throws Exception{
		//1.创建Properties的对象
		Properties properties = new Properties();
		//2.创建一个输入流
		FileInputStream fis = new FileInputStream(new File("person.properties"));
		//3.加载输入流
		properties.load(fis);
		//4.根据属性名获取值
		String name = properties.getProperty("name");
		String age = properties.getProperty("age");
		System.out.println(name + " " + age);
	}
	
	/*
	 * TreeMap : 可以对key中元素的属性进行排序
	 */
	@Test
	public void test5(){
		
		Comparator tor = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Person && o2 instanceof Person){
					Person p1 = (Person) o1;
					Person p2 = (Person) o2;
					return p1.name.compareTo(p2.name);
				}
				return 0;
			}
		};
		TreeMap map = new TreeMap(tor);
		map.put("aaa", 5555);
		map.put("ccc", 2222);
		map.put("ddd", 3333);
		map.put("fff", 1111);
		
		map.put(new Person("aa",12), "aaa");
		map.put(new Person("bb",15), "ccc");
		map.put(new Person("dd",13), "ddd");
		map.put(new Person("cc",18), "bbb");
		
		System.out.println(map);
	}
	
	/*
	 * LinkedHashMap
	 */
	@Test
	public void test4(){
		LinkedHashMap  map = new LinkedHashMap();
		map.put("aaa", "AAA");
		map.put("bbb", "BBB");
		map.put("ccc", "CCC");
		map.put("ddd", "DDD");
		System.out.println(map);
		
	}
	
	@Test
	public void test3(){
		Hashtable hashtable = new Hashtable();
		//不可以存放null
		//hashtable.put(null, null);
	}

	/*
	 * 
	 *  Object get(Object key) ://根据key的值获取对应的value值
		boolean containsKey(Object key) //当前集合中是否包含key
		boolean containsValue(Object value) //当前集合中是否包含value
		int size() : 集合中有多少个元素
		boolean isEmpty() ： 当前集合是否为空
		boolean equals(Object obj) ：  当前集合和obj中的元素是否相同

	 */
	@Test
	public void test(){
		HashMap map = new HashMap();
		map.put("aaa", "AAA");
		map.put("bbb", "BBB");
		map.put("ccc", "CCC");
		map.put("ddd", "DDD");
		map.put("fff", new Person("aaa",18));
		map.put(null, null);
		map.put(null, null);
		System.out.println(map);
		Object object = map.get("aaa");
		System.out.println(object);
		
		System.out.println(map.containsKey("aAa"));
		System.out.println(map.containsValue(new Person("aaa",18)));
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
	}
	
	/*
	 *  Set keySet() : 获取当前集合中所有的key值
		Collection values() : 获取当前集合中所有的value值
		Set entrySet() ：
	 */
	@Test
	public void test2(){
		HashMap map = new HashMap();
		map.put("aaa", "AAA");
		map.put("bbb", "BBB");
		map.put("ccc", "CCC");
		map.put("ddd", "DDD");
		
		Set keySet = map.keySet();
		for(Object obj : keySet){
			System.out.println(obj);
		}
		
		System.out.println("---------------------");
		
		Collection values = map.values();
		for(Object obj : values){
			System.out.println(obj);
		}
		
		
		System.out.println("--------------------------");
		
		Set entrySet = map.entrySet();
		for (Object obj : entrySet) {
			Map.Entry entry = (Entry) obj;
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		
		/*Set entrySet = map.entrySet();
		for(Object obj : entrySet){
			Map.Entry entry = (Entry) obj;
			System.out.println(entry.getKey() + "-----" + entry.getValue());
		}*/
	}
}
