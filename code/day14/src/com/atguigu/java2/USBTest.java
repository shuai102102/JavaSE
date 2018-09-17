package com.atguigu.java2;

/*
 * 类和接口之间的多态性
 */
public class USBTest {

	public static void main(String[] args) {
		
		Computer c = new Computer();
		//创建一个对象的实例
		USB printer = new Printer();
		c.transferData(printer);
		
		
//		Mouse mouse = new Mouse();
		//匿名对象
		c.transferData(new Mouse());
		
		
		//匿名实现类
		USB usb = new USB() {
			
			@Override
			public void start() {
				System.out.println("摄像头开启了");
			}
			
			@Override
			public void close() {
				System.out.println("摄像头关闭了");
			}
		};
		c.transferData(usb);
		
		//创建了匿名实现类的匿名对象
		c.transferData(new USB(){
			@Override
			public void start() {
				
			}
			
			@Override
			public void close() {
				
			}
		});
		
		
		
	}
}


class Computer{
	
	public void transferData(USB usb){ //接口的类型
		usb.start();
		System.out.println("---------------工作中-----------------");
		usb.close();
	}
}

interface USB{
	void start();
	void close();
}



class Printer implements USB{

	@Override
	public void start() {
		System.out.println("打印机开始工作了");
	}

	@Override
	public void close() {
		System.out.println("打印机结束工作了");
	}
	
}


class Mouse implements USB{

	@Override
	public void start() {
		System.out.println("鼠标开始工作了");
	}

	@Override
	public void close() {
		System.out.println("鼠标结束工作了");
	}
	
}


