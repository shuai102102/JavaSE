package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;
public class IOTest {

	@Test
	public void test(){
		FileInputStream fis = null;
		try{
			File file = new File("aaa.txt");
			 fis = new FileInputStream(file);
			byte[] b =new byte[1024];
			int len = 0;
			while((len = fis.read(b)) != -1){
				System.out.println(new String(b, 0, len));
			}
		}catch (Exception e) {
			
		}finally{
			try{
				if(fis != null){
					fis.close();
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
	
	
	@Test
	public void test2(){
		FileOutputStream fos = null;
		try{
			File file = new File("bbb.txt");
			 fos = new FileOutputStream(file,true);
			 fos.write("asdfasdf".getBytes());
			 fos.write("qwer".getBytes());
		}catch (Exception e) {
			
		}finally {
			try {
				if(fos != null){
					fos.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	@Test
	public void Test3(){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File file = new File("aaa.txt");
			File file2 = new File("ccc.txt");
			
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			
			byte[] b = new byte[1024];
			int len = 0;
			while((len = fis.read(b)) != -1){
				fos.write(b, 0, len);
			}
		
		} catch (Exception e) {
		
		}finally {
			try {
				if( fis != null){
					fis.close();
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
	public void Test4(){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File file = new File("D:\\java\\day21\\code\\aaa.avi");
			File file2 = new File("D:\\java\\day21\\code\\bbb.avi");
			
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			
			byte[] b = new byte[1024];
			int len = 0;
			while((len = fis.read(b)) != -1){
				fos.write(b, 0, len);
			}
		
		} catch (Exception e) {
		
		}finally {
			try {
				if( fis != null){
					fis.close();
				}
				if(fos != null){
					fos.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
