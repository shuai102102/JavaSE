package com.atguigu.exer;

public class Itemsecond{
	public static void main(String [] args){
		
		boolean loopFlag = true ;//循环输出标识符
		int totalMoney = 10000 ;
		String describe = "\t收支\t收支金额\t存款总额\t\t收支说明";
		
		do{
		System.out.println("----------------家庭收支记账软件-------------\n");
		System.out.println("\t\t1.收支明细");
		System.out.println("\t\t2.登记支出");
		System.out.println("\t\t3.登记收入");
		System.out.println("\t\t4.退出");
		System.out.println("\t请输入要查项目的代号：");
		
		char menu = Utility.readMenuSelection();//获取键盘输入项目代号
		
		switch(menu){
			
			case '1' ://收支明细
				System.out.println("-------收支明细如下-----------");
				System.out.println(describe);
				System.out.println("---------------------------");
				
				break;
				
			case '2' ://登记支出
				System.out.print("请输入支出金额（￥）：");
				int output = Utility.readNumber();
				totalMoney -= output;
				
				if (totalMoney <= 0){
					System.out.print("别瞎折腾了，老婆都快养不起了");
				}
				System.out.print("请输入支出说明：");
				String des_output = Utility.readString();
				describe += "\n\t支出\t"+output+"\t"+totalMoney+"\t\t"+des_output;
				break;
			
			case '3' ://登记收入
				System.out.print("请输入收入金额（￥）：");
				int income = Utility.readNumber();
				totalMoney += income;
				System.out.print("请输入收入说明：");
				String des_income = Utility.readString();
				describe += "\n\t收入\t"+income+"\t"+totalMoney+"\t\t"+des_income;
				break;
				
			case '4' ://退出
				System.out.print("请确认是否退出（Y/N）：");
				char abm = Utility.readConfirmSelection();
				if(abm == 'Y'){
					loopFlag = false ;
					System.out.println("退出成功");
				}
				
				break;
				
		}
		}while(loopFlag);
	}
	
	

}
