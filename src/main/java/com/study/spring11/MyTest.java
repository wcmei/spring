package com.study.spring11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_11.xml");

		Student stu = (Student) ac.getBean("myProxy");
		String s = stu.method1();
		stu.method2();
		stu.method3();
		
		/**
		 * 	console 
		 * 	执行环绕通知：目标方法执行之前 
		 * 	method1()方法执行 
		 * 	执行后置通知方法,returnValue:method1方法返回值
		 * 	执行环绕通知：目标方法执行之后 
		 * 	执行环绕通知：目标方法执行之前 
		 * 	method2()方法执行
		 * 	执行后置通知方法,returnValue:method2方法返回值 
		 * 	执行环绕通知：目标方法执行之后 
		 * 	method3()方法执行
		 */
	}

}
