package com.atguigu.java2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.junit.Test;

import com.atguigu.java3.Person;
import com.atguigu.java3.Student;

public class ReflectionTest {

	/*
	 * 通过反射创建类的对象
	 */
	@Test
	public void test() throws Exception{
		//第一步 获取Class
		Class<Person> clazz = Person.class;
		//通过反射创建对象 根据空参的public所修饰的进行创建对象
//		Person p = clazz.newInstance();
//		p.name = "小龙哥";
//		p.age = 666;
//		p.show();
		
		/*
		 * 
		 * 测试public修饰的带参的构造器进行创建对象
		 */
//		Constructor<Person> constructor2 = clazz.getConstructor(String.class);
//		Person p3 = constructor2.newInstance("小刚刚");
//		p3.show();
		
		System.out.println("--------------------");
		//获取除public修饰的构造器-带参数的（参数类型是String类型）
		Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class);
		//允许访问非public修饰的构造器
		constructor.setAccessible(true);
		//创建对象并给构造器进行传参
		Person p2 = (Person) constructor.newInstance("aaa",18);
		p2.show();
		
	}
	
	/*
	 * 获取类中的所有的构造器
	 */
	@Test
	public void test2(){
		//第一步获取Class
		Class clazz = Person.class;
		//获取public修饰的构造器
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor constructor : constructors) {
			//System.out.println(constructor);
			//获取构造器中的参数类型
			Class[] types = constructor.getParameterTypes();
			for (Class class1 : types) {
				System.out.print(class1 + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("------------------------------");
		//获取所有的构造器
		Constructor[] constructors2 = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors2) {
			System.out.println(constructor);
		}
		
	}
	
	/*
	 * 获取类中的属性
	 */
	@Test
	public void test3(){
		Class<Student> clazz = Student.class;
		//获取类中的public所修饰的属性,包括父类中的public所修饰的
		Field[] fields = clazz.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println("-----------------------");
		
		//获取类中所有的属性-不包括父类中的
		Field[] declaredFields = clazz.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field);
		}
	}
	
	/*
	 * 获取中类中的方法
	 */
	@Test
	public void test4(){
		Class clazz = Student.class;
		//获取类中的public所修饰的方法,包括父类中的public所修饰的方法
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		
		System.out.println("------------------");
		//获取类中所有的方法-不包括父类中的方法
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
		}
	}
	
	/*
	 * 给类中的属性赋值，调用类中的方法 (必须得会)
	 */
	@Test
	public void test5() throws Exception, Exception{
		Class<Student> clazz = Student.class;
		Student student = clazz.newInstance();
		//给类中的属性进行赋值
		Field field = clazz.getDeclaredField("address");
		//允许访问所有权限修饰符所修饰的属性
		field.setAccessible(true);
		//给student对象中的address属性进行赋值 "二傻路大傻号"
		field.set(student, "二傻路大傻号");
		student.info();
		
		//根据方法名和形参列表的类型 获取对应的方法
		Method declaredMethod = clazz.getDeclaredMethod("say", String.class);
		//允许访问所有权限修饰的方法
		declaredMethod.setAccessible(true);
		declaredMethod.invoke(student, "大哥大");
	}
	
	/*
	 * 获取父类的泛型（必须会）
	 */
	@Test
	public void test6(){
		Class clazz = Student.class;
		Class superclass = clazz.getSuperclass();
		System.out.println(superclass);
		
		System.out.println("-----------------------------");
		//获取带泛型的父类
		Type type = clazz.getGenericSuperclass();
		System.out.println(type.getClass());
		ParameterizedType pt = (ParameterizedType) type;
		//获取泛型的类型的数组
		Type[] actualTypeArguments = pt.getActualTypeArguments();
		for (Type type2 : actualTypeArguments) {
			System.out.println(type2);
		}
			
	}
	
	/*
	 * 获取注解
	 */
	@Test
	public void test7() throws Exception, Exception{
		Class clazz = Student.class;
		//拿到的是类上的注解
		Annotation[] annotations = clazz.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
		
		//拿属性上的注解
		Field field = clazz.getField("studentId");
		Annotation[] annotations2 = field.getAnnotations();
		for (Annotation annotation : annotations2) {
			System.out.println(annotation);
		}
	}
}
