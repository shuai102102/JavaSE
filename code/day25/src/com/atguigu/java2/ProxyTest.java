package com.atguigu.java2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * 
 * 用来动态地创建 代理对象（小秘）
 */
public class ProxyTest implements InvocationHandler {
	
	
	private Object target;
	
	public Object getObject(Object target){
		this.target  = target;
		/*
		 * 第一个参数：类加载器  - 和被代理对象的类加载器保持一致
		 * 第二个参数：接口 - 被代理对象所实现的所有的接口
		 * 第三个参数：InvocationHandler的实现类的对象 - 当前的被代理对象
		 */
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				this
		);
				
	}
	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/*
		 * target :  被代理对象
		 * args : 方法的实参
		 */
		System.out.println("------代理开始了------");
		Object invoke = method.invoke(target, args);
		System.out.println("------代理结束了------");
		
		return invoke;
	}

	
}
