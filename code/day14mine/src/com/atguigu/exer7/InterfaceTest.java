package com.atguigu.exer7;

public class InterfaceTest {
	public static void main(String[] args) {
		
	}

}

interface A{
	public static final String name = "xiao";
	String name2 = "小泽泽";
	
	public abstract void run();
	void insad();
}

interface B{
	void say();
}

interface C extends B{
	void out();
}

class F implements C,A{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void out() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insad() {
		// TODO Auto-generated method stub
		
	}
	
}