package com.atguigu.java2;

/*
 * 自定义泛型类 ，泛型接口，泛型方法
 */
public class Person<T> {

	T t;
	
	public void set(T t){
		this.t = t;
	}
	
	public T getT(){
		return t;
	}
	
	/*
	 * 泛型方法
	 * 格式  ： 权限修饰符  <泛型> 返回值类型  方法名（泛型  变量名）{
	 * 		 }
	 */
	public <K> K getE(K e){
		
		return e;
	}
}
