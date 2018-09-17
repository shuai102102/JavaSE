package com.atguigu.java2;

public class ThreadTest {

	public static void main(String[] args) {
		
		myLine thread = new myLine("偶数");
		thread.start();
		
		
		myLine2 myLine2 = new myLine2("奇数");
		myLine2.start();
		
	
	
		for(int i = 1; i <= 100; i++){
			
				System.out.println(Thread.currentThread().getName()+"=="+i);
			}
		}
}

class myLine extends Thread{
	
	public myLine(String name){
		super(name);
	}
	
	@Override
	public void run(){
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0){
				System.out.println(Thread.currentThread().getName()+"=="+i);
			}
		}
	}
}

class myLine2 extends Thread{
	
	public myLine2(String name){
		super(name);
	}
	
	@Override
	public void run(){
		for(int i = 1; i <= 100; i++){
			if(i % 2 != 0){
				System.out.println(Thread.currentThread().getName()+"=="+i);
			}
		}
	}
}