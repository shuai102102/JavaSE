package com.atguigu.exer2;

import java.util.Scanner;

public class ScoresTest {

	/*
	 * 
	 *  从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
		成绩>=最高分-10    等级为’A’   
		成绩>=最高分-20    等级为’B’
		成绩>=最高分-30    等级为’C’   
		其余                            等级为’D’

	 */
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("请输入学生的人数");
		int number = s.nextInt(); //学生的人数
		//根据学生的人数创建相应长度的数组
		int[] scores = new int[number];
		
		for(int i = 0; i < scores.length; i++){
			System.out.println("请输入第" + (i + 1) + "学生的成绩");
			int score = s.nextInt();
			//将学生的成绩装入数组
			scores[i] = score;
		}
		
		/*
		 * 找出最高成绩
		 */
		int maxScore = 0;
		for (int i = 0; i < scores.length; i++) {
			int score = scores[i];
			if(maxScore < score){
				maxScore = score;
			}
		}
		
		/*
		 * 分学生的等级
		 * 
		 *  成绩>=最高分-10    等级为’A’   
			成绩>=最高分-20    等级为’B’
			成绩>=最高分-30    等级为’C’   
			其余                            等级为’D’
		 */
		for (int i = 0; i < scores.length; i++) {
			int score = scores[i];
			char c = 'A';
			if(score >= maxScore - 10){
				//System.out.println('A');
				c = 'A';
			}else if(score >= maxScore - 20){
				//System.out.println('B');
				c = 'B';
			}else if(score >= maxScore - 30){
//				System.out.println('C');
				c = 'C';
			}else{
//				System.out.println('D');
				c = 'D';
			}
			
			System.out.println(c);
		}
		
		
		
	}
}
