package com.atguigu.exer3;

public class Arrays {

	/*
	 * 获取数组元素中的最大值
	 */
	public static int getMaxNumber(int[] numbers) {
		int maxNumbers = numbers[0];
		for (int i = 0; i < numbers.length; i++) {

			if (maxNumbers < numbers[i]) {
				maxNumbers = numbers[i];
			}
		}

		return maxNumbers;
	}

	/*
	 * 求数组元素的总和
	 */
	public static int getSum(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	/*
	 * 求数组元素的平均数
	 */
	public int getAvg(int[] numbers) {
		int sum = getSum(numbers);
		return sum / numbers.length;
	}

	/*
	 * 数组的遍历
	 */
	public static void showArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}

	/*
	 * 数组的翻转
	 */
	public static void reverse(int[] numbers) {
		for (int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++, j--) {
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
		
	/*	int[] a = new int[10];
		for(int i = 0, j = a.length - 1;i < a.length ; i++,j--){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}*/
	}
	
	
	/*
	 * 数组的复制
	 */
	public static int[] copy(int[] numbers){
		return null;
	}
	
	/*
	 * 数组的最小值
	 */
	public static int getMinNumber(int[] numbers){
		return 0;
	}
}
