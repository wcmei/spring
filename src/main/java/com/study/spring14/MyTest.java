package com.study.spring14;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_14.xml");

		Student stu = (Student) ac.getBean("student");
		stu.doFirst();
		stu.doSecond();
		stu.doThird();

		/*
		 * 	console 
		 * 	执行前置通知方法,jp: execution(String com.study.spring14.Student.doFirst())
		 * 	执行doFirst()方法 
		 * 	执行doSecond()方法 
		 * 	执行后置通知方法,,result: doSecond()返回值
		 * 	执行环绕通知方法,目标方法执行之前 
		 * 	执行doThird()方法 
		 * 	执行最终通知方法 执行异常通知方法
		 * 	ex: / by zero Exception in thread "main" java.lang.ArithmeticException: / by zero
		 * 
		 */

	}

}
