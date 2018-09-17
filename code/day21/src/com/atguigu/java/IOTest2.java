package com.atguigu.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/*
 * 
 * Reader
 * Writer
 * 
 * 字符流和字节流的使用？
 * 字节流：文件的复制
 * 字符流：一般用于文本的读取
 * 
 */
public class IOTest2 {

	/*
	 * FileReader
	 */
	@Test
	public void test() throws Exception{
		//第一步创建File对象
		File file = new File("aaa.txt");
		//第二步创建流
		FileReader fr = new FileReader(file);
		//第三步读取数据
		char[] c = new char[1024];
		int len = 0;
		while((len = fr.read(c)) != -1){
			System.out.println(new String(c,0,len));
//			for (int i = 0; i < len; i++) {
//				System.out.print(c[i]);
//			}
		}
		
		//第四步关闭流
		fr.close();
	}
	
	/*
	 * 
	 * FileWriter
	 */
	@Test
	public void test2() throws Exception{
		//第一步创建File对象
		File file = new File("fff.txt");
		//第二步创建流
		/*
		 * new FileWriter(File  file,boolean append)
		 * append如果为true会在原来的内容上进行追加
		 * append如果为false会覆盖原来的内容
		 * 默认为false
		 */
		FileWriter fw = new FileWriter(file,true);
		//第三步写内容
		fw.write("哈哈哈哈哈哈嘿嘿嘿嘿嘿！！！");
		//第四步关流
		fw.close();
	}
	
	/*
	 * 一边读一边写
	 */
	@Test
	public void test3() throws Exception{
		File file = new File("fff.txt");
		File file2 = new File("ggg.txt");
		
		FileReader fr = new FileReader(file);
		FileWriter fw = new FileWriter(file2);
		
		char[] c = new char[1024];
		int len = 0;
		
		while((len = fr.read(c)) != -1){
			fw.write(c, 0, len);
		}
		
		fr.close();
		fw.close();
	}
	
	/*
	 * 一边读一边写
	 * 
	 * 不能实现音视频等文件的复制
	 */
	@Test
	public void test4() throws Exception{
		File file = new File("C:\\Users\\Administrator\\Desktop\\aaa.avi");
		File file2 = new File("C:\\Users\\Administrator\\Desktop\\bbb.avi");
		
		FileReader fr = new FileReader(file);
		FileWriter fw = new FileWriter(file2);
		
		char[] c = new char[1024];
		int len = 0;
		
		while((len = fr.read(c)) != -1){
			fw.write(c, 0, len);
		}
		
		fr.close();
		fw.close();
	}
}
