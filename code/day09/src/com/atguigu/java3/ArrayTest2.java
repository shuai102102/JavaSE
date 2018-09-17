package com.atguigu.java3;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		//6.一维数组在内存中的解析
		
		int[] scores = new int[3];
		scores[0] = 1;
		scores[2] = 5;
		//遍历scores
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		int[] scores2 = scores;
		scores2[0] = 10;
		//遍历scores2
		for (int i = 0; i < scores2.length; i++) {
			System.out.print(scores2[i] + " ");
		}
		
		System.out.println();
		//遍历scores
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		scores2 = new int[5];
		scores2[0] = 1000;
		System.out.println(scores2[0]); //1000
		System.out.println(scores[0]); //10
	}
}
