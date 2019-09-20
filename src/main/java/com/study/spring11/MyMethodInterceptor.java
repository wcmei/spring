package com.study.spring11;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("执行环绕通知：目标方法执行之前");
		// 执行目标方法
		Object result = invocation.proceed();
		System.out.println("执行环绕通知：目标方法执行之后");
		// return result
		// result是方法返回结果，在这里可以对返回结果进行判断和相应的操作，如下就是直接将返回结果设置为"abc"
		return "abc";
	}

}
