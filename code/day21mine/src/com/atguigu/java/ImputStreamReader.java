package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class ImputStreamReader {

	/*
	 * 转换流： 作用：①将字节流转成字符流 ②可以改变字符编码 注意：读取的文件内容的编码集和InputStreamReader的编码集必须保持一致
	 */
	@SuppressWarnings("resource")
	@Test
	public void test() {
		File file = new File("char8.txt");
		File file2 = new File("char9.txt");

		FileInputStream fis = null;
		FileOutputStream fos = null;

		InputStreamReader isr = null;
		OutputStreamWriter osw = null;

		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis, "gbk");
			fos = new FileOutputStream(file2);

			osw = new OutputStreamWriter(fos, "utf-8");

			char[] c = new char[1024];
			int len = 0;

			while ((len = isr.read(c)) != -1) {
				osw.write(c, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (isr != null) {
					isr.close();
				}
				if (osw != null) {
					osw.close();
				}

				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
