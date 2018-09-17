package com.atguigu.exer2;

public class ArrayOperation {
	
	/*
	 * 获取数组元素中的最大值
	 */
	public int getMax(int[] a){
		int maxNumber = a[0];
		for (int i = 1; i < a.length; i++) {
			if (maxNumber < a[i]) {
				 maxNumber = a[i];
			}
		}
		return maxNumber;
	}
	/*
	 * 获取数组元素中的最小值
	 */
	public int getMin(int[] a){
		int minNumber = a[0];
		for (int i = 1; i < a.length; i++) {
			if (minNumber > a[i]) {
				 minNumber = a[i];
			}
		}
		return minNumber;
	}
	
	/*
	 * 求数组元素的总和
	 */
	public int getSum(int[] a){
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
		 sum += a[i];	
		}
		return sum;
	}
	
	/*
	 * 求数组元素的平均数
	 */
	public int getAvg(int[] a){
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
		 sum += a[i];	
		}
		return sum/a.length;
	}
	/*
	 * 数组的遍历
	 */
	public void showArray(int[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" "); 	
			}
	}
	
	/*
	 * 数组的翻转
	 */
	public void reverse(int[] a) {
		for (int i = 0,j=a.length-1; i <a .length/2; i++,j--) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
}


