package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/*
 * 对象流
 * 
 * 序列化 ：将对象写入到磁盘上
 * 
 * 反序列化：读出磁盘上存储的对象
 * 
 * 步骤：
 * 		1.要序列化的对象所在的类必须实现Serializable接口
 * 		2.要在实现了Serializable接口的类中加入private static final long serialVersionUID;
 *      3.要序列化对象的类中的所有属性也必须是可序列化的（基本数据类型除外）

 */
public class ObjectTest {

	
	@Test
	public void test() throws Exception{
		
		FileOutputStream fos = new FileOutputStream(new File("object.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Person person = new Person("xiaoloongge",18,new Address("1", "国王街23号"));
		oos.writeObject(person);
		
		oos.close();
		fos.close();
		
	}
	
	@Test
	public void test2() throws Exception{
		FileInputStream fis = new FileInputStream(new File("object.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person person = (Person) ois.readObject();
		person.show();
		person.address.say();
		
		ois.close();
		fis.close();
	}
	
}
