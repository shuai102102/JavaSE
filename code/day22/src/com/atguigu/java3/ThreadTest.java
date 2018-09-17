package com.atguigu.java3;

/*
 * 
		void start():  启动线程，并执行对象的run()方法
		run():  线程在被调度时执行的操作
		String getName():  返回线程的名称
		//通过Thread的构造器也可以调置名字
		void setName(String name):设置该线程名称
		static currentThread(): 返回当前线程
		
		
		getPriority() ：返回线程优先值 
		setPriority(int newPriority) ：改变线程的优先级
			MAX_PRIORITY（10）;    
			MIN _PRIORITY （1）;  
			NORM_PRIORITY （5）;


		static  void  yield()：线程让步
				暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程
				若队列中没有同优先级的线程，忽略此方法
		join() ：线程1中调用线程2的join方法。线程1就会处于阻塞状态。等待线程2执行完毕再继续执行。
		static  void  sleep(long millis)：(指定时间:毫秒)
				令当前活动线程在指定时间段内放弃对CPU控制,使其他线程有机会被执行,时间到后重排队。
				抛出InterruptedException异常
		stop(): 强制线程生命期结束
		boolean isAlive()：返回boolean，判断线程是否还活着

 */
public class ThreadTest {

	public static void main(String[] args) {
		
		//开启分线程
		MyThread mt = new MyThread();
		mt.start();
		mt.setName("嘿嘿嘿嘿嘿");
		System.out.println("嘿嘿嘿我的名字叫=====" + mt.getName());
//		System.out.println(mt.getPriority()); //默认的优先级是5
//		mt.setPriority(Thread.MAX_PRIORITY);
		
		for (int i = 0; i < 100; i++) {
			if(i == 1){
//				try {
//					mt.join();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
//				try {
//					Thread.sleep(10000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
			}
			System.out.println(mt.isAlive());
			System.out.println(Thread.currentThread().getName() + "=======" + i);
		}
	}
}


class MyThread extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
//			if(i % 10 == 0){
//				yield();
//			}
			
			System.out.println(Thread.currentThread().getName() + "=======" + i);
			if(i == 10){
				Thread.currentThread().stop();
			}
			
		}
		
		
	}
}
