package com.atguigu.java2;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadTest3 {
	
	public static void main(String[] args) throws Exception{
		MyThread5 thread = new MyThread5();
		FutureTask<Integer> futureTask = new FutureTask<Integer>(thread);
		new Thread(futureTask).start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "  ===  " + i);
		}
		
		Integer integer = futureTask.get();
	}

}

class MyThread5 implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "===" + i);
			
		}
		return 100;
	}
	
}
