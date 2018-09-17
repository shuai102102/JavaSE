package com.atguigu.exer;

import java.util.Scanner;
import java.util.Vector;

public class ExerTest2 {

	/*
	 *      利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
			提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。
			而向量类java.util.Vector可以根据需要动态伸缩。
			创建Vector对象：Vector v=new Vector();
			给向量添加元素：v.addElement(Object obj);   //obj必须是对象
			取出向量中的元素：Object  obj=v.elementAt(0);
			注意第一个元素的下标是0，返回值是Object类型的。
			计算向量的长度：v.size();
			若与最高分相差10分内：A等；20分内：B等；
			      30分内：C等；其它：D等

	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//创建Vector对象
		Vector v = new Vector(); //导包 ：ctrl + shift + o
		
		int maxScore = 0;
		while(true){ 
			System.out.println("请输入学生成绩（负数结束）");
			int score = s.nextInt();
			if(score < 0){
				break;
			}
			//将成绩添加到集合中
			v.addElement(score);
			
			if(maxScore < score){
				maxScore = score;
			}
		}
		
		//成绩的判断
		for(int i = 0; i < v.size(); i++){
//			Object elementAt = v.elementAt(i);
//			Integer integer = (Integer)elementAt;
//			int score  = integer;
			
			int score = (int) v.elementAt(i);
			/*
			 * 若与最高分相差10分内：A等；20分内：B等；
			      30分内：C等；其它：D等
			 */
			if(maxScore - score <= 10){
				System.out.println("A");
			}else if(maxScore - score <= 20){
				System.out.println("B");
			}else if(maxScore - score <= 30){
				System.out.println("c");
			}else{
				System.out.println("D");
			}
		}
		
		
	}
}
