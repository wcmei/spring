package com.study.spring15;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_15.xml");

		Student stu = (Student) ac.getBean("student");
		// 测试发现，对所有的Student都进行了切入
		Student stu2 = (Student) ac.getBean("student2");
		stu.doFirst();
		stu.doSecond();
		stu2.doFirst();
		stu2.doSecond();
		stu.doThird();

		stu2.doThird();

		/*
		 * 	console 
		 * 	执行前置通知方法,jp: execution(String com.study.spring15.Student.doFirst())
		 * 	执行doFirst()方法 
		 * 	执行doSecond()方法 执行后置通知方法,,result: doSecond()返回值 
		 * 	执行前置通知方法,jp:execution(String com.study.spring15.Student.doFirst()) 
		 * 	执行doFirst()方法
		 * 	执行doSecond()方法 
		 * 	执行后置通知方法,result: doSecond()返回值 
		 * 	执行环绕通知方法,目标方法执行之前
		 * 	执行doThird()方法 
		 * 	执行最终通知方法 
		 * 	执行异常通知方法,ex: / by zero Exception in thread "main" java.lang.ArithmeticException: / by zero
		 * 
		 */

	}

}
