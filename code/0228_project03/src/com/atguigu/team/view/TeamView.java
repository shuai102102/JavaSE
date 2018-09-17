package com.atguigu.team.view;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import com.atguigu.team.service.TeamService;
import com.atguigu.team.util.TSUtility;

public class TeamView {

	private NameListService listService = new NameListService();
	private TeamService teamService = new TeamService();
	/*
	 * + enterMainMenu(): void - listAllEmployees(): void - addMember(): void -
	 * deleteMember(): void + main(args: String[]) : void
	 * 
	 */

	/*
	 * 进入主菜单
	 */
	public void enterMainMenu() {
	
		boolean isFlag = true;
		do {
			System.out.println("-------------------------------开发团队调度软件--------------------------------");
			System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
			// 获取所有的员工
			Employee[] allEmployee = listService.getAllEmployee();
			for (int i = 0; i < allEmployee.length; i++) {
				Employee employee = allEmployee[i];
				System.out.println(employee.toString());
			}
			System.out.println("---------------------------------------------------------------------------");
			System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
			// 读取菜单项
			char menuSelection = TSUtility.readMenuSelection();
			// 根据菜单项执行不同的操作
			switch (menuSelection) {
			case '1':
				listTeamAllEmployees();
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
				System.out.print("确认是否退出:(Y/N):");
				char confirmSelection = TSUtility.readConfirmSelection();
				if(confirmSelection == 'Y'){
					isFlag = false;
					System.out.println("亲！！！你好狠啊啊啊！！！");
				}
				break;
			}
		} while (isFlag);

	}

	/*
	 * 团队列表
	 */
	private void listTeamAllEmployees() {
		System.out.println("--------------------团队成员列表---------------------");
		System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
		//获取所有的团队成员
		Programmer[] team = teamService.getTeam();
		//团队中有成员
		if(team != null && team.length > 0){
			for (int i = 0; i < team.length; i++) {
				Programmer programmer = team[i];
				System.out.println(programmer.getMemberInfo());
			}
		}else{
			System.out.println("亲赶紧招人吧，硅谷的学生等不及了");
		}
		//按回车继续
		TSUtility.readReturn();
	}

	/*
	 * 添加团队成员
	 */
	private void addMember() {
		System.out.print("请输入要添加的员工ID：");
		//读取员工id
		int id = TSUtility.readInt();
		//判读该员工是否存在
		Employee employee = null;
		try {
			employee = listService.getEmployee(id);
			//注意：分开在两个try-catch中和在同一个不一样
			teamService.addMember(employee);
			System.out.println("填加成功");
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
		//按回车键继续
		TSUtility.readReturn();
		
	}

	/*
	 * 删除团队成员
	 */
	private void deleteMember() {
		/*
		 * 请输入要删除员工的TID：1
			确认是否删除(Y/N)：Y
			删除成功
			按回车键继续...
		 */
		System.out.print("请输入要删除员工的TID：");
		//要删除的员工的TID
		int tid = TSUtility.readInt();
		System.out.print("确认是否删除(Y/N)");
		char confirmSelection = TSUtility.readConfirmSelection();
		if(confirmSelection == 'Y'){
			//删除的用户是否存在团队中
			try {
				teamService.removeMember(tid);
				System.out.println("删除成功");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		//按回车继续
		TSUtility.readReturn();
		
	}

	public static void main(String[] args) {
		new TeamView().enterMainMenu();
	}
}
