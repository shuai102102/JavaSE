package com.atguigu.exer;

public class Item1 {
	public static void main (String[] args){
		
		int balance=10000;
		boolean isFlag=true;
		String details="收支\t账户金额\t收支金额\t\t说    明";
		do	{
			System.out.println("------------家庭收支软件记账---------------\n");
			System.out.println("                1 收支明细");
			System.out.println("                2 登记收入");
			System.out.println("                3 登记支出");
			System.out.println("                4 退出");
			System.out.print("               请选择(1-4)：");
			
			char menu = Utility.readMenuSelection();
			switch(menu){
			
				case '1' ://收支明细
					System.out.println("--------------当前收支明细记录--------------");
					System.out.println(details);
					System.out.println("----------------------------------------");
					break;
				case '2' ://登记收入
					System.out.print("请输入收入金额（单位：￥）：\n");
					int income = Utility.readNumber();
					balance += income;
					System.out.print("请输入收入说明：\n");
					String descome = Utility.readString();
					details += "\n收入\t"+balance+"\t"+income+"\t\t"+descome;
					break;
				case '3' ://登记支出
					System.out.print("请输入支出金额（单位：￥）：\n");
					int output = Utility.readNumber();
					balance += output;
					System.out.print("请输入支出说明：\n");
					String desput= Utility.readString();
					details += "\n支出\t"+balance+"\t"+output+"\t\t"+desput;
					break;
				case '4' ://退出
					System.out.print("请确认是否退出？(Y/N):");
					char yn = Utility.readConfirmSelection();
					if(yn=='Y'){
						isFlag = false;
						System.out.print("退出成功");
					}
					break;
			}
		}while (isFlag);
	}

}
