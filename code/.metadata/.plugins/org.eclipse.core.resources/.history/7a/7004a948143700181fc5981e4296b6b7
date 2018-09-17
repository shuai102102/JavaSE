package com.atguigu.java4;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;

/*
 *  TCP协议：
	1.使用TCP协议前，须先建立TCP连接，形成传输数据通道
	2.传输前，采用“三次握手”方式，是可靠的
	3.TCP协议进行通信的两个应用进程：客户端、服务端
	4.在连接中可进行大数据量的传输
	5.传输完毕，需释放已建立的连接，效率低

 */

public class SocketTest {

	/*
	 * 客户端
	 */
	@Test
	public void Client() throws Exception{
		/*
		 * 创建socket的对象
		 * 第一个参数是IP地址 - 服务器的IP地址
		 * 第二个参数是端口号 - 和服务器端口号一致
		 */
		
		Socket socket = new Socket(InetAddress.getLocalHost(), 10006);
		//获取一个输入流
		OutputStream os = socket.getOutputStream();
		os.write("我是客户端".getBytes());
		socket.shutdownOutput();
		os.close();
		socket.close();
		
	}
	
	/*
	 * 服务器
	 */
	@Test
	public void Server() throws Exception{
		//创建一个ServerSocket
		ServerSocket serverSocket = new ServerSocket(10006);
		//接受请求
		Socket socket = serverSocket.accept();
		//获取输入流
		InputStream is = socket.getInputStream();
		byte[] b = new byte[1024];
		int len = 0;
		while((len = is.read(b)) != -1){
			System.out.println(new String(b, 0, len));
		}
		socket.shutdownInput();
		is.close();
		socket.close();
	
	}
	
}
