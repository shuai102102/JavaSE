package com.atguigu.java2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class ReflectionTest3 {

	@Test
	public void test() throws Exception{
		//1.获取一个系统类加载器
		ClassLoader classloader = ClassLoader.getSystemClassLoader();
		System.out.println(classloader);
		//2.获取系统类加载器的父类加载器，即扩展类加载器
		ClassLoader parent = classloader.getParent();
		System.out.println(parent);
		//3.获取扩展类加载器的父类加载器，即引导类加载器
		ClassLoader parent2 = parent.getParent();
		System.out.println(parent2);
		//4.测试当前类由哪个类加载器进行加载
		ClassLoader parent3= Class.forName("java.lang.String").getClassLoader();
		System.out.println(parent3);
	}
	
	/*
	 * 必须掌握
	 */
	@Test
	public void test2() throws Exception{
		Properties properties = new Properties();
		
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("com/atguigu/demo/aaa.txt");
		properties.load(is);
		
		String name = properties.getProperty("name");
		System.out.println(name);
	}
}
