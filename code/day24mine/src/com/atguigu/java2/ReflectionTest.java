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

/*
 * 通过反射创建类的对象
 */
public class ReflectionTest {

	@Test
	public void test() throws Exception{
		Class<Person> clazz = Person.class;
		
		Person p = clazz.newInstance();
		p.name = "小波波";
		p.age = 666;
		p.show();
		
		Constructor<Person>[] constructors = (Constructor<Person>[]) clazz.getConstructors();
		for (Constructor<Person> constructor : constructors) {
			System.out.println(constructor);
		}
	}
	
	/*
	 * 获取类中的所有的构造器
	 */
	@Test
	public void test2(){
		Class clazz = Student.class;                                        
		Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : declaredConstructors) {
			System.out.println(constructor);
			Class[] types = constructor.getParameterTypes();
			for (Class class1 : types) {
				System.out.print(class1 + "  ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor.toString());
		}
	}
	
	/*
	 * 获取类中的属性
	 */
	@Test
	public void test3(){
		Class clazz = Student.class;
		Field[] fields = clazz.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println("---------------------------");
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
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method);	
		}
		System.out.println("-----------------------------");
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
			
		}
		
	}
	
	/*
	 * 给类中的属性赋值，调用类中的方法 (必须得会)
	 * 		Field:	declaredField.set(student, "大傻街二傻号");
	 * 		Method: declaredMethod.invoke(student, "小婊砸");
	 */	
	@Test
	public void test5() throws Exception, Exception{
		Class<Student> clazz = Student.class;
		
		Student student = clazz.newInstance();
		
		Field declaredField = clazz.getDeclaredField("address");
		
		declaredField.setAccessible(true);
		
		declaredField.set(student, "大傻街二傻号");
		student.info();
		
		//根据方法名和形参列表的类型 获取对应的方法
		Method declaredMethod = clazz.getDeclaredMethod("say", String.class);
		declaredMethod.setAccessible(true);
		declaredMethod.invoke(student, "小婊砸");
	}
	
	/*
	 * 获取父类的泛型（必须会）
	 */
	@Test
	public void test6(){
		Class clazz = Student.class;
		Class superclass = clazz.getSuperclass();
		System.out.println(superclass);
		
		System.out.println("-------------------------------");
		Type type = clazz.getGenericSuperclass();
		System.out.println(type.getClass());
		
		ParameterizedType pt = (ParameterizedType) type;
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
		Annotation[] annotations = clazz.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
		
		Field field = clazz.getField("studentId");
		Annotation[] annotations2 = field.getAnnotations();
		for (Annotation annotation : annotations2) {
			System.out.println(annotation);
			
		}
	}
}


