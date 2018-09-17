package com.atguigu.java;

/*
 * 
 * 方法的重写 ： 子类可以对父类中同名同参数的方法进行重写（覆盖，覆写） Override
 * 
 * 说明：
 * 		1.创建子类对象，当子类对象调用子类和父类中同名同参的方法时，实际调用的是子类重写了父类的方法。
 * 
 * 方法的格式： 
 * 			权限修饰符   返回值类型   方法名（形参列表）{
 * 				方法体;
 * 			}
 * 
 * 			子类重写的方法（Student中的show方法）  ， 父类被重写的方法（Person中的show方法）
 * 
 * 			1.子类重写的方法的 权限修饰符 不小于 父类被重写的方法的权限修饰符.(private 缺省的  protected public)
 * 
 * 			2.子类重写的方法的返回值类型  不大于 父类被重写的方法的返回值类型。（父类的大 子类的小）
 * 				父类被重写的方法的返回值类型是 double   子类重写的方法的返回值类型是int  (不可以，double和int没有子父类关系)
 * 				父类被重写的方法是  Circle  子类重写的方法只能是Circle和 Cylinder (Circle是Cylinder的父类)
 * 				父类被重写的方法是void  子类重写的方法只能是void
 * 
 * 			3.子类重写的方法必须和父类被重写的方法的名字和形参列表一致。
 * 
 * 			4.子类重写的方法抛出的异常的类型  不大于 父类被重写的方法抛出的异常的类型
 * 
 *          注意:
 *          	1.子类和父类同名同参的方法 要么同时加static要么同时不加static. (如果同时加static也不是重写和被重写的关系)
 *          	2.我们不认为父类中被private修饰的方法可以被重写
 */
 class OverrideTest {

	public static void main(String[] args) {
		
		
		Student student = new Student();
		student.age = 16;
		student.name = "小龙哥";
		student.sex = 1;
		student.schoolName = "清华大学";
		student.show();
		student.info();
	}
}
