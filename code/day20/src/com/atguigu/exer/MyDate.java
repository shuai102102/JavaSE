package com.atguigu.exer;

/*
 * MyDate类包含:
private成员变量month,day,year；并为每一个属性定义 getter, setter 方法；
 */
/*public class MyDate implements Comparable{

	private int month;
	private int day;
	private int year;
	
	public MyDate(){
		
	}
	
	public MyDate(int month,int day,int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	

	@Override
	public String toString() {
		return year + "-" + month + "-" + day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof MyDate){
			MyDate m = (MyDate) o;
			
			int year = this.year - m.getYear();
			if(year == 0){
				int month = this.month - m.getMonth();
				if(month == 0){
					return this.day - m.getDay();
				}
				return month;
			}
			
			return year;
		}
		return 0;
	}
	
	
}
*/

/*
public class MyDate implements Comparable{

	private int month;
	private int day;
	private int year;
	
	public MyDate(){
		
	}
	
	public MyDate(int month,int day,int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	

	@Override
	public String toString() {
		return year + "-" + month + "-" + day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof MyDate){
			MyDate m = (MyDate) o;
			
			int year = this.year - m.getYear();
			if(year == 0){
				int month = this.month - m.getMonth();
				if(month == 0){
					return this.day - m.getDay();
				}
				return month;
			}
			
			return year;
		}
		return 0;
	}

}
*/


public class MyDate implements Comparable{

	private int month;
	private int day;
	private int year;
	
	public MyDate(){
		
	}
	
	public MyDate(int month,int day,int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	

	@Override
	public String toString() {
		return year + "-" + month + "-" + day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof MyDate){
			MyDate m = (MyDate) o;
			
			int year = this.year - m.getYear();
			if(year == 0){
				int month = this.month - m.getMonth();
				if(month == 0){
					return this.day - m.getDay();
				}
				return month;
			}
			
			return year;
		}
		return 0;
	}
	
	
}

