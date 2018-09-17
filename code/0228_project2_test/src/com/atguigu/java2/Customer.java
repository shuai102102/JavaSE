package com.atguigu.java2;
/*
 *
 * JavaBean
 */

/*
String name ：客户姓名
char gender  ：性别
int age          ：年龄
String phone：电话号码
String email ：电子邮箱

*/
public class Customer {
	
	private String name;
	private char gender;
	private int age;
	private String phone;
	private String email;
	
	public Customer(){
		
	}
	
	public Customer(String name,char gender,int age,String phone,String email){
			
		this.name = name;
		this.gender =gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setGender(char gender){
		this.gender = gender;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public void setEmai(String email){
		this.email = email;
	}
	
	public String getName(){
		return name;
	}
	
	public char getGender(){
		return gender;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public String getEmail(){
		return email;
	}
}
