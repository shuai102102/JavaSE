package com.atguigu.java2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //用在哪些结构上
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnn2 {

	String name() default "aaa";
}
