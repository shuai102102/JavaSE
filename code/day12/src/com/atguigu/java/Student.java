package com.atguigu.java;

import com.atguigu.exer2.Circle;
import com.atguigu.exer2.Cylinder;
import com.atguigu.exer2.Shape;

public class Student extends Person {

	String schoolName;
	
	
	public void study(){
		System.out.println("学生正在学习");
	}
	
	/*
	 * 子类重写的方法的返回值类型  不大于 父类被重写的方法的返回值类型。（父类的大 子类的小）
	 */
	public Cylinder info(){
		return null;
	}
	/*
	 * 父类被重写的方法的返回值类型是 double   子类重写的方法的返回值类型是int  (不可以，double和int没有子父类关系)
	 */
//	public float getComputer(){
//		return 1;
//	}
	
	/*
	 * 子类重写的方法的 权限修饰符 不小于 父类被重写的方法的权限修饰符.(private 缺省的  protected public)
	 */
//	protected  void show(){
//		//System.out.println(schoolName + age + name + sex);
//	}
	
	@Override
	protected void show() {
		
	}
	
	/*
	 * 我们不认为父类中被private修饰的方法可以被重写
	 */
	private void run() {

	}
}
