package com.atguigu.java4;

public class Test {
	
	public static void main(String[] args) {
		
		Person p = new Women();
	
		p.say();
		
		System.out.println(p.name);
		
		Women w = (Women)p;
		w.shopping();
		System.out.println(w.isShopping);
		
		Person p2 = new Man();
		p2.say();
		
		if(p2 instanceof Women){
			System.out.println("小姐姐你好呀");
			Women w2 = (Women)p2;
			w2.shopping();
		}else{
			System.out.println("伪娘一边凉快去");
			Man man = (Man)p2;
			man.love();
		}
		
		System.out.println(p2 instanceof Man);
		System.out.println(p2 instanceof Person);
		System.out.println(p2 instanceof Creature);
		
		System.out.println("---------------------");
		
		Creature c = new Women();
		Person per =(Person)c;
		per.say();
		c.say();
		
		System.out.println("---------------------");
		
		
	}
}
