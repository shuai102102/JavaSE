package com.atguigu.exer;

/*
 * 
3.1 编写程序，声明一个method方法，在方法中打印一个10*8 的矩形，在main方法中调用该方法。

3.2 修改上一个程序，在method方法中，除打印一个10*8的矩形外，再计算该矩形的面积，
并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。

3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个m*n的矩形，并计算该矩形的面积，
 将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。

 */
public class ExerTest {

	public static void main(String[] args) {

		ExerTest et = new ExerTest();
		int area = et.method(20,10);
		System.out.println(area);
		
	}

	/*
	 * public void method(){
	 * 
		 * for (int i = 1; i <= 10; i++) { 
		 * 		for(int j = 1; j <= 8; j++){
		 * 			System.out.print("*"); 
		 * 		} 	
		 * 		System.out.println(); 
		 * } 
	 * 
	 * }
	 */
	
	/*
	public int method() {

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 8; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		return 10 * 8;
	}
	*/
	
	public int method(int m,int n) {

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		return m * n;
	}
}
