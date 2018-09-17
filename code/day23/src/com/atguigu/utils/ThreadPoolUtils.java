package com.atguigu.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUtils {

	private ThreadPoolUtils(){}
	
	private static ThreadPoolUtils tpu = new ThreadPoolUtils();
	
	private static ExecutorService pool = Executors.newCachedThreadPool();
	
	
//	public static ExecutorService getInstance(){
//		return pool;
//	}
	
	public static ThreadPoolUtils getInstance(){
		return tpu;
	}
	
	
	public void run(Runnable command){
		pool.execute(command);
//		pool.show(command);
	}
}
