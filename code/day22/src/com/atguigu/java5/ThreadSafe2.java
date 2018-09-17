package com.atguigu.java5;

/*
 * 
 * 线程安全问题：使用同步代码块，同步方法来解决
 * 
 * 线程安全问题：卖票的问题 - 重票 ，0票，负票
 * 原因：在一个线程操作共享数据的时候，还没有操作完成其它线程就参与进来也去操作共享数据。
 * 解决方案：在一个线程操作共享数据的时候，不让其它线程进入去操作共享数据。当线程处理完成以后。其它线程才能进入。
 * 
 * 解决方案一 ： 同步代码块
 * 			Synchronized（对象/同步锁/监视器）{
 * 				操作共享数据的代码;
 * 			}
 * 			1.监视器-可以是任何对象(多个线程必须是同一把锁)
 * 			2.继承Thread : 不可以使用this.共享数据应该使用static进行修饰
 * 			     实现Runnable接口 ：同步锁可以使用this
 * 
 * 解决方案二 ：  同步方法
 * 
 * 		格式：public synchronized  void show(){
 * 			}
 * 
 * 		说明：继承Thread ：使用的同步方法必须使用static进行修饰
 * 			 实现Runnable ：可以直接使用同步方法
 * 		
 */
public class ThreadSafe2 {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.setName("t1窗口");
		t2.setName("t2窗口");
		t3.setName("t3窗口");

		t1.start();
		t2.start();
		t3.start();
	}
}

/*
 * 在继承Thread中要注意的问题 1.共享数据 （应该使用static修饰） 2.同步锁 （所有的线程必须是同一把锁）
 * 
 */
class MyThread extends Thread {
	// 继承Thread实现的多线程，操作的共享数据应该设置成static
	private static int tick = 100;
	private final static Object obj = new Object();

	public void run() {

//		while (true) {
//			// 同步代码块
//			synchronized (obj) {
//				if (tick > 0) {
//					System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick);
//					tick--;
//				} else
//					break;
//			}
//	}

			while (true) {
				// 同步方法
				show();
			}
		
	}
	
	public static synchronized void show(){
		if (tick > 0) {
			System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick);
			tick--;
		}else
			return;
	}
}
