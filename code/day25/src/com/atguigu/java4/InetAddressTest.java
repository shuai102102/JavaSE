package com.atguigu.java4;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.Test;

public class InetAddressTest {

	@Test
	public void test() throws Exception{
		InetAddress byName = InetAddress.getByName("www.baidu.com");
		System.out.println(byName);
		//获取IP地址
		System.out.println(byName.getHostAddress());
		//获取域名
		System.out.println(byName.getHostName());
		
		
		/*
		 * 获取本地的IP地址
		 * 
		 */
		InetAddress localHost = InetAddress.getLocalHost();
		System.out.println(localHost.getHostAddress());
		System.out.println(localHost.getHostName());
	}
}
