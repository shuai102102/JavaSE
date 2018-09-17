package com.atguigu.test;

public class Test1 {

	public static void main(String[] args) {
		
		Thread1 th = new Thread1();
		Thread thread = new Thread(th);
		Thread thread2 = new Thread(th);
		
		thread.start();
		thread2.start();
		
		for (int i = 0; i <= 100; i++) {
			if(i % 2 == 0){
				System.out.println(Thread.currentThread().getName() + "=====" + i);
			}
		}
	}
}


class Thread1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "=====" + i);
		}
		
	}
}