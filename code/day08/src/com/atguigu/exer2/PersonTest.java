package com.atguigu.exer2;

/*
 * 
 * 1.创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
    用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
    在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。
    
    
   2  在前面定义的Person类中添加构造器，利用构造器设置所有人的age属性初始值都为18。

   3 修改上题中类和构造器，增加name属性,使得每次创建Person对象的同时初始化对象的age属性值和name属性值

 */
public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person(18,"小龙哥");
		//person.setAge(150);
		System.out.println(person.getAge());
		System.out.println(person.getName());
	}
}

class Person{
	
	private int age;
	private String name;
	
	//利用构造器进行赋值
	public Person(int a,String n){
		age = a;
		name = n;
	}
	
	
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	
	public void setAge(int i){
		if(i > 0 && i < 130){
			age = i;
		}else{
			System.out.println("年纪不合法");
		}
	}
	
	public int getAge(){
		return age;
	}
}
