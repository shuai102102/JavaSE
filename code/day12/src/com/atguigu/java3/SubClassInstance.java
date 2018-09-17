package com.atguigu.java3;

/*
 * 
 * 子类对象的实例化过程（了解）：
 * 
 * 结果上：继承性- 子类继承父类以后就能获取父类中的结构（属性，方法）
 * 			子类对象可以直接或间接的调用到父类中的属性和方法。
 * 
 * 过程上：通过子类创建对象一定会调到直接父类，间接父类......直到Object的构造器。
 * 			通过调用到所有类的构造器，将这些类加载到内存中。那么就可以调用到父类中的属性和方法了。
 * 
 * 
 * 注意：虽然父类也会被加载到内存中。但自始之终我们只认为创建了子类一个对象。
 * 
 */
public class SubClassInstance {

	public static void main(String[] args) {
		
		Student student = new Student("小龙哥","哈佛大学");
		System.out.println(student.name);
		System.out.println(student.schoolName);
		
	}
}
