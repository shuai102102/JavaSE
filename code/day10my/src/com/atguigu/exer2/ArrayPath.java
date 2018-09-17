package com.atguigu.exer2;

import java.util.Arrays;

public class ArrayPath {
	
	public static void main(String[] args) {
		int[] a = {1,2,67,23,45};
		int[] b = {1,3,67,23,45};
		
		//比较两个数组是否一样
		boolean s = Arrays.equals(a, b);
		System.out.println(s);
		
		//打印数组
		String str = Arrays.toString(a);
		System.out.println(str);
		
		/*//将所有数组元素改成一个值
		Arrays.fill(a, 55);
		String st = Arrays.toString(a);
		System.out.println(st);
		*/
		
		//数组排序
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		//二分法查找：前提必须排序 .如果找不到返回-1
		int index = Arrays.binarySearch(a, 2);
		System.out.println(index);
	}
}
