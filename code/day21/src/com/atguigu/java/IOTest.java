package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/*
 * 一 流的分类
 * 1.按操作数据单位不同分为：字节流(8 bit)，字符流(16 bit)  
   2.按数据流的流向不同分为：输入流，输出流
   3.按流的角色的不同分为：节点流，处理流


  二  四个抽象基类
  	InputStream
  	OutputStream
  	Reader
  	Writer
  	
 */
public class IOTest {

	public static void main(String[] args) throws Exception {

		/*
		 * FileInpuptStream
		 */
		// 第一步创建File对象
		File file = new File("person.txt");
		// 第二步 创建流的对象
		FileInputStream fis = new FileInputStream(file);
		// 第三步 读入数据

		/*
		 * read() : 读取文件中的一个字节
		 */
		// int read = fis.read();
		int read = 0;

		/*
		 * read = fis.read(); while(read != -1){ System.out.println((char)read);
		 * read = fis.read(); }
		 */

		/*
		 * while((read = fis.read()) != -1){ //read = fis.read();
		 * System.out.println((char)read); }
		 */

		byte[] b = new byte[1024];

		while ((read = fis.read(b)) != -1) {
			System.out.println("===" + read);
			System.out.println(new String(b, 0, read));
		}

		// 关闭流
		fis.close();

	}

	@Test
	public void test() {
		// 第一步创建File对象
		FileInputStream fis = null;
		try{
			File file = new File("aaa.txt");
			// 第二步 创建流的对象
			fis = new FileInputStream(file);
			// 第三步 读入数据
			int read = 0;
			byte[] b = new byte[1024];
			while ((read = fis.read(b)) != -1) {
//				System.out.println("===" + read);
//				System.out.println(new String(b, 0, read));
				for (int i = 0; i < read; i++) {
					System.out.println((char)b[i]);
				}
			}
		}catch (Exception e) {
			
		}finally{
			// 关闭流
			try {
				if(fis != null){
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * FileOutputStream
	 */
	@Test
	public void test2() throws Exception{
		//第一步创建File对象
		File file = new File("aaa.txt"); //注意 向一个文件写入内容 那么这个文件可以不存在
		//第二步创建流
		/*
		 * new FileOutputStream(File file,boolean boo);
		 * boo如果为true会在原来的内容上进行追加
		 * boo如果为false会把原来的内容进行覆盖。
		 * 如果没有使用默认是false
		 */
		FileOutputStream fos = new FileOutputStream(file,true);
		//第三步输出内容
		fos.write("bbbb".getBytes());
		fos.write("bbcc".getBytes());
		//第四步关闭流
		fos.close();
	}
	
	/*
	 * 一边读一边写
	 */
	@Test
	public void test3() throws Exception{
		//第一步创建File对象
		File file = new File("aaa.txt"); //读取内容的文件
		File file2 = new File("ccc.txt");//写入内容的文件
		//第二步创建流
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file2);
		//第三步读取内容和写出内容
		byte[] b = new byte[5];
		int len = 0;
		while((len = fis.read(b)) != -1){
			//写出内容
//			fos.write(b);
			fos.write(b,0,len);
		}
		//第四步关闭流
		fis.close();
		fos.close();
	}
	
	/*
	 * 复制
	 * 
	 */
	@Test
	public void test4() throws Exception{
		
		String desc = "C:\\Users\\Administrator\\Desktop\\bbb.avi";
		String src = "C:\\Users\\Administrator\\Desktop\\aaa.avi";
		copy(desc,src);
	}
	
	public void copy(String desc,String src) throws Exception{
		//创建File对象
		File file = new File(desc); //复制的文件  要写出的文件
		File file2 = new File(src); //源文件 要读取的文件
		
		//创建流的对象
		FileInputStream fis = new FileInputStream(file2);
		FileOutputStream fos = new FileOutputStream(file);
		
		//一边读内容一边写内容
		byte[] b = new byte[1024];
		int len = 0;
		while((len = fis.read(b)) != -1){
			fos.write(b, 0, len);
		}
		
		//关闭流
		fis.close();
		fos.close();
		
	}
}
