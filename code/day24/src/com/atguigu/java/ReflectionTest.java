package com.atguigu.java;

import org.junit.Test;

/*
 * 
 * 反射:
 */
public class ReflectionTest {

	/*
	 * 
	 * Class类
	 * 1.Class是反射的源头
	 * 2.将字节码文件加载到JVM中，那么我们就可以认为加载进来的字节码文件就是Class的实例（Person.class）
	 * 3.加载到JVM中的字节码文件，我们也可以叫做运行时类。
	 * 4.类的加载只加载一次
	 * 
	 * 获取Class的实例的四种方式：要求-前三种必须掌握
	 */
	@Test
	public void test() throws Exception{
		//第一种方式 : 类名.class
		Class clazz = Person.class;
		//第二种方式 ：对象名.getClass
		Person person = new Person();
		Class clazz2 = person.getClass();
		//第三种方式：Class.forName("全类名")
		Class clazz3 = Class.forName("com.atguigu.java.Person");
		//第四种方式：
		//获取类加载器
		ClassLoader classLoader = this.getClass().getClassLoader();
		//能过类加载器获取类的实例
		Class clazz4 = classLoader.loadClass("com.atguigu.java.Person");
	}
	
	
	@Test
	public void test2(){
		newObject("com.atguigu.java.Person");
		newObject("com.atguigu.java.Student2");
		
//		new Student2();
	}
	
	
	public void newObject(String pathClass){
		try {
			Class clazz = Class.forName(pathClass);
			Object newInstance = clazz.newInstance();
			System.out.println(newInstance.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
