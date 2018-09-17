package com.atguigu.java;

public class ThreadTest {

	public static void main(String[] args) {
		
		//匿名子类的匿名对象
		new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "=====" + i);
				}
			};
		}.start();
		
		new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "=====" + i);
				}
			};
		}.start();
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(i);
		}
	}
}
