package com.atguigu.java4;

import org.junit.Test;

public class Testeee2 {

	@Test
	public void oo(){
		person p = new person(); 
		p.say(5);
	}
}

class person{
	int x = 12;
	public void say(int x ){
		x += x;
		System.out.println(x);
	}
}