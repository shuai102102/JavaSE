package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class ObjectTest {

	@Test
	public void test(){
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		Person person = new Person(18,"xiaolongge",new Address("84号", "查令街"));
		
		try {
			fos = new FileOutputStream(new File("objec.txt"));
			oos = new ObjectOutputStream(fos);
			try {
				oos.writeObject(person);
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			try {
				if(oos != null){
					oos.close();
				}
				if(fos != null){
					fos.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	@Test
	public void test2(){
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("objec.txt");
			ois = new ObjectInputStream(fis);
		 
			 Person person =(Person) ois.readObject();
			 person.show();
			 person.address.say();
		 
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(ois != null){
					ois.close();
				}
				if(fis != null){
					fis.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
}
