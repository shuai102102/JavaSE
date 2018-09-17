package com.atguigu.exer2;

public class ExerTest2 {

}

interface Playable {
	void play();
}

interface Bounceable {
	void play();
}

interface Rollable extends Playable, Bounceable {
	Ball ball = new Ball("PingPang"); //常量

}

class Ball implements Rollable {
	private String name;

	public String getName() {
		return name;
	}

	public Ball(String name) {
		this.name = name;
	}

	public void play() {
		//ball = new Ball("Football"); final修饰的变量 不能被修改
		System.out.println(ball.getName());
	}
}
