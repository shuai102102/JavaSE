package com.atguigu.java2;

public class NotifyTest2 {

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
		
	}
}

class MyThread2 implements Runnable{
	int tick = 100;
			
	@Override
	public void run() {
		
		while(true){
			synchronized (this) {
				this.notify();
				if(tick > 0){
					System.out.println(Thread.currentThread().getName() + " ==== " + tick);
					
					tick--;
				}
				
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
