package com.atguigu.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

import org.junit.Test;

/*
 * 随机存取文件流
 * RandomAccessFile
 * 
 */
public class RandomAccessFileTest {

	/*
	 * 写
	 */
	@Test
	public void test() throws Exception{
		
		RandomAccessFile raf = new RandomAccessFile(new File("r.txt"), "rw");
		raf.write("abcdefg".getBytes());
		raf.close();
		
	}
	
	/*
	 * 读
	 */
	@Test
	public void test2() throws Exception{
		RandomAccessFile raf = new RandomAccessFile(new File("r.txt"), "rw");
		byte[] b = new byte[1024];
		int len = 0;
		while((len = raf.read(b)) != -1){
			System.out.println(new String(b,0,len));
		}
		raf.close();
	}
	
	/*
	 * 
	 * 实现插入的操作
	 * 
	 * void seek(long pos)：将文件记录指针定位到 pos 位置
	 * 
	 * 插入的思想：在abcdefg中b的后面插入AAA - abAAAcdefg
	 * 1.将指针移动到b的后面
	 * 2.读取b后面的字符串，并保存到一个变量中
	 * 3.将指针后移到b的后面
	 * 4.写入要插入的数据
	 * 5.再写入保存的数据
	 */
	@Test
	public void test3() throws Exception{
		RandomAccessFile raf = new RandomAccessFile(new File("r.txt"), "rw");
		raf.seek(2); //将指针移动到b的位置
		String readLine = raf.readLine();//读取b后面的字符串，并保存到一个变量中
		raf.seek(2); //将指针后移到b的后面
		raf.write("AAA".getBytes());//写入要插入的数据
		raf.write(readLine.getBytes());//再写入保存的数据
		raf.close();
	}
	
	@Test
	public void test4() throws Exception{
		RandomAccessFile raf = new RandomAccessFile(new File("r.txt"), "rw");
		raf.seek(2); //将指针移动到b的位置
		//读取b后面的字符串，并保存到一个变量中
		byte[] b = new byte[1024];
		int len = 0;
		String str = "";
		while((len = raf.read(b)) != -1){
			str += new String(b,0,len);
		}
		raf.seek(2); //将指针后移到b的后面
		raf.write("AAA".getBytes());//写入要插入的数据
		raf.write(str.getBytes());//再写入保存的数据
		raf.close();
	}
}
