package com.atguigu.java3;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadLock {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		
		Thread t1 = new Thread(myThread);
		Thread t2 = new Thread(myThread);
		Thread t3 = new Thread(myThread);
		
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}


class MyThread implements Runnable{

	private int tick = 100;
	ReentrantLock rl = new ReentrantLock();
	
	@Override
	public void run() {
		while(true){
			
			//synchronized (this) {
				rl.lock();
				try{
					if(tick > 0){
						System.out.println(Thread.currentThread().getName() + " === " + tick);
						tick--;
					}else
						break;
				}finally{
					rl.unlock();
				}
				
			//}
		}
	}
	
}
