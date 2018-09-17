package com.atguigu.java2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
 * 
 * 第四种创建线程的方式
 * 
 */
public class ThreadTest3 {

	public static void main(String[] args) throws Exception {
		
		MyThread5 thread = new MyThread5();
		FutureTask<Integer> futureTask = new FutureTask<Integer>(thread);
		new Thread(futureTask).start();
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "  ===  " + i);
		}
		Integer integer = futureTask.get();
		/*
		 * 调用get方法后的代码--是在分线程执行完毕后再次调用 （主线程处于阻塞状态）
		 */
		System.out.println(integer);
		
	}
}

/*
 *步骤：
 *1.自定义类实现Callble接口
 *2.创建Callble实现类的对象
 *3.创建FutureTask的对象并将Callble实现类的对象传入构造器
 *4.创建Thread类的对象并将FutureTask对象传入构造器
 *5.调用FutureTask中的get方法（可省略）
 * 
 */
class MyThread5 implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "  ===  " + i);
		}
		return 100;
	}
}
