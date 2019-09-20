package com.study.spring15;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class MyAspect {

	public void before(JoinPoint jp) {
		System.out.println("执行前置通知方法,jp: " + jp);
	}

	public void afterReturning(Object result) {
		System.out.println("执行后置通知方法,result: " + result);
	}

	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("执行环绕通知方法,目标方法执行之前");
		Object result = pjp.proceed();
		System.out.println("执行环绕通知方法,目标方法执行之后");
		return result;
	}
	
	public void afterThrowing(Exception ex) {
		System.out.println("执行异常通知方法,ex: " + ex.getMessage());
	}
	
	public void after() {
		System.out.println("执行最终通知方法");
	}
	
	
}
