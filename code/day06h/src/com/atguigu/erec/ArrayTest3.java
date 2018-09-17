package com.atguigu.erec;

import java.util.Scanner;

public class ArrayTest3 {
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
		
		//ArrayOperationDemo m = new ArrayOperationDemo();
		
		NewClass m = new NewClass();
		System.out.println("请输入学生个数=");
		int x = s.nextInt();
		int[] a = new int[x];
		
		System.out.println("请输入"+x+"学生的成绩：");
		for(int i = 0; i < x; i++){
			a[i]=  s.nextInt();
		}
		
		s.close();
		
		int bestScore = m.getMax(a, x);
		System.out.println("最高成绩为：" + bestScore);
		
		for(int j = 0; j < x; j++){
			
			int g = j+1 ;
			
			switch(a[j]/10) {
			
			case 10 :
				System.out.println("第"+g+"个学生的成绩为："+a[j]+"\t等级为：S");
				break;
			case 9 :
				System.out.println("第"+g+"个学生的成绩为："+a[j]+"\t等级为：A");
				break;
			case 8 :
				System.out.println("第"+g+"个学生的成绩为："+a[j]+"\t等级为：B");
				break;
			case 7 :
				System.out.println("第"+g+"个学生的成绩为："+a[j]+"\t等级为：C");
				break;
			case 6 :
				System.out.println("第"+g+"个学生的成绩为："+a[j]+"\t等级为：D");
				break;
			case 5 :
			case 4 :
			case 3 :
			case 2 :
			case 1 :
			case 0 :
				System.out.println("第"+g+"个学生的成绩为："+a[j]+"\t等级为：你他妈真蠢");
				break;
				
			}
			
		}
	
	}
}

 abstract class ArrayOperationDemo{
	//获取最大元素
	int getMax(int[] m,int x){
		int max = m[0];
		for (int i = 0; i < x ;i++ ){
		if(max <= m [i]){
				max = m[i];
			}
		}
		return max;
	}
	
	abstract void doit();
}
 
 
class NewClass extends ArrayOperationDemo {

	@Override
	void doit() {
		// TODO Auto-generated method stub
		
	}
	
	///super.getMax();
	
	
	
}
