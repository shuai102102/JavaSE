package com.atguigu.exer2;

/*
 * 
 * 定义一个“点”（Point）类用来表示三维空间中的点（有三个坐标）。要求如下：
    1）可以生成具有特定坐标的点对象。
    2）提供可以设置三个坐标的方法。
    3）提供可以计算该“点”距原点距离平方的方法。

 */
public class Point {

	private int x;
	private int y;
	private int z;
	
	public Point(int a,int b,int c){
		x = a;
		y = b;
		z = c;
	}
	
	public int getDistance(){
		return x * x + y * y + z * z;
	}
	
	
	public void setX(int a){
		x = a;
	}
	
	public int getX(){
		return x;
	}
	
	public void setY(int b){
		y = b;
	}
	
	public int getY(){
		return y;
	}
	
	public void setZ(int c){
		z = c;
	}
	
	public int getZ(){
		return z;
	}
}
