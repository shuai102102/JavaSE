package com.atguigu.java;

//import java.util.*;

//import static java.util.;


/*
 * 
 * 包 ： java为了方便对项目中的类进行统一管理，从而提出了包的概念
 * 
 * 说明：
 * 		1.相同的包下类名不能一样。
 *      2.包名所有的字母都是小写，每一个点代表一层目录
 *      3.包名 ： 通常将公司的域名反过来.项目名.模块名
 *      4.必须放在源文件的首行
 * 
 * 
 * import:导包 - import语句告诉编译器到哪里去寻找类。
 * 
 * 说明：
 * 		1.在源文件中使用import显式的导入指定包下的类或接口
		2.声明在包的声明和类的声明之间。
		3.如果需要导入多个类或接口，那么就并列显式多个import语句即可
		4.举例：可以使用java.util.*的方式，一次性导入util包下所有的类或接口。
		5.如果导入的类或接口是java.lang包下的，或者是当前包下的，则可以省略此import语句。
		6.如果在代码中使用不同包下的同名的类。那么就需要使用类的全类名的方式指明调用的是哪个类。
		7.import static组合的使用：调用指定类或接口下的静态的属性或方法
		8.如果已经导入java.a包下的类。那么如果需要使用a包的子包下的类的话，仍然需要导入。

 */


import java.util.*;
import java.util.Date;
import com.atguigu.java2.*;
import com.atguigu.java2.dao.*;

//了解即可
import static java.lang.System.out;


public class PackageImportTest {

	public static void main(String[] args) {
		/*
		Person p = new Person();
		p.say();
		
		com.atguigu.java2.Person person = new com.atguigu.java2.Person();
		person.say();
		
		out.println("aaa");
		*/
		
		new Animal();
		new Student();
	}
	
}
