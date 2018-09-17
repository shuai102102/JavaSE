package com.atguigu.java;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		
		int[] numbers = {12,38,1,2,3,4,5,6};
		int[] numbers2 = {12,38,1,2,3,4,5};
		//判断两个数组是否相等（元素的值和个数）
		boolean equals = Arrays.equals(numbers, numbers2);
		System.out.println(equals);
		
		//toString():将数组中的元素输出
		String str = Arrays.toString(numbers);
		System.out.println(str);
		
		//fill(int[] n,int val) : 将数组元素所有的值改成val
		Arrays.fill(numbers, 100);
		str = Arrays.toString(numbers);
		System.out.println(str);
		
		//sort(int[] numbers)
		Arrays.sort(numbers2);
		System.out.println(Arrays.toString(numbers2));
		
		//二分法查找：前提必须排序 .如果找不到返回-1
		int index = Arrays.binarySearch(numbers2, 1);
		System.out.println(index);
		
	}
}
