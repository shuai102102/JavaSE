package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class InputStreamReaderTest {

	
	/*
	 * 转换流：
	 * 作用：①将字节流转成字符流  ②可以改变字符编码
	 * 注意：读取的文件内容的编码集和InputStreamReader的编码集必须保持一致
	 */
	@SuppressWarnings("resource")
	@Test
	public void test() throws Exception{
		
		File file = new File("char8.txt");
		File file2 = new File("char9.txt");
		
		FileInputStream fis = new FileInputStream(file);
		//将字节流转成了字符流
		InputStreamReader isr = new InputStreamReader(fis,"gbk");
		
		
		FileOutputStream fos = new FileOutputStream(file2);
		//将字符流转成字节流
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		
		char[] c = new char[1024];
		int len = 0;
		
		while((len = isr.read(c)) != -1){
			osw.write(c, 0, len);
		}
		
		isr.close();
		osw.close();
		fos.close();
		fis.close();
	}
}
