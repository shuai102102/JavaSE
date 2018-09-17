package com.atguigu.java3;

/*
 * 
 * 单例设计模式 ： 对某个类在该项目中只能有一个实例
 * 
 * 设计模式：常见的是23种设计模式。设计模式是在大量的实践中总结和理论化之后优选的代码结构、编程风格、以及解决问题的思考方式
 * 
 * 单例设计模式 ：饿汉式 vs 懒汉式 （会背写）
 * 
 * 饿汉式和懒汉式的区别？
 * 
 * 		饿汉式：线程安全的
 * 		懒汉式：①线程不安全的  ②延迟了创建对象的时机，节省了一定的内存
 * 	
 * 
 */
public class SingletonTest {

	public static void main(String[] args) {
		
		Bank2 bank = Bank2.getInstance();
		Bank2 bank2 = Bank2.getInstance();
		Bank2 bank3 = Bank2.getInstance();
		System.out.println(bank);
		System.out.println(bank2);
		System.out.println(bank3);
		
	}
}

//饿汉式
class Bank{
	//1.私有化构造器
	private Bank(){}
	//2.创建一个Bank的对象 并且用private和static修饰
	private static Bank bank = new Bank();
	//3.创建一个公共的静态方法返回当前类的对象
	public static Bank getInstance(){
		return bank;
	}
}

//懒汉式
class Bank2{
	//1.私有化构造器
	private Bank2(){}
	//2.声明一个该类的引用。并用private和static修饰
	private static Bank2 bank = null;
	//3.提供一个公共的静态方法，返回当前类的对象。
	//4.在方法中创建该类的对象。
	public static Bank2 getInstance(){
		if(bank == null){
			bank = new Bank2();
		}
		return bank;
	}
}
