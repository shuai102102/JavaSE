package com.atguigu.exer;

/*
 * 2.请根据以下代码自行定义能满足需要的MyDate类,在MyDate类中覆盖equals方法，
 * 使其判断当两个MyDate类型对象的年月日都相同时，结果为true，否则为false。   
 *  public boolean equals(Object o)

 */
public class MyDate {

	int year;
	int month;
	int day;
	
	public MyDate(){
		
	}
	
	public MyDate(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj){
			return true;
		}
		
		if(obj instanceof MyDate){
			MyDate md = (MyDate)obj;
			return this.day == md.day && this.year == md.year && this.month == md.month;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return year + "年" + month + "月" + day + "号";
	}
	
}
