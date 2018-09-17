package com.atguigu.java2;

import com.atguigu.java.Animal;

public class AnimalTest {

	public static void main(String[] args) {
		
		/*
		 * 不同包下 只能调用public所修饰的属性和方法
		 */
		Animal animal = new Animal();
		System.out.println(animal.namePublic);
		animal.sayPublic();
	}
}

/*
 * 不同包下的子类 可以调用父类中的  protected 和  public 所修饰的属性和方法
 */
class Animal2 extends Animal{
	
	public void show(){
		System.out.println(nameProtected);
		System.out.println(namePublic);
		
		sayProtected();
		sayPublic();
	}
}
