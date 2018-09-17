package com.atguigu.exer;

/*
 * 
2.编写程序，定义三个重载方法并调用。方法名为mOL。
三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
在主类的main ()方法中分别用参数区别调用三个方法。

3.定义三个重载方法max()，第一个方法求两个int值中的最大值，
第二个方法求两个double值中的最大值，
第三个方法求三个double值中的最大值，并分别调用三个方法。

 */
public class ExerTest2 {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.mOL(10);
		computer.mOL(10, 10);
		computer.mOL("小龙哥很好很好");
		
		ExerTest2 et = new ExerTest2();
		et.max(12.3, 12.5);
		et.max(1, 5);
		et.max(1.5, 1.2,1.9);
	}
	
	public void max(int a,int b){
		int maxNumber = (a > b)? a : b;
		System.out.println(maxNumber);
	}
	
	public void max(double a,double b){
		double maxNumber = (a > b)? a : b;
		System.out.println(maxNumber);
	}
	
	public void max(double a,double b ,double c){
		double maxNumber = (a > b)?a : b;
		maxNumber = (maxNumber > c)?maxNumber : c;
		System.out.println(maxNumber);
	}
}

class Computer{
	
	public void mOL(int number){
		System.out.println(number * number);
	}
	
	public void mOL(int a,int b){
		System.out.println(a * b);
	}
	
	public void mOL(String str){
		System.out.println(str);
	}
}
