package com.atguigu.java4;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

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
		String str = "嘿嘿 哈哈  么么哒";
		//创建数据包
		/*
		 * 第一个参数是 内容
		 * 第二个参数是 内容的长度 - 数组的长茺
		 * 第三个参数 IP地址 - 服务端的IP地址
		 * 第四个参数 端口号 - 服务端的端口号
		 */
		DatagramPacket p = new DatagramPacket(str.getBytes(), str.getBytes().length,
				InetAddress.getLocalHost(), 6666);
		//发送数据包
		ds.send(p);
		//关闭
		ds.close();
		
	}
	
	/*
	 * 服务端
	 * 
	 * 
	 */
	@Test
	public void server() throws Exception{
		DatagramSocket ds = new DatagramSocket(6666);
		//用来接收数据
		byte[] b = new byte[1024];
		//创建数据包
		DatagramPacket p = new DatagramPacket(b, b.length);
		
		//接收数据
		ds.receive(p);
		//输出内容
		/*
		 * p.getLength() 接收到的数据的长度
		 */
		System.out.println(new String(b,0,p.getLength()));
		//关闭
		ds.close();
		
	
		
	}
}
