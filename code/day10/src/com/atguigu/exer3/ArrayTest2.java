package com.atguigu.exer3;

public class ArrayTest2 {

	public static void main(String[] args) {

		// 数组的复制、反转、查找

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };

		Arrays arrays = new Arrays();

		// 数组的复制
		int[] copy = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			copy[i] = numbers[i];
		}
		// for (int i = 0; i < copy.length; i++) {
		// System.out.print(copy[i] + " ");
		// }
		arrays.showArray(copy);
		System.out.println();

		// 数组的反转
		// for(int i = 0,j = numbers.length - 1; i < numbers.length / 2;
		// i++,j--){
		//
		// int temp = numbers[i];
		// numbers[i] = numbers[j];
		// numbers[j] = temp;
		// }
		// for (int i = 0; i < numbers.length; i++) {
		// System.out.print(numbers[i] + " ");
		// }
//		arrays.reverse(numbers);
//		arrays.showArray(numbers);

		/*
		 * 数组的查找 ： 线性查找
		 */
		int findNumber = -3;
		int index = -1; // 查找到数值的索引值
		for (int i = 0; i < numbers.length; i++) {
			if(findNumber == numbers[i]){
				index = i;
				break;
			}
		}
		
		if(index == -1){
			System.out.println("亲没有您找的商品哦！！！");
		}else{
			System.out.println("index=" + index);
		}

	}
}
