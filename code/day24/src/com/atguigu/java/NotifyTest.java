package com.atguigu.java;

/*
 * 
 * 实现Runnable接口：
 * 		1.同步方法和同步锁中都可以使用线程通信的三个方法（wait() notify() notifyAll()）
 * 
 * 继承Thread
 * 		1.只能在同步代码块中使用线程通信的三个方法（wait() notify() notifyAll()）
 * 				注意：锁只能是对象。
 */
public class NotifyTest {

	public static void main(String[] args) {
		
//		MyThread2 myThread2 = new MyThread2();
//		
//		Thread t = new Thread(myThread2);
//		t.start();
//		
//		Thread t2 = new Thread(myThread2);
//		t2.start();
		
		
		MyThread3 t = new MyThread3();
		t.start();
		
		MyThread3 t2 = new MyThread3();
		t2.start();
//		
	}
}

class MyThread2 implements Runnable{
	int tick = 100;
			
	@Override
	public void run() {
		
		while(true){
			demo();
//			synchronized (this) {
//				
//			}
		}
	}
	
	/*
	 * 同步方法本身默认的锁就是this
	 */
	public synchronized void demo(){
		this.notify();
		if(tick > 0){
			System.out.println(Thread.currentThread().getName() + " ==== " + tick);
			
			tick--;
		}
		
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

/*
 * 
 * 注意：调用的notify wait方法都是监视器对象中的方法
 */
class MyThread3 extends Thread{
	static int  tick = 100;
	private static Object obj = new Object();
			
	@Override
	public void run() {
		
		while(true){
			
			synchronized (obj) {
				obj.notify();
				if(tick > 0){
					System.out.println(Thread.currentThread().getName() + " ==== " + tick);
					
					tick--;
				}
				
				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
//	public static synchronized void demo(){
//		this.notify();
//		if(tick > 0){
//			System.out.println(Thread.currentThread().getName() + " ==== " + tick);
//			
//			tick--;
//		}
//		
//		try {
//			this.wait();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
}
