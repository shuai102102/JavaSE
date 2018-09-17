package com.atguigu.java;


/*
 * 
 * 可变形参 :
 * 
 * 格式 ：public void add（int ... numbers）{}
 * 
 * 说明：
 * 		1.同类型的可变形参和同类型的数组不够成重载（类型和个数一样）
 * 		2.可变形参在形参列表中只能放在最后一个
 *      3.一个方法中只能有一个可变形参
 *      4.可变形参的个数可以是0个1个或多个
 * 
 */
public class ArgsTest {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		int[] numbers = {1,2,3,4,5,6,7};
		//computer.add(numbers);
		
		computer.add2();
	}
}

class Computer{
	
	/*
	 * 需求：算两个数的和
	 */
	public void add(int a,int b){
		System.out.println(a + b);
	}
	
	public void add(int a,int b,int c){
		System.out.println(a + b + c);
	}
	
	public void add(int a,int b,int c,int d){
		System.out.println(a + b + c + d);
	}
	
	public void add(int[] numbers){
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("总和为" + sum);
	}
	
	public void add2(int ... numbers){
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("总和为" + sum);
	}
	/*
	 * 注意：可变形参只能放在形参列表的最后一个
	 */
	public void add3(String str,int ... numbers){
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("总和为" + sum);
	}
	
	public void add4(String atr, int...number){
		int sum = 0;
		for(int i = 0; i< number.length;i++){
			sum += number[i];
			}
	}

}
