package com.atguigu.java;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

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
	public void test(){
		//第一步创建File对象
		File file = new File("aaa.txt");
		//第二步创建流
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			//第三步读取数据
			char[] c = new char[1024];
			int len = 0;
			while((len = fr.read(c)) != -1){
				System.out.println(new String(c, 0, len));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//第四步关闭流
				if(fr != null){
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	/*
	 * 
	 * FileWriter
	 */ 
	@Test
	public void test2(){
		//第一步创建File对象
		File file = new File("fff.txt");
		//第二步创建流
		/*
		 * new FileWriter(File  file,boolean append)
		 * append如果为true会在原来的内容上进行追加
		 * append如果为false会覆盖原来的内容
		 * 默认为false
		 */
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);
			//第三步写内容
			fw.write("哈哈哈哈哈哈吧嘿嘿嘿嘿嘿嘿嘿！！！！");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//第四步关闭流
				if(fw != null){
					fw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	/*
	 * 一边读一边写
	 * 不能音视频等文件的复制
	 * 
	 * */
	@Test
	public void test3(){
		File file = new File("aaa.txt");
		File file2 = new File("mmm.txt");
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(file);
			fw = new FileWriter(file2, true);
			
			char[] c = new char[1024];
			int len = 0;
			while((len = fr.read(c)) != -1){
				fw.write(c, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null){
					fr.close();
				}
				if(fw != null ){
					fw.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
