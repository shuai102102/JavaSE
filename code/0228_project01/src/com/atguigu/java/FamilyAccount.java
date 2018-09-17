package com.atguigu.java;

import java.util.Scanner;

public class FamilyAccount {

	//alt + / 提示
	public static void main(String[] args) {
		
		/*
		 * 
		 * -----------------家庭收支记账软件-----------------

                   1 收支明细
                   2 登记收入
                   3 登记支出
                   4 退    出

                                              请选择(1-4)：4
		 */
		//shift + 回车
		boolean isFlag = true; //用来控制是否退出当前循环
		do{
			System.out.println("-----------------家庭收支记账软件-----------------"); //sysout alt + /
			System.out.println("                 1 收支明细");
			System.out.println("                 2 登记收入");
			System.out.println("                 3 登记支出");
			System.out.println("                 4 退出");
			System.out.print("               请选择(1-4)：");
			
			//类名.静态方法（）;
			char menu = Utility.readMenuSelection();
			//判断选的是哪个菜单项
			switch(menu){
			case '1':
				System.out.println("收支明细");
				break;
			case '2':
				System.out.println("登记收入");
				break;
			case '3':
				System.out.println("登记支出");
				break;
			case '4':
				System.out.println("退出");
				break;
			}
		
		
		}while(true);
	}
}
