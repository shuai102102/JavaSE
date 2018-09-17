package com.atguigu.java;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
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
	public void test() {
		System.out.println("aaa");
		new Scanner(System.in);
	}

	/*
	 * 从键盘输入字符串，要求将读取到的整行字符串转成大写输出。 然后继续进行输入操作，直至当输入“e”或者“exit”时，退出程序。
	 */
	@Test
	public void test2() throws Exception {
		// 因为System.in是字节流。所以考虑将字节流转成字符流
		InputStreamReader isr = new InputStreamReader(System.in);
		// 因为BufferedReader可以一行一行的读
		BufferedReader br = new BufferedReader(isr);
		String str = null;
		while ((str = br.readLine()) != null) {
			if (str.equalsIgnoreCase("e") || str.equalsIgnoreCase("exit")) {
				break;
			}
			System.out.println("输出:" + str.toUpperCase());
		}

		br.close();
		isr.close();
	}

	/*
	 * 打印流（了解）
	 */
	@Test
	public void test5() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File("text.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		// 创建打印输出流,设置为自动刷新模式(写入换行符或字节 '\n' 时都会刷新输出缓冲区)
		PrintStream ps = new PrintStream(fos, true);
		
		if (ps != null) { // 把标准输出流(控制台输出)改成文件
			/*
			 * System.out 输出到控制台。
			 */
			System.setOut(ps);
		}
		
		for (int i = 0; i <= 255; i++) { // 输出ASCII字符
			System.out.print("a");
			if (i % 50 == 0) { // 每50个数据一行
				System.out.println(); // 换行
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
	public void test6() throws Exception{
		FileOutputStream fos = new FileOutputStream(new File("aaa.txt"));
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("aaa");
		dos.writeInt(123);
		
		dos.close();
		fos.close();
	}
	
	@SuppressWarnings("resource")
	@Test
	public void test7() throws Exception{
		
		FileInputStream fis = new FileInputStream(new File("aaa.txt"));
		DataInputStream dis = new DataInputStream(fis);
		/*
		 * 注意：多和写的顺序必须保持一致
		 */
		String name = dis.readUTF();
		int age = dis.readInt();
		
		System.out.println(name + age);
		dis.close();
		fis.close();
	}

}
