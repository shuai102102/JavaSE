package com.atguigu.java4;


/*
 * 
 * 线程安全问题：指的是操作共享数据
 * 
 * 问题：重票，0票 ，负票
 */
public class TicketDemo {
	public static void main(String[] args) {

//		Ticket t = new Ticket();
//
//		Thread t1 = new Thread(t);
//		Thread t2 = new Thread(t);
//		Thread t3 = new Thread(t);
		
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

class Ticket implements Runnable {
	private int tick = 100;

	public void run() {
		while (true) {
			if (tick > 0) {
				System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick);
				tick--;
			} else
				break;
		}
	}
}

class MyThread extends Thread{
	private static int tick = 100;

	public void run() {
		while (true) {
			if (tick > 0) {
				System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick);
				tick--;
			} else
				break;
		}
	}
}
