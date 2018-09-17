package com.atguigu.java4;

public class ThreadSafe {
	
	public static void main(String[] args) {
		
		rrr r = new rrr();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.setName("t1窗口");
		t2.setName("t1窗口");
		t3.setName("t1窗口");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}

/*
class rrr implements Runnable{
	
	private int tick = 100;
	
	@Override
	public void run() {
		while(true){
		synchronized (this) {
			if (tick > 0) {
				System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick);
				tick--;
				}else
					break;
			}
		}
		
	}
	
}*/

class rrr implements Runnable{

	private int tick = 100;
	@Override
	public void run() {
		while(true){
			show();
		}
		
	}
	private synchronized void show() {
		if(tick > 0){
			System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick);
			tick--;
		}else
			return;
		
	}
	
}
