package com.atguigu.java4;

/*
 * 面向对象的三大特性之 ： 多态性 - 有了继承以后就可以考虑多态性
 * 
 * 多态性： 一种事物的多种形态
 * 
 * 多态性的体现：
 * 			广义上 ：①方法的重载和重写   ②子类对象的多态性
 * 			狭义上：①子类对象的多态性
 * 
 * 子类对象的多态性：父类的引用指向子类的对象
 * 
 * 多态性的前提：①要有继承性  ②要有方法的重写
 *  
 * 注意：属性没有多态性
 */
public class Test {

	public static void main(String[] args) {
		
		//本态
//		Women women = new Women();
//		women.run();
		
		//子类对象多态性
		Person p = new Women();
		//虚拟方法调用 ：（编译看左边，运行看右边）
		p.say();
		//不能调用子类特有的方法
		//p.shopping(); //编译不通过：因为编译看左边，Person中没有shopping的方法
		
		//多态性的前提
		//①要有继承性  ②要有方法的重写
		
		//思考？属性有没有多态 性 - 属性没有多态性
		System.out.println(p.name);
		
		//思考？如何调用子类独有的属性和方法。
		/*
		 * 向下转型：（强转类型）
		 */
		Women w = (Women)p;
		w.shopping();
		System.out.println(w.isShopping);
		
		System.out.println("--------------------");
		
		Person p2 = new Man();
		p2.say();
		/*
		 * 向下转型可能会有风险 ：ClassCastException
		 */
		//Women w2 = (Women)p2;
//		w2.shopping();
		
		/*
		 *  a instanceof A : a对象是否是A类的类型的实例。如果是返回true,否则返回false
		 *  
		 *  a instanceof A 和  a instanceof B如果都为true, 说明A和B是子父类关系
		 */
		if(p2 instanceof Women){
			System.out.println("小姐姐你好啊！！！");
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
		
		System.out.println("--------------------------------");
		
		Creature c = new Women();
		Person per = (Person)c;
		per.say();
		c.say();
		
		System.out.println("------------------------------");
		/*
		 * 运行错误 ： String和Women没有任何子父类关系
		Object obj = new String("aaa");
		Women w3 = (Women)obj;
		w3.shopping();
		*/
		
	}
}
