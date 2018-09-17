package com.atguigu.java2;

/*
 * 
 * 多线程：
 * 
 * 多线程创建的方式有两种：
 * 1.继承Thread
 * 2.实现Runnable接口
 * 
 * 两种方式的不同：
 * 1.继承Thread的方式是通过继承来实现的。而Java中的类是单继承。
 * 		实现Runnable接口的方式是通过实现接口来实现的。Java中类和接口之间是多实现
 * 2.实现Runnable接口的方式 - 多个线程可以共享同一个接口子类的对象，非常适合多个相同线程来处理同一份资源
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		//创建Thread子类的对象
		MyThread myThread = new MyThread("小泽泽");
		//通过Thread子类对象调用start方法
		myThread.start();
		
		/*
		 * 如何再次开启一个分线程:
		 * 再次创建Thread子类的对象
		 */
		//myThread.start();
		
		/*
		 * start方法的作用：1.开启一个分线程  2.调用这个线程中的run方法
		 */
		MyThread myThread2 = new MyThread("小龙龙");
		myThread2.start();
		//myThread2.run();不可以这么调用，并没有开启一个分线程
		
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println(Thread.currentThread().getName() + "======:" + i);
//		}
		
		
		/*
		 * 创建两个线程 ： 第一个线程输出100以内的偶数   第二个线程输出100以内的奇数
		 */
		
	}
}

/*
 * 第一种方式：继承Thread
 * 1.自定义一个类并继承Thread
 * 2.重写run方法
 * 3.创建Thread子类的对象
 * 4.通过Thread子类对象调用start方法
 */

//自定义一个类并继承Thread
class MyThread extends Thread{
	
	public MyThread(String name){
		super(name);
	}
	
	//重写run方法
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "========:" + i);
		}
	}
}
