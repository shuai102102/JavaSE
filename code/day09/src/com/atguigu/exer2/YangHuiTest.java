package com.atguigu.exer2;

/*
 * 
 *  1
	1 1
	1 2 1
	1 3 3  1
	1 4 6  4  1
	1 5 10 10 5 1
	
	  
【提示】
 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 2. 每一行的第一个元素和最后一个元素都是 1
 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素. 
     yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];


 * 
 */
public class YangHuiTest {

	public static void main(String[] args) {
		
//		String[][] a ;
//		for(int i = 0; i<6;i++){
//		a = new String[i][];
//		a[i] = new String[i];
//		for(int j = 0;j < 6;j++){
//			a[i][j] = "*";
//		}
//		}
//		
//		int[][] c = new int[][]{{1,23,423},{32,534,654},{34,34}};
//		for(String[] b : a){
//		System.out.println(b);
//		}
		
		int[][] numbers = new int[10][];
		for (int i = 0; i < 10; i++) {
			//动态初始化二维数组
			numbers[i] = new int[i + 1];
			//给二维数组中元素的最后一个和第一个元素进行赋值
			numbers[i][0] = numbers[i][i] = 1;
			
			for(int j = 1; j < numbers[i].length - 1; j++){
				numbers[i][j] = numbers[i-1][j-1] + numbers[i-1][j];
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
}
