package com.atguigu.java2;

/*
 * 自定义异常类
 * 1.自定义一个类继承RuntimeException/Exception
 * 2.声明两个构造器，一个空参的。一个参数的（String类型的）。并需要调用父类的一个参数的（String类型的）
 * 3.声明一个serialVersionUID  
 * 		private static final long serialVersionUID = 2256477558314496007L;
 * 
 */
public class MyException extends RuntimeException {

	/*
	 * 如果没有显示的声明 系统会默认帮我们加一个
	 */
	private static final long serialVersionUID = 22583144564656007L;
	
	public MyException(){
		
	}
	
	public MyException(String message){
		super(message);
	}
}
