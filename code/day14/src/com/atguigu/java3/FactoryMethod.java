package com.atguigu.java3;

/*
 * 工厂方法
 */
public class FactoryMethod {

	public static void main(String[] args) {
		
		IWorkFactory sf = new StudentWorkFactory();
		Work work = sf.getWork();
		work.doWork();
		
		
		IWorkFactory tf = new TeacherWorkFactory();
		Work tw = tf.getWork();
		tw.doWork();
		
		
	}
}

interface IWorkFactory{
	Work getWork();
}

class StudentWorkFactory implements IWorkFactory{

	@Override
	public Work getWork() {
		
		return new StudentWork();
	}
	
}

class TeacherWorkFactory implements IWorkFactory{

	@Override
	public Work getWork() {
		
		return new TeacherWork();
	}
	
}


interface Work{
	void doWork();
}

class StudentWork implements Work{

	@Override
	public void doWork() {
		System.out.println("学生天天听课很忙");
	}
	
}

class TeacherWork implements Work{

	@Override
	public void doWork() {
		System.out.println("老师天天上课很忙");
	}
	
}