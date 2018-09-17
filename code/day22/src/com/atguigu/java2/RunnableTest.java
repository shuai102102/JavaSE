package com.atguigu.java2;

/*
 * 
 * 实现多线程的第二种方式：实现Runnable接口
 * 
 */
public class RunnableTest {

	public static void main(String[] args) {
		
		//创建Runnable实现类的对象
		MyThread2 myThread2 = new MyThread2();
		
		//创建Thread类的对象并将Runnable实现类的对象作为参数传入
		Thread thread = new Thread(myThread2);
		//通过Thread对象调用start方法
		thread.start();
		
		/*
		 * 如何开启多个线程？
		 * 创建Thread的对象并将Runnable接口的实现类的对象作为参数传入
		 * 通过Thread对象调用start方法
		 */
		Thread thread2 = new Thread(myThread2);
		thread2.start();
		

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "=============" + i);
		}
		
	}
}

/*
 * 步骤：
 * 1.创建一个自定义类并实现Runnable接口
 * 2.重写run方法
 * 3.创建Runnable实现类的对象
 * 4.创建Thread类的对象并将Runnable实现类的对象作为参数传入
 * 5.通过Thread对象调用start方法
 * 
 */

//创建一个自定义类并实现Runnable接口
class MyThread2 implements Runnable{

	//重写run方法
	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "=============" + i);
		}
	}
}
