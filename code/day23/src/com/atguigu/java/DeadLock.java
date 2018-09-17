package com.atguigu.java;

public class DeadLock {
	public static void main(String[] args) {
		//创建了两把锁
		final StringBuffer s1 = new StringBuffer();
		final StringBuffer s2 = new StringBuffer();
		
		new Thread() {
			public void run() {
				synchronized (s1) {
					s2.append("A");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (s2) {
						s2.append("B");
						System.out.print(s1);
						System.out.print(s2);
					}
				}
			}
		}.start();

		new Thread() {
			public void run() {
				synchronized (s2) {
					s2.append("C");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (s1) {
						s1.append("D");
						System.out.print(s2);
						System.out.print(s1);
					}
				}
			}
		}.start();
		
	}
}
