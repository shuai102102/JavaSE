package com.atguigu.java4;

public class PhoneTest {

	public static void main(String[] args) {
		
		PhoneTest p = new PhoneTest();
		
		//AndroidPhone androidPhone = new AndroidPhone();
		//androidPhone.call();
		//androidPhone.sendMessage();
		
		//p.phoneFactory(new AndroidPhone());
		
//		Iphone iphone = new Iphone();
//		iphone.call();
//		iphone.sendMessage();
		
		
		p.phoneFactory(new AndroidPhone());
		p.phoneFactory(new Iphone());
		
		
	}
	
//	public void phoneFactory(AndroidPhone phone){
//		phone.call();
//		phone.sendMessage();
//	}
//	
//	public void phoneFactory(Iphone phone){
//		phone.call();
//		phone.sendMessage();
//	}
	
	public void phoneFactory(Phone phone){
		phone.call();
		phone.sendMessage();
		
		if(phone instanceof AndroidPhone){
			AndroidPhone p = (AndroidPhone)phone;
			p.show();
		}
	}
}


class Phone{
	
	public void call(){
		System.out.println("手机可以打电话");
	}
	
	public void sendMessage(){
		System.out.println("手机可以发送短信");
	}
}

class AndroidPhone extends Phone{
	
	@Override
	public void call() {
		System.out.println("android手机打电话了");
	}
	
	@Override
	public void sendMessage() {
		System.out.println("android手机发短信了");
	}
	
	public void show(){
		System.out.println("大哥我是android手机");
	}
}

class Iphone extends Phone{
	@Override
	public void call() {
		System.out.println("苹果手机打电话了");
	}
	
	@Override
	public void sendMessage() {
		System.out.println("苹果手机发短信了");
	}
}
