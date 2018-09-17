package com.atguigu.java2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.atguigu.utils.ThreadPoolUtils;

/*
 * 
 * 线程池：
 * 
 */
public class ThreadPoolTest {

	public static void main(String[] args) {
		
		/*
		 * 有四种线程池
		 */
		//创建线程池 -创建一个线程池，根据需要创建新的线程，但在可用时将重用先前构建的线程。
		ExecutorService pool = Executors.newCachedThreadPool();
		
		Executors.newFixedThreadPool(5);
		Executors.newScheduledThreadPool(10);
		Executors.newSingleThreadExecutor();
		
		//开启一个线程
//		pool.execute(new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i = 0; i < 100; i++) {
//					System.out.println(Thread.currentThread().getName() + "====" + i);
//				}
//			}
//		});
//		
//		//开启一个线程
//		pool.execute(new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i = 0; i < 100; i++) {
//					System.out.println(Thread.currentThread().getName() + "====" + i);
//				}
//			}
//		});
		
		
		ThreadPoolUtils.getInstance().run(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "====" + i);
				}
			}
		});
		
		ThreadPoolUtils.getInstance().run(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "====" + i);
				}
			}
		});
		
		
		ThreadPoolUtils.getInstance().run(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
