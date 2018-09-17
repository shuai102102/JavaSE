package com.atguigu.java2;

/*
 * 
 * 构造器：
 * 		作用：1.创建对象  2.给对象的属性进行初始化
 * 		
 * 		格式：权限修饰符  类名（形参列表）{
 * 			
 * 			}
 * 
 * 说明：
 * 		1.如果类中没有显示的定义构造器，那么系统会默认为我们提供一个无参的构造器
 * 		2.如果类中已经显示的定义了构造器，那么系统将不再提供无参的构造器
 *      3.一个类中可以定义多个构造器，彼此之间构成重载
 * 
 * 总结：创建对象必调构造器。
 * 
 * 给属性赋值的方式：1.默认值  2.显示赋值   3.构造器赋值   4.对象.属性 、对象.方法
 * 		顺序：1 -> 2  -> 3 -> 4
 */
public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.show();
		person.say();
		//构造器赋值只能赋值一次
		Person person2 = new Person("小明同鞋",20,"山沟沟");
		person2.setAge(100);
		person2.show();
		
		//思考？构造器即可以初始化，为什么还要set/get方法
		
	}
}

class Person{
	
	private String name;
	private int age = 30;
	private String address;
	

	//构造器：类的成员之一
	public Person(){
		System.out.println("person()");
	}
	
	public Person(String n){
		name = n;
		System.out.println("person(n)");
	}
	
	public Person(String n,int a,String add){
		name = n;
		age = a;
		address = add;
	}
	
	
	public void show(){
		System.out.println(name + " " + age + " " + address);
	}
	
	public void show(int a){
		
	}
	
	public void say(){
		System.out.println("人说话了");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

}
