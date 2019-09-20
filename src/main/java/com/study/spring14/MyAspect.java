package com.study.spring14;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
/*
 * 	注意：您可以在Spring XML配置中注册aspect类，或者通过类路径扫描自动检测它们，就像任何其他Spring管理bean一样。但是，请注意，@
 * 	aspect注释对于在类路径中自动检测是不够的：为了达到这个目的，您需要添加一个单独的@component注解（
 * 	或者根据Spring的组件扫描器的规则来定义一个定制的原型注解）。
 */
public class MyAspect {

	@Before("execution(* *..Student.doFirst(..))")
	public void brfore(JoinPoint jp) {
		System.out.println("执行前置通知方法,jp: " + jp);
	}

	@AfterReturning(value = "execution(* *..Student.doSecond(..))", returning = "result")
	public void afterReturning(Object result) {
		System.out.println("执行后置通知方法,,result: " + result);
	}

	@Around(value = "execution(* *..Student.doThird(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("执行环绕通知方法,目标方法执行之前");
		Object result = pjp.proceed();
		System.out.println("执行环绕通知方法,目标方法执行之后");
		return result;
	}

	@AfterThrowing(value = "execution(* *..Student.doThird(..))", throwing = "ex")
	// UserNameException等等自定义异常自己定义后放进参数即可在发生异常时进行相应的处理
	public void afterThrowing(Exception ex) {
		System.out.println("执行异常通知方法,ex: " + ex.getMessage());
	}

//	@After(value = "execution(* *..Student.doThird(..))")
//	//UserNameException等等自定义异常自己定义后放进参数即可在发生异常时进行相应的处理
//	public void after() {
//		System.out.println("执行最终通知方法");
//	}

	// 测试定义切入点功能
	@After("doSecondPointCut()")
	// UserNameException等等自定义异常自己定义后放进参数即可在发生异常时进行相应的处理
	public void after() {
		System.out.println("执行最终通知方法");
	}

	// 定义了一个切入点，叫 doSecondPointCut()
	@Pointcut("execution(* *..Student.doThird(..))")
	public void doSecondPointCut() {
	}

}
