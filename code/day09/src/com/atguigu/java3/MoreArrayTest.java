package com.atguigu.java3;

/*
 * 
 * 多维数组 ： 二维数组 - 数组中的元素还是数组
 * 
 */
public class MoreArrayTest {

	public static void main(String[] args) {
		
		//1.二维数组的声明和初始化
		//二维数组的动态初始化
		String[][] persons = new String[2][3];
		
		String[][] persons2 = new String[3][];
		persons2[0] = new String[2];
		persons2[1] = new String[2];
		persons2[2] = new String[3];
		
		//二维数组的静态初始化
		int[][] numbers = new int[][]{{5,3},{2,8}};
		int[][] numbers2 = {{1,2},{3,4,5}};
		
		/*
		String a[][];
		String[] b[];
		String[][] c; //建议使用这一种
		*/
		
		//2.二维数组元素的获取和赋值
		persons[0][0] = "小刚";
		persons[0][1] = "110";
		
		persons[1][0] = "小明";
		persons[1][1] = "120";
		
		System.out.println(persons[0][0]);
		System.out.println(persons[0][1]);
		System.out.println(persons[1][0]);
		System.out.println(persons[1][1]);
		
		//3.二维数组的属性
		int length = persons.length; //2 二维数组的长度
		System.out.println(length);
		System.out.println(persons[0].length); //二维数组中第一个元素（一维数组）的长度
		System.out.println(persons[1].length); //二维数组中第二个元素（一维数组）的长度
		
		System.out.println("--------------------------");
		//4.遍历
		for(int i = 0; i < persons.length; i++){
			
			for (int j = 0; j < persons[i].length; j++) {
				
				System.out.print(persons[i][j]);
			}
			
			System.out.println();
		}
		
		//5.二维数组的默认值
		// 二维数组中的元素的默认值是null.  二维数组中的一维数组中的元素的默认值和一维数组中元素的默认值一样。
		
		
		
	}
}
