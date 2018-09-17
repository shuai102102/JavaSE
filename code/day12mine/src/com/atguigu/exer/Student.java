package com.atguigu.exer;

public class Student extends Person {
	
	long number;
	int math;
	int english;
	int computer;
	
	public Student(){
		
	}
	
	public Student(long number,int math,int english,int computer){
		this.number = number;
		this.math = math;
		this.english = english;
		this.computer = computer;
	}
	
	public double aver(){
		return (math + english +computer) / 3.0;
	}
	
	public int max(){
		int maxNumber = (english > computer )? english : computer;
		return maxNumber =(maxNumber > math)?maxNumber : math;
		
	}
	
	public int min(){
		int minNumber = (english < computer )? english : computer;
		return minNumber =(minNumber < math)?minNumber : math;
		
	}
	
	public String toString(){
		return number + " " + math + " " + english + " " +computer;
	}
	
	
}
