package com.atguigu.exer3;

public class ArrayTest {

	public static void main(String[] args) {
		
		//求数组元素的最大值、最小值、平均数、总和等
		
		int[] numbers = {1,2,3,4,5,6};
		
		//求最大值
//		int maxNumber = numbers[0];
//		for(int i = 1; i < numbers.length; i++){
//			if(maxNumber < numbers[i]){
//				maxNumber = numbers[i];
//			}
//		}
		
		Arrays arrays = new Arrays();
		System.out.println("数组中的最大值=" + arrays.getMaxNumber(numbers));
		
		
		//求最小值
		int minNumber = numbers[0];
		for(int i = 1; i < numbers.length; i++){
			if(minNumber > numbers[i]){
				minNumber = numbers[i];
			}
		}
		System.out.println(minNumber);
		
//		//平均数和总和
//		int sum = 0;
//		for(int i = 0; i < numbers.length; i++){
//			sum += numbers[i];
//		}
		System.out.println("总和为=" + arrays.getSum(numbers));
		System.out.println(arrays.getAvg(numbers));
	}
}
