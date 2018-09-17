package com.atguigu.team.service;

import org.junit.Test;

public class Demo {

	@Test
	public void test(){
		
		int i = 0;
		for(;i < 5;i++){
			if(i == 4){
				break;
			}
		}
		System.out.println(i);
	}
}
