package com.study.spring10;

import java.text.ParseException;

import org.springframework.aop.ThrowsAdvice;

// 异常通知
public class MyThrowsAdvice implements ThrowsAdvice {
	
	// 当目标方法抛出与指定类型的异常具有is-a关系的异常时，执行该方法
	// 一般我们需要自定义异常，然后在参数列表进行指定该异常
	public void afterThrowing(Exception ex) {
		System.out.println("发生Exception异常: " + ex.getMessage());
	}
	
	public void afterThrowing(ParseException ex) {
		System.out.println("发生ParseException异常: " + ex.getMessage());
	}
}
