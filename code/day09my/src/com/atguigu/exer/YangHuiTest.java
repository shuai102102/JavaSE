
package com.atguigu.exer;

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
	public static void main(String[] args){
		
		int[][] yanghui = new int[10][];
		for(int i = 0;i < 10;i++){
			 yanghui[i] = new int[i + 1];
			yanghui[i][0] = yanghui[i][i] = 1;
			
			for(int j=1;j<i;j++){
				yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
				}
		}
		
		for(int i = 0;i < 10;i++){
			for(int j=0;j <= i;j++){
				System.out.print(yanghui[i][j]+" ");
			}
			System.out.println();
		}
	}
}
