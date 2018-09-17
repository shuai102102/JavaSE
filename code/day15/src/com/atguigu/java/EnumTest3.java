package com.atguigu.java;

/*
 * 
 * 枚举类中常用的方法
 */
public class EnumTest3 {

	public static void main(String[] args) {

		Season3 spring = Season3.SPRING;
		System.out.println(spring.getNAME() + spring.getDESC());
		
		//values()拿到枚举类中的所有的对象
		Season3[] values = spring.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i].getNAME());
		}
		
		System.out.println("-----------------------------");
		
		Season3[] values2 = Season3.values();
		for (int i = 0; i < values2.length; i++) {
			System.out.println(values2[i].getNAME());
		}
		
		System.out.println("------------------------------");
		//valueOf(对象的名称) ： 根据对象的名称返回相应的对象
		//注意：对象的名称严格区分大小写，如果写的不对会报，非法参数异常（IllegalArgumentException）
		Season3 spr = Season3.valueOf("SPRING");
		System.out.println(spr.getNAME());
	}
}

enum Season3 {

	// 创建四个对象
	SPRING("春天", "春眠不觉晓"),
	SUMMER("夏天", "夏天蚊子咬"),
	AUTUMN("秋天", "秋天多吃肉"),
	WINTER("冬天", "冬天就长膘");

	private final String NAME;
	private final String DESC;

	// 私有化构造器
	private Season3(String name,String desc){
		this.NAME = name;
		this.DESC = desc;
	}

	public String getNAME() {
		return NAME;
	}

	public String getDESC() {
		return DESC;
	}

}