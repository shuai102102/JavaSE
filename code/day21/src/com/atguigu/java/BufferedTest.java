package com.atguigu.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/*
 * 缓冲流
 * 
 * 
 */
public class BufferedTest {

	/*
	 * 
	 * BufferedInputStream
	 */
	@Test
	public void test() throws Exception {
		File file = new File("aaa.txt");

		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);

		byte[] b = new byte[20];
		int len = 0;
		while ((len = bis.read(b)) != -1) {
			System.out.println(new String(b, 0, len));
		}

		bis.close(); // 先关外边的流，再关里边的流
		fis.close();
	}

	/*
	 * BufferedOutputStream
	 */
	@Test
	public void test2() throws Exception {
		File file = new File("abc.txt");

		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		bos.write("aaaa".getBytes());

		// bos.flush(); //刷新数据 - 将内存中缓存的数据写入到文件

		bos.close(); // 关闭的时候会掉用flush方法
		fos.close();

	}

	/*
	 * 一边读一边写
	 */

	@Test
	public void test3(){
		File desc = new File("C:\\Users\\Administrator\\Desktop\\bbb.avi");
		File src = new File("C:\\Users\\Administrator\\Desktop\\aaa.avi");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(src);
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream(desc);
			bos = new BufferedOutputStream(fos);

			byte[] b = new byte[1024];
			int len = 0;
			while ((len = bis.read(b)) != -1) {
				bos.write(b, 0, len);
			}
		} catch (Exception e) {

		} finally {
			// 先关外面的再关里面的
			if(bos != null){
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 
			if(bis != null){
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	@SuppressWarnings("resource")
	@Test
	public void test4() throws Exception{
		
		File file = new File("aaa.txt");
		File file2 = new File("cdd.txt");
		
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(file2);
		BufferedWriter bw = new BufferedWriter(fw);
		
//		char[] c = new char[1024];
//		int len = 0;
//		while((len = br.read(c)) != -1){
//			bw.write(c, 0, len);
//		}
		

		
		String str = "";
		while((str = br.readLine()) != null){
			bw.write(str);
		}
		
		br.close();
		bw.close();
		fw.close();
		fr.close();
	}
}
