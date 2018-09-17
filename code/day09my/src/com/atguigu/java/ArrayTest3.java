package com.atguigu.java;

import java.util.Scanner;

/*从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
成绩>=最高分-10    等级为’A’   
成绩>=最高分-20    等级为’B’
成绩>=最高分-30    等级为’C’   
其余                            等级为’D’
*/
public class ArrayTest3 {
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
	
		//ArrayOperationDemo m = new ArrayOperationDemo();
		
		System.out.println("请输入学生个数=");
		int x = s.nextInt();
		int[] a = new int[x];
		
		System.out.println("请输入"+x+"学生的成绩：");
		for(int i = 0; i < x; i++){
			a[i]=  s.nextInt();
		}
		ArrayMax m = new ArrayMax();
		int c=m.GetMax(a);
		for(int i = 0; i < a.length; i++){
			if(a[i]>=(c-10)){
				
			}
		}
	}
}

class ArrayMax{
	int GetMax(int[] a){
		int max = a[0];
		for(int i = 0; i < a.length; i++){
			if(a[i]>max){
				max = a[i];
			}
		}
		return max;
	}
}
