package com.atguigu.java4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.junit.Test;

public class URLTest {

	@Test
	public void test() throws Exception{
		
		URL url = new URL("http://192.168.10.100:8080/txt/hello.html");
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPath());
		System.out.println(url.getPort());
		
		//打开一个连接
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		//200
		int responseCode = conn.getResponseCode();
		//访问网络成功
		if(responseCode == 200){
			InputStream is = conn.getInputStream();
			FileOutputStream fos = new FileOutputStream(new File("hello.html"));
			
			byte[] b = new byte[1024];
			int len = 0;
			while((len = is.read(b)) != -1){
				fos.write(b, 0, len);
			}
			
			//关流
			is.close();
			fos.close();
		}
		
	}
}
