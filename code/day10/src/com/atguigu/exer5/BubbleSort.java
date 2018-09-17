package com.atguigu.exer5;


/*
 * 
 * 冒泡排序 （要求必须会手写）
 */
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] numbers = {120,35,18,90,1,1000,98,12};
		
		for(int i = 0 ; i < numbers.length - 1; i++){
			
			for(int j = 0; j < numbers.length - i - 1; j++){
				if(numbers[j] > numbers[j + 1]){
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
