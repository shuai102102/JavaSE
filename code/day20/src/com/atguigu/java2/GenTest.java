package com.atguigu.java2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import com.atguigu.java.Person;

/*
 *  1.在集合中使用泛型 (掌握)
	2.自定义泛型类 自定义泛型接口 自定义泛型方法 （熟练）
	3.泛型在继承上的体现（掌握）
	4.通配符的使用（掌握）

 */
public class GenTest {

	@Test
	public void test(){
		
		List list = new ArrayList();
		//1.第一个问题 数据安全问题
		list.add("aaa");
		list.add(111);
		list.add("abc");

		for(Object obj : list){
			//1.第二个问题 是向下转型
			String str = (String) obj;
			
			System.out.println(obj);
		}
	}
	
	public void set(List list){
		
	}
	
	/*
	 * 集合中使用泛型
	 * 1.当我们创建对象的时候，一旦指明泛型的类型那么内部所有的泛型都被具体化了。
	 * 2.当我们创建对象的时候，如果没有指明泛型的类型，那么泛型的类型默认是Object
	 */
	@Test
	public void test2(){
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		String string = list.get(0);
		
		Set<String> set = new HashSet<String>();
		set.add("aaa");
		
		Set<Person> p = new HashSet<Person>();
		p.add(new Person("aa",18));
		
		Map<String,String> map = new HashMap<String,String>();
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			entry.getValue();
			entry.getKey();
		}
		
		
	}
}
