package com.atguigu.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class CollectionsTest {
	
	public static void main(String[] args) {
		
	{
		
		Scanner s = new Scanner(System.in);
		List list = new ArrayList(10);
		for (int i = 0; i < list.size(); i++) {
			list.add(s.nextInt());
		}
		
		System.out.println(list);
	}
}}
