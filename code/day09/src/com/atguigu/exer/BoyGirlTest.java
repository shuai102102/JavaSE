package com.atguigu.exer;

public class BoyGirlTest {

	public static void main(String[] args) {
		
		Boy boy = new Boy("小龙哥",30);
		Girl girl = new Girl("志玲姐姐", 28);
		Girl girl2 = new Girl("高圆圆",18);
		
		girl.compare(girl2);
		
		//girl.marry(boy);
	}
}
