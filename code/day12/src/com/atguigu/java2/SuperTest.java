package com.atguigu.java2;

/*
 * Super :  父类的
 * 
 * super可以调用 属性，方法，构造器 （父类的）
 * 
 * super调用属性和方法：
 * 		在方法和构造器中，可以通过super.属性和super.方法调用父类中的属性和方法。往往我们会省略掉"super."。
 * 	但是如果子类中的属性和父类中的属性名相同或者子类重写了父类中的方法的时候。如果要调用父类中的属性和被重写的方法那么就必须
 *  使用"super."。
 * 			
 * super调用构造器：
 *  	格式：super(形参列表)
 *  
 		说明：
 			1.super(形参列表)调用父类的构造器
 			2.super(形参列表)只能放在构造器中的首行
 			3.在子类中的构造器中，一个构造器只能有一个super(形参列表)
 			4.一个构造器中this(形参列表)和super(形参列表)只能有其中的一个
 			5.一个构造器中如果没有显示的调用this(形参列表)或者super(形参列表)，那么默认调用的是super();
 			
 *  	
 *  出现的问题 ：Implicit super constructor Person() is undefined. 
 *  Must explicitly invoke another constructor		
 *  解决方式一: 父类提供一个空参的构造器
 *  解决方式二 ：子类的构造器调用父类指定的带参的构造器　
 */
public class SuperTest {

	public static void main(String[] args) {
		
//		Person person = new Person("小泽泽");
//		Student stu = new Student("东京热大学");
//		stu.show();//方法的重写
//		stu.study();
//		
//		stu.showField();
		
		Student student = new Student();
		System.out.println(student.name);
		
		
		
	}
}
