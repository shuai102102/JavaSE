package com.atguigu.java3;

/*
 * 
 * 数组：多个相同数据类型的组合
 * 
 * 格式：数据类型[] 变量名 = new 数据类型[10];
 * 
 * 说明：
 * 		1.数组是引用数据类型
 * 		2.数组中的元素可以是基本数据类型也可以是引用数据类型
 * 
 * 
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		//思考？为什么要用数组
		int a = 25;
		int b = 30;
		int c = 40;
		
		//1.数组的声明和初始化
		//动态初始化:数组的声明和赋值是分开进行的
		int[] scores = new int[5]; //5 表示数组的长度
		//int scores[]; //不建议这么用
		
		
		//静态初始化 ：数组的声明和赋值是同时进行的
		int[] scores2; 
		scores2 = new int[]{25,40,30};
		int[] scores3 = {1,2,3,4,5};
		String[] names = {"小明","小刚"};
		/*
		 * 编译错误
		int[] scores3;
		scores3 = {20,30,40};
		*/
		//注意：无论静态初始化还是动态初始化一旦数组创建完成，数组的长度不可变
		
		//2.元素的赋值和获取
		int i2 = scores3[0]; //0 是索引值或者叫做下角标。索引值是从0开始的到数组的长度-1
		System.out.println(i2);
		System.out.println(scores3[1]);
		
		scores[0] = 5;
		System.out.println(scores[0]);
		
		//3.数组的属性 length-用来表示数组的长度
		System.out.println("数组的长度==" + scores3.length);
		
		//4.元素的遍历
		//运行异常：java.lang.ArrayIndexOutOfBoundsException
		//下解标越界
		//System.out.println(names[10]); 
		for(int i = 0; i < names.length;i++){ //i 代表下角标
			System.out.println(names[i]);
		}
		System.out.println("--------------------------------------");
		//5.数组中元素的默认值
		/*
		 * byte short int long : 0
		 * double float : 0.0
		 * char : \u0000
		 * boolean : false
		 * 
		 * 引用数据类型：null
		 */
		String[] strs = new String[2];
		int[] numbers2 = new int[2];
		boolean[] boo = new boolean[2];
		System.out.println(strs[0]);
		System.out.println(numbers2[0]);
		System.out.println(boo[0]);
		
		
		
	}
}
