package com.atguigu.java;



/*
 * 
 * 枚举类中常用的方法
 */
public class EnumTest3 {
	
	public static void main(String[] args) {
		
		Season3 s = Season3.SPRING;
		System.out.println(s.getNAME() +s.getDESC());
		
		Season3[] values = s.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i].getNAME());
		}
		
		System.out.println("-------------------------");
		
		Season3[] values2 = Season3.values();
		for (int i = 0; i < values2.length; i++) {
			System.out.println(values2[i].getNAME());
		}
		
		System.out.println("-------------------------");
		
		Season3 valueOf = Season3.valueOf("SPRING");
		System.out.println(valueOf.getNAME());
	}
}

enum Season3{
	
	SPRING("春天","春眠不觉晓"),
	WINTER("冬天","冬天就长膘");
	
	private final String NAME;
	private final String DESC;
	
	private Season3(String name,String desc){
		this.DESC = desc;
		this.NAME = name;
	}

	public String getNAME() {
		return NAME;
	}

	public String getDESC() {
		return DESC;
	}
}