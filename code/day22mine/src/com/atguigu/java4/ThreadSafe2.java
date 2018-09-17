package com.atguigu.java4;

import java.io.Serializable;

public class ThreadSafe2 {
	
	public static void main(String[] args) {
		ttt t1 = new ttt();
		ttt t2 = new ttt();
		ttt t3 = new ttt();
		
		t1.setName("t1窗口");
		t2.setName("t2窗口");
		t3.setName("t3窗口");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
/*
class ttt extends Thread{
	
	private static int ticket = 100;
	private final static  Object obj = new Object() ; 
	@Override
	public void run() {
		while(true){
			synchronized (obj) {
				if(ticket > 0){
					System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + ticket);
					ticket--;
				}
			}
				
			
		}
	}
}
*/
class ttt extends Thread{
	private static int tick = 100;
	private final static Object obj = new Object();

	@Override
	public void run() {
		while(true){
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
