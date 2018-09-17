package com.atguigu.java4;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import org.junit.Test;

/*
 * UDP协议：
	1.将数据、源、目的封装成数据包，不需要建立连接
	2.每个数据报的大小限制在64K内
	3.因无需连接，故是不可靠的
	4.发送数据结束时无需释放资源，速度快

 */

public class DatagramSocketTest {
	/*
	 * 客户端
	 */
	@Test
	public void client() throws Exception{
		DatagramSocket ds = new DatagramSocket();
		String str = "hahahah,你是傻逼吧";
		DatagramPacket p = new DatagramPacket(str.getBytes(), str.getBytes().length,InetAddress.getLocalHost(), 12345);
		ds.send(p);
		ds.close();
	}
	
	/*
	 * 服务端
	 * 
	 * 
	 */
	@Test
	public void server() throws Exception{
		DatagramSocket ds = new DatagramSocket(12345);
		byte[] b = new byte[1024];
		DatagramPacket p = new DatagramPacket(b, b.length);
		ds.receive(p);
		//输出内容
		/*
		 * p.getLength() 接收到的数据的长度
		 */
		System.out.println(new String(b, 0, p.getLength()));
		
		ds.close();
	}
	
}
