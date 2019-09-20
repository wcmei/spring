package com.study.spring13;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_13.xml");

		Student stu = (Student) ac.getBean("student");
		Student stu2 = (Student) ac.getBean("student2");
		stu.method1();
		stu.method2();
		stu.method3();
		stu2.method1();
		stu2.method2();
		stu2.method3();

		/**
		 *	console 
		 * 	执行环绕通知：目标方法执行之前
		 *	method1()方法执行 
		 *	执行环绕通知：目标方法执行之后 
		 *	执行环绕通知：目标方法执行之前
		 * 	method2()方法执行 
		 * 	执行环绕通知：目标方法执行之后 
		 * 	method3()方法执行 
		 * 	method1()方法执行 
		 * 	method2()方法执行
		 * 	method3()方法执行
		 * 
		 */
	}

}
