package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.domain.Status;

public class TeamService {

	
	//团队成员id
	private int counter = 1;
	//当前团队成员的最大数量
	private final int MAX_MEMBER = 5;
	//用来存放当前团队的成员
	private Programmer[] team = new Programmer[MAX_MEMBER];
	private int total = 0; //统计当前团队的人数
	
	
	/*
	 * 获取团队中的所有成员
	 */
	public Programmer[] getTeam(){
		Programmer[] p = new Programmer[total];
		for (int i = 0; i < total; i++) {
			p[i] = team[i];
		}
		return p;
	}
	
	
	/*
	 * 添加团队成员
	 */
	public void addMember(Employee e) throws TeamException{
//		成员已满，无法添加
		if(total >= team.length){
			throw new TeamException("成员已满，无法添加");
		}
//		该成员不是开发人员，无法添加
		if(!(e instanceof Programmer)){
			throw new TeamException("该成员不是开发人员，无法添加");
		}
//		该员已是团队成员 
		for (int i = 0; i < total; i++) {
			if(team[i].getId() == e.getId()){
				throw new TeamException("该员已是团队成员 ");
			}
		}
//		该员正在休假，无法添加
		Programmer p = (Programmer) e;
		if(p.getStatus() == Status.VOCATION){
			throw new TeamException("该员正在休假，无法添加");
		}

		/*
		 * 第一步先统计
		 */
		int arcCount = 0; //架构师的数量
		int desCount = 0; //设计师的数量
		int proCount = 0; //程序员的数量
		for (int i = 0; i < total; i++) {
			Programmer programmer = team[i];
			if(programmer instanceof Architect){
				arcCount++;
			}else if(programmer instanceof Designer){
				desCount++;
			}else if(programmer instanceof Programmer){
				proCount++;
			}
		}
		/*
		 * 进行职位人数的判断
		 */
//		团队中只能有一名架构师
//		团队中只能有两名设计师
//		团队中只能有三名程序员
		if(p instanceof Architect){
			if(arcCount >= 1){
				throw  new TeamException("团队中只能有一名架构师");
			}
		}else if(p instanceof Designer){
			if(desCount >= 2){
				throw  new TeamException("团队中只能有两名设计师");
			}
		}else if(p instanceof Programmer){
			if(proCount >= 3){
				throw new TeamException("团队中只能有三名程序员");
			}
		}

		p.setStatus(Status.BUSY); //改变成员的状态
		team[total++] = p; //向团队中添加成员
		p.setMemberId(counter++); //设置团队成员id
		
	}
	
	/*
	 * 删除团队中的成员
	 */
	public void removeMember(int memberId) throws Exception{
		//查找memberId是否在该团队中
		int i = 0;
		for (; i < total; i++) {
			//该成员在团队中
			if(team[i].getMemberId() == memberId){
				//修改状态
				team[i].setStatus(Status.FREE);
				break;
			}
		}
		
		//不在团队中
		if(i == total){
			throw new TeamException("该成员不在该团队中");
		}
		
		for(int j = i; j < total - 1; j++){
			team[j] = team[j + 1];
		}
		
		team[total -1] = null;
		total--;
		
		//team[--total] = null;
		
	}
}
