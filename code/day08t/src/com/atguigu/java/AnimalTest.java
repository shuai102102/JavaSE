package com.atguigu.java;

/*
 * 
 * 三大特性之一：封装与隐藏
 * 
 * 1.为什么要有封装性？
 * 		往往我们通过对象.属性进行赋值。只能对属性的类型和数值范围进行限制。但实际情况中
 * 		我们所需要的限制条件比较多，而在属性的位置上又不能加以限制。所以做如下操作：
 * 		①私有化属性 ：给属性加权限修饰符
 * 		②通过公共的方法给属性进行赋值 ：在方法中可以添加条件限制。
 * 
 * 2.封装性的体现（狭义上） : 私有化属性，设置公共的set/get方法
 * 
 * 3.封装性的体现（广义上）
 * 		1.四种权限修饰符：private 缺省的 protected public
 * 		2.类的成员：属性，方法，构造器，代码块，内部类。权限修饰符可以用来修饰属性，方法，构造器,内部类
 *      3.类只可以被public和缺省的所修饰
 * 			 
 * 		
 */
public class AnimalTest {

	public static void main(String[] args) {
		
		
		Animal animal = new Animal();
		animal.name = "旺财";
		//animal.legs = 5;
		animal.age = 2;
		animal.setLegs(10);
		
		System.out.println(animal.getLegs());
		
		animal.info();
		
	}
	
	protected class A{
		
	}
}
/*
 * 狗
 * 
 * 权限修饰符：private 缺省的  protected public
 */
class Animal{
	
	String name;
	private int legs; //属性私有化
	int age;
	
	
	/*
	 * 通过方法给属性赋值
	 */
	public void setLegs(int l){
		if(l == 4){
			legs = l;
		}else{
			legs = 4;
			System.out.println("你瞎呀");
		}
	}
	/*
	 * 通过方法获取属性的值
	 */
	public int getLegs(){
		return legs;
	}
	
	
	public void say(){
		System.out.println("单身汪");
	}
	
	public void run(){
		System.out.println("动物动起来了");
	}
	
	public void info(){
		System.out.println(name + " " + legs + " " + age);
	}
}
