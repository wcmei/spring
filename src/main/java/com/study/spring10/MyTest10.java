package com.study.spring10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring10.Student;

public class MyTest10 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_10.xml");

		Student stu = (Student) ac.getBean("myProxy");
		stu.method1();
		stu.method2();
		stu.method3();
		
		/**
		 * 	console 
		 * 	执行前置通知方法 
		 * 	执行环绕通知：目标方法执行之前 
		 * 	method1()方法执行 
		 * 	执行环绕通知：目标方法执行之后
		 * 	执行后置通知方法,returnValue:abc 
		 * 	执行前置通知方法 
		 * 	执行环绕通知：目标方法执行之前 
		 * 	method2()方法执行
		 * 	执行环绕通知：目标方法执行之后 
		 * 	执行后置通知方法,returnValue:abc 
		 * 	执行前置通知方法 
		 * 	执行环绕通知：目标方法执行之前
		 * 	method3()方法执行 
		 * 	执行环绕通知：目标方法执行之后 
		 * 	执行后置通知方法,returnValue:abc
		 * 
		 */
	}

}
