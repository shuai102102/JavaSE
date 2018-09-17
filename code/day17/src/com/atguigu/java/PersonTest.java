package com.atguigu.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PersonTest {

}


class Person{
	
	public void say() throws Exception{
		
	}
}


/*
 * 
 */
class Student extends Person{
	
	@Override
	public void say() throws ParseException  {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.parse("aaa");
	}
}
