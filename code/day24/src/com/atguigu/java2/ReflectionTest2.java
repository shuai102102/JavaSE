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
			//System.out.print(modifiers);
			System.out.print(Modifier.toString(modifiers) + " ");
			
			//获取属性的类型
			Class type = field.getType();
			System.out.print(type + " ");
			
			//获取属性名
			System.out.print(field.getName());
			
			System.out.println();
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
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method method : declaredMethods) {
			//获取方法的权限修饰符
			System.out.print(Modifier.toString(method.getModifiers()) + " ");
			//获取返回值类型
			Class returnType = method.getReturnType();
			System.out.print(returnType + " ");
			//方法名
			System.out.print(method.getName());
			//获取方法中的形参
			Class<?>[] types = method.getParameterTypes();
			for (Class<?> class1 : types) {
				System.out.print(class1 + " ");
			}
			
			
			System.out.println();
			
		}
	}
}
