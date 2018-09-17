package com.atguigu.java2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Test;

import com.atguigu.java3.Student;

public class ReflectionTest2 {
	/*
	 * 通过反射获取属性 （重点）
	 */
	@Test
	public void test(){
		/*
		 * public int com.atguigu.java3.Student.studentId
		   private java.lang.String com.atguigu.java3.Student.address

		 */
		
		Class clazz = Student.class;
		
		Field[] declaredFields = clazz.getDeclaredFields();
		
		for (Field field : declaredFields) {
			//获取属性的权限修饰符
			int modifiers = field.getModifiers();
			System.out.println(modifiers);
			System.out.println(Modifier.toString(modifiers));
			
			//获取属性的类型
			Class<?> type = field.getType();
			System.out.println(type);
			
			//获取属性名
			String name = field.getName();
			System.out.println(name);
		}
	}
	
	/*
	 * 通过反射获取方法（重点）
	 * 
	 * 
	 */
	@Test
	public void test2(){
		Class clazz = Student.class;
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			//获取方法的权限修饰符
			int modifiers = method.getModifiers();
			System.out.println(Modifier.toString(modifiers));
			
			//获取返回值类型
			Class<?> returnType = method.getReturnType();
			System.out.println(returnType);
			
			//方法名
			String name = method.getName();
			System.out.println(name);
			
			//获取方法中的形参
			Class<?>[] parameterTypes = method.getParameterTypes();
			for (Class<?> class1 : parameterTypes) {
				System.out.println(class1);
			}
		}
	}
}
