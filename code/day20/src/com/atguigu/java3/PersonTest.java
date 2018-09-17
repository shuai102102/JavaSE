package com.atguigu.java3;

public class PersonTest {

	public static void main(String[] args) {
		
		Student<Integer> student = new Student<Integer>();
		student.setT(1111);
	}
}

/*
 * 注意：
 * 1.有泛型类型的方法和属性不可以使用static
 * 2.try-catch中不能使用泛型(catch后面的异常类型)
 */
class Person<T>{
	T t;
	
	public Person(){
		
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
		
	}
	
}
/*
 * 子类继承父类,如果子类要给父类的指明具体的泛型类型可以有两种方式;
 * 1.子类可以在继承父类的时候直接指明父类泛型的类型 : class Student extends Person<String>
 * 2.子类在继承父类的时候不指明父类泛型的类型，而是在子类对象创建的时候指明。class Student<T> extends Person<T>
 * 
 */
class Student<T> extends Person<T>{
	
}
