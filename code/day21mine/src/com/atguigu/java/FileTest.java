package com.atguigu.java;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

/*
 * 
 * java.io.File:
 * 
 * 说明：
 * 		1.File用来表示一个文件（.txt .mp3 .mp4 .avi）或者目录
 * 		2.通过File可以新建，删除，重命名文件或者目录。但是不能访问文件内容。
 * 		3.一般将File作为参数传递给构造器
 */

public class FileTest {
	/*
	 * 相对路径：相对于当前项目的位置。（用的比较多，比较常见）
	 * 绝对路径：包含盘符在内的文件的位置。
	 */
	@Test
	public void test(){
		//File常见构造器
		//第一种构造器
		File file = new File("person.txt");
		File file2 = new File("D:\\java\\code\\day21mine\\person.txt");
		File file3 = new File("D:/java/code/day21mine/person.txt");
		//第二种构造器
		File file4 = new File("D:/java/code/day21mine", "person.txt");
		
	}
	/*
	 *  getName()
		getPath()
		getAbsoluteFile()
		getAbsolutePath()
		getParent()
		toPath()
		
		renameTo(File newName)

	 */
	@Test
	public void test2(){
		//表示一个文件 
		File file = new File("person.txt");
		//表示一个目录
		File file2 = new File("D:\\java\\day21\\a");
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		System.out.println(file.toPath());
		
		System.out.println("---------------------");
		
		System.out.println(file2.getName());
		System.out.println(file2.getPath());
		System.out.println(file2.getAbsoluteFile());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getParent());
		System.out.println(file2.toPath());
	}
	
	/*
	 * renameTo(File newName)
	 * 将当前文件移动到newName中
	 * new File("F:\\a\\b\\person.txt")
	 * 当前文件必须存在。person.txt可以不存.b目录必须存在。
	 */
	@Test
	public void test3(){
		File file = new File("person.txt");
		boolean boo = file.renameTo(new File("D:\\java\\day21\\a"));
		System.out.println(boo);
	}
	
	/*
	 *  exists()
		canWrite()
		canRead()
		isFile() //判断是否是一个文件
		isDirectory() //判断是否是一个目录

	 */
	@Test
	public void test4(){
		File file = new File("person.txt");
		File file2 = new File("D:\\java\\day21\\a");
		
		file.setReadOnly();//设置当前文件只能读
		
		System.out.println(file.exists());
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		System.out.println(file2.isDirectory());
	}
	/*
	 * 目录操作相关
	 *  mkdir() : 在父目录存在的前况下可以创建成功。如果父母录不存那么创建失败。
		mkdirs() : 无论父目录是否存在都可以创建成功。
		delete() : 删除目录
		list() : 以String[]的形式返回该目录下的所有文件和目录
		listFiles() :以File[]的形式返回该目录下的所有文件和目录

	 */
	
	@Test
	public void test5(){
		File file = new File("D:\\java\\day21\\a");
		File file2 = new File("D:\\java\\day21\\a");
		File file3 = new File("D:\\java\\day21");
		
//		boolean mkdir = file.mkdir();
//		boolean mkdirs = file2.mkdirs();
//		
//		System.out.println(mkdir);
//		System.out.println(mkdirs);
		
//		boolean delete = file2.delete();
//		System.out.println(delete);
		
		System.out.println("--------------------");
		
		String[] list = file3.list();
		for(String files : list){
			System.out.println(files);
		}
		
		System.out.println("--------------------");
		
		File[] listFiles = file3.listFiles();
		for(File files : listFiles){
			System.out.println(files);
		}
		/*--------------------
		a
		code
		exer
		homework
		test
		每日一考（五组）.xlsx
		--------------------
		D:\java\day21\a
		D:\java\day21\code
		D:\java\day21\exer
		D:\java\day21\homework
		D:\java\day21\test
		D:\java\day21\每日一考（五组）.xlsx
	*/
	}
	
	/*
	 *  lastModified() : 文件最后修改的时间
		length() : 内容的大小

	 */
	@Test
	public void test6(){
		File file = new File("D:\\java\\day21\\a");
		System.out.println(file.lastModified());
		System.out.println(file.length());
	}
	/*
	 *  createNewFile()
		delete()

	 */
	@Test
	public void test7() throws Exception{
		File file = new File("D:\\java\\day21\\a\\123.txt");
		/*
		 * 注意：创建文件前先考虑父目录是否存在如果存在可直接创建文件，如果不存在先创建目录
		 */
//		System.out.println(file.createNewFile());
		System.out.println(file.delete());
		
	}
	
	
	/*
	 * 作业：判断当前的文件是否存在如果存在 那么删除 如果不存在那么创建
	 *  \\a\\b\\c\\123.txt
	 */

	@Test
	public void test8() throws Exception {
		File file = new File("D:\\java\\day21\\a");
		boolean exists = file.exists();
		if (exists) {
			file.delete();
		} else {

			file.getParentFile().mkdirs();
			file.createNewFile();

		}
	}
	
}