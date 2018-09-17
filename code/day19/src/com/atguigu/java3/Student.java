package com.atguigu.java3;

/*
 * 
 * 向TreeSet中添加自定义类对象的元素 需要自定义类实现Comparable接口
 */
public class Student implements Comparable {

	String name;
	int age;
	
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "(" + name + " " + age + ")";
	}

	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Student){
			Student stu = (Student) o;
			//return this.name.compareTo(stu.name);
			int a = this.age - stu.age;
			
			if(a == 0){//说明两个对象中的age是相同的
				return this.name.compareTo(stu.name);
			}
			
			return a;
		}
		return 0; //结果是0就认为两个对象一样，不能添加
	}
}
