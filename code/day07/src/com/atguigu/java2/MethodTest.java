package com.atguigu.java2;

/*
 * 
 * 
 * 方法 = method = 函数 = 成员方法
 * 
 * 方法的格式：
 * 	
 * 		权限修饰符  返回值类型  方法名（形参列表）{
 * 				执行语句;
 * 		}
 * 
 * 		1.权限修饰符：public private 缺省的  protected (建议暂时都用public)
 *      2.返回值类型：
 *      	 两种类型：
 *      		①void 没有返回值
 *      		②有具体的返回值类型 ：基本数据类型和引用数据类型
 *      	注意：
 *      		如果方法有具体的返回值类型，那么在方法中应使用return关键字将具体的值返回
 *      		①没有返回值的方法  : return 代表结束当前的方法
 *      		②有返回的方法: return 10; 结束当前方法并返回一个具体的数值
 *      3.方法名:遵守标识符的命名规范即可，最好做到见名知义
 *      4.形参列表：可以是0个1个或多个,如果是多个形参中间用","号隔开。
 *      		注意：实参和形参的类形，个数和顺序都必须保持一致
 *      5.执行语句：方法的具体实现。（方法只有在被调用的时候，执行语句才会被执行）	
 * 
 * 举例：
 * 		public void say(){}
 * 		public void say(String name){}
 * 		public int getAge(){ retrun 10; }
 * 		public int getAge(int age){ return 10;}
 * 
 * 
 * 
 */
public class MethodTest {

	public static void main(String[] args) {
		
		//调用方法：对象名.方法名
		Person p = new Person();
		p.say();
		int age = p.getAge();
		System.out.println(age);
		System.out.println(p.getAge());
		
		//System.out.println(p.say());  //编译不通过，因为p.say()没有返回值
		System.out.println("---------------------------------");
		p.say2();
		
		System.out.println("--------------------------------");
		p.setAge(100,"小泽老师");
		//p.setAge("小泽老师", 100);//编译错误：实参和形参的类形，个数和顺序都必须保持一致
		p.show();
		p.getName();
		System.out.println(p.getName());
	}
}

class Person{
	
	String name = "小泽泽";
	int age = 39;
	
	public void show(){
		//方法中可以调用属性
		System.out.println(name + age);
		//方法中可以直接调用本类中的方法
		say();
	}
	
	public void dead(){
		System.out.println("aaaaa");
		//dead(); //除了递归，不要自己调用自己会发生错误 ：StackOverflowError
	}
	
	public void setAge(int age,String name){
		System.out.println(name + " " + age);
	}
	
	public void say(){
		System.out.println("老王说话了");
	}
	
	void say2(){
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 1){
				return; //结束当前的方法
			}
		}
		
		System.out.println("say2");
	}
	
	public int getAge(){
		int a = 10;
		return a; //return 10;
		//System.out.println("aaaa"); //编译不通过 return后面不能再有其它语句。
	}
	
	public String getName(){
		if(10 > 5){
			return "aaa";
		}
		return "ccc";
	}
	
	public String getName2(){
		if(10 > 5){
			return "aaa";
		}else{
			return "ccc";
		}
	}
}
