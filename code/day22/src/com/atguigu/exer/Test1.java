	package com.atguigu.exer;

import org.junit.Test;

public class Test1 {
	/*1.写一个接口USB 包括两个方法  void start()  void close()
	2.写两个USB的实现类 要求两个类中都有自己独有的方法
	3.写一个Computer类  方法有void runUSB(USB usb) - 要求调用usb的start和close方法同时调用实现类中独有的方法
	 */
	
	@Test
	public void test(){
		
		USB usb = new USB(){

			@Override
			public void start() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		Computer c = new Computer();
		c.runUSB(usb);
	}

	
	
}


interface USB{
	void start();
	void close();
}

class Computer{
	public void runUSB(USB usb){
		
	}
}