package com.atguigu.java.service;

import com.atguigu.java.domain.Programmer;

public class TeamService {
	
	//团队成员id
	private int counter = 1;
	//当前团队成员的最大数量
	private final int MAX_MEMBER = 5;
	//用来存放当前团队的成员
	private Programmer[] team = new Programmer[MAX_MEMBER];
	//统计当前团队人数
	private int total = 0;
	
	/*
	 * 获取团队中的所有成员
	 */
	public Programmer[] getTeam(){
		Programmer[] p = new Programmer[total];
		
		return p;
	}
	
	
}
