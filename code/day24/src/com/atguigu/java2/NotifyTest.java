package com.atguigu.java2;

public class NotifyTest {
	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();
		Thread t = new Thread(myThread2);
		t.start();
		Thread t2 = new Thread(myThread2);
		t2.start();
	}
}

class MyThread2 implements Runnable{
	int tick = 100;
	@Override
	public void run() {
		while(true){
			demo();
		}
	}
	
	public synchronized void demo(){
		this.notify();
		if(tick > 0){
			System.out.println(Thread.currentThread().getName()+ " " + tick);
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

class Mythread3 extends Thread{
	static int tick = 100;
	private static Object obj = new Object();
	
	public void run(){
		while(true){
			synchronized (obj) {
				obj.notify();
				if(tick > 0){
					System.out.println(Thread.currentThread().getName()+ " " + tick);
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