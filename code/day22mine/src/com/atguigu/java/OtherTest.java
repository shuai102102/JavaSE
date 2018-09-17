package com.atguigu.java;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

public class OtherTest {
	/*
	 * 标准输入输出流 System.in : 从键盘输入 System.out ： 输出到控制台
	 */
	@Test
	public void test(){
		System.out.println("aaa");
		new Scanner(System.in);
	}
	
	/*
	 * 从键盘输入字符串，要求将读取到的整行字符串转成大写输出。 然后继续进行输入操作，直至当输入“e”或者“exit”时，退出程序。
	 */
	@Test
	public void test2(){
		// 因为System.in是字节流。所以考虑将字节流转成字符流
		InputStreamReader isr= new InputStreamReader(System.in);
		// 因为BufferedReader可以一行一行的读
		BufferedReader br = new BufferedReader(isr);
		String str = null;
		try {
			while((str = br.readLine()) != null){
				if(str.equalsIgnoreCase("e") || str.equalsIgnoreCase("exit")){
					break;
				}
				System.out.println("输出：" + str.toUpperCase());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(br == null){
					br.close();
				}
				if(isr == null){
					isr.close();
				}
					
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	

	/*
	 * 打印流（了解）
	 */
	@Test
	public void test5(){
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File("text.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintStream ps = new PrintStream(fos);
		if(ps != null){
			System.setOut(ps);
		}
		
		for (int i = 0; i < 255; i++) {
			System.out.print("a");
			if(i % 50 == 0){
				System.out.println();
			}
		}
		ps.close();
		
	}
	
	/*
	 * 数据流
	 * DataInputStream
	 * DataOutputStream
	 */
	@Test
	public void test6(){
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(new File("aaa.txt"));
			dos = new DataOutputStream(fos);

			try {
				dos.writeUTF("aaa");
				dos.writeInt(123);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if(dos != null)
					dos.close();
					if(fos != null){
						fos.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
	
	@Test
	public void test7(){
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream(new File("aaa.txt"));
			dis = new DataInputStream(fis);
			
			try {
				String name = dis.readUTF();
				int age = dis.readInt();
				System.out.println(name + age);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(dis == null){
					dis.close();
				}
				if(fis == null ){
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
		}
	}
	
}



