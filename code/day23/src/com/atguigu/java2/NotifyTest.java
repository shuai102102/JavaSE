package com.atguigu.java2;

/*
 * 
 * 
 * [面试题]sleep和wait的区别？
 * 
 * 1.sleep睡着的时候会抱着锁，wait睡着的时候会释放锁
 * 
 * 
	wait()：令当前线程挂起并放弃CPU、同步资源，使别的线程可访问并修改共享资源，
			而当前线程排队等候再次对资源的访问
	notify()：唤醒正在排队等待同步资源的线程中优先级最高者结束等待
	notifyAll ()：唤醒正在排队等待资源的所有线程结束等待.

 * 
 */
public class NotifyTest {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		
		Thread t1 = new Thread(myThread);
		t1.start();
		Thread t2 = new Thread(myThread);
		t2.start();
		Thread t3 = new Thread(myThread);
		t3.start();
	}
}

class MyThread implements Runnable{
	int tick = 100;
	@Override
	public void run() {
		while(true){
			synchronized (this) {
//				try {
//					System.out.println(Thread.currentThread().getName());
//					Thread.currentThread().sleep(10000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
				try {
					System.out.println(Thread.currentThread().getName());
					wait(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(tick > 0){
					System.out.println(Thread.currentThread().getName() + "====" + tick);
					tick--;
				}
			}
		}
	}
}
