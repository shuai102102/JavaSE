package com.atguigu.java3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnn {
	
	int age() default 10;
	String name() default "小婊砸";
}
