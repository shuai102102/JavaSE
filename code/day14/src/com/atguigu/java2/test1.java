package com.atguigu.java2;

public class test1 {
	
	public static void main(String[] args) {
		
		compu c = new OO();
		c.run();
	}

}


abstract class compu{
	
	public void run(){
		
		long start = System.currentTimeMillis();
		
		code();
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	public abstract void code();
}

class OO extends compu{

	@Override
	public void code() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("aaaaa");
		}
		
	}
	
	
}

