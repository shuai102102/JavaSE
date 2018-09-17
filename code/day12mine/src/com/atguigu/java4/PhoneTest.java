package com.atguigu.java4;

public class PhoneTest {
	
	public static void main(String[] args) {
		
		 PhoneTest phoneTest = new PhoneTest();
		 phoneTest.phoneFactory(new AndroidPhone());
		 phoneTest.phoneFactory(new Iphone());
	}
	
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
		System.out.println("手机可以发短信");
	}
}

class AndroidPhone extends Phone{
	
	@Override
	public void call() {
		System.out.println("android手机打电话");
	}
	
	@Override
	public void sendMessage() {
		System.out.println("android手机发短信");
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

