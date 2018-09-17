package com.atguigu.java3;

public class MoreArrayTest2 {

	public static void main(String[] args) {
		
		//6.二维数组的内存解析
		
		int[][] numbers = new int[2][];
		numbers[0] = new int[2];
		numbers[1] = new int[2];
		
		numbers[0][0] = 1;
		numbers[0][1] = 2;
		
		
		numbers[1][0] = 4;
		numbers[1][1] = 5;
		
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]);
			}
			System.out.println();
		}
	}
}
