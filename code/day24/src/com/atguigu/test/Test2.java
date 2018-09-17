package com.atguigu.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class Test2 {

	
	@Test
	public void test9() throws Exception{
		FileOutputStream fos = new FileOutputStream(new File("Person.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Person person = new Person();
		oos.writeObject(person);
		
		oos.close();
		fos.close();
	}
	
	@Test
	public void Test3() throws Exception{
		FileInputStream fis = new FileInputStream(new File("Person.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person person = (Person)ois.readObject();
		
		ois.close();
		fis.close();
		
	}
}
