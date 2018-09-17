package com.atguigu.exer8;

public class USBTest {
	
	public static void main(String[] args) {
		Computer c = new Computer();
		c.run(new Mouse());
		
		c.run(new Printer());
		
		System.out.println("--------------------------------");
		
		c.run(new USB(){

			@Override
			public void start() {
				System.out.println("----------------start----------------------");
				
			}

			@Override
			public void end() {
				System.out.println("-------------------end--------------------");
				
			}});
		
		
			
		
	}
}

interface USB {
	void start();
	void end();
}

class Mouse implements USB{

	@Override
	public void start() {
		System.out.println("start");
		
	}

	@Override
	public void end() {
		System.out.println("end");
		
	}
	
	
}

class Printer implements USB{

	@Override
	public void start() {
		System.out.println("打印开始");
		
	}

	@Override
	public void end() {
		System.out.println("打印结束");
		
	}}


class Computer{
	public void run(USB usb){
		usb.start();
		System.out.println("--------------running--------------");
		usb.end();
	}
}