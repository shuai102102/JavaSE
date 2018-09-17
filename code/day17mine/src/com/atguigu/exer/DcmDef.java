package com.atguigu.exer;


	
/*
	 	编写应用程序EcmDef.java，接收命令行的两个参数，要求不能输入负数，计算两数相除。
		对数据类型不一致(NumberFormatException)、缺少命令行参数(ArrayIndexOutOfBoundsException、
	  	除0(ArithmeticException)及输入负数(EcDef 自定义的异常)进行异常处理。
	提示： 
		(1)在主类(EcmDef)中定义异常方法(ecm)完成两数相除功能。
		(2)在main()方法中使用异常处理语句进行异常处理。
		(3)在程序中，自定义对应输入负数的异常类(EcDef)。
		(4)运行时接受参数 java EcmDef 20 10   
			//args[0]=“20” args[1]=“10”
		(5)Interger类的static方法parseInt(String s)将s转换成对应的int值。如int a=Interger.parseInt(“314”);	//a=314;

 */
public class DcmDef {
	
	public static void main(String[] args) {
		
		try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[0]);
		if(a < 0 || b < 0){
			throw new EcDef("数据不能小于0");
		}
		int c = a / b;
		System.out.println(c);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("缺少命令行参数");
		}catch (NumberFormatException e) {
			System.out.println("数据类型不匹配");
		}catch (ArithmeticException e) {
			System.out.println("不能除0");
		}catch (EcDef e) {
			System.out.println(e.getMessage());
		}
	}

}