package com.atguigu.exer;


/*
 * 
 * 4.定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。 
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定，打印出3年级(state值为3）的学生信息。
提示：
1) 生成随机数：Math.random()，返回值类型double;  
2) 四舍五入取整：Math.round(double d)，返回值类型long。

 */
public class StudentTest {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 20; i++) {
			//创建学生对象
			Student student = new Student();
			//给学生对象的属性进行赋值
			student.number = i;
			//0 - 100
			double random = Math.random();
			double random2 = random * 100;
			student.score = (int) Math.round(random2);
			// 1 - 6
			student.state = (int)(random * 6) + 1;
			
			if(student.state == 3){
				System.out.println(" state=" + student.state + " number=" + student.number 
						+ " score=" + student.score);
			}
			
		}
	}
}

class Student{
	
	int number;
	int state;
	int score;
	
	
}
