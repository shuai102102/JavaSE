package com.atguigu.java5;

/*
 * 

 * 
 */
public class ThreadSafe {

	public static void main(String[] args) {

		Ticket t = new Ticket();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);

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

//		while (true) {
//			// 同步代码块
//			synchronized (this) {
//				if (tick > 0) {
//					System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick);
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					tick--;
//				} else
//					break;
//			}
//		}
		
		while(true){
			//同步方法
			show();
		}
	}
	
	/*
	 * 同步方法
	 */
	public synchronized void show(){
		if (tick > 0) {
			System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick);
			tick--;
		}else
			return;
	}
}
