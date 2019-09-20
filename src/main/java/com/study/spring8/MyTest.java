package com.study.spring8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_8.xml");
		Student student = (Student) ac.getBean("student");
		student.method1();
		/**
		 * 在不使用close的方法情况下，step9=====执行DisposableBean的destroy方法
		 * 和step10=====执行destroyMethod方法，不会执行。
		 */
		ac.close();

		/**
		 * console： 
		 * step1=====执行BeanNameAware的setBeanName方法，name:student
		 * step2=====执行BeanFactoryAware的setBeanFactory方法，beanFactory：null
		 * step3=====执行ApplicationContextAware的setApplicationContext方法，applicationContext：org.springframework.context.support.ClassPathXmlApplicationContext@7eda2dbb, started on Fri Sep 20 09:54:27 CST 2019
		 * step4=====postProcessBeforeInitialization
		 * step5=====执行InitializingBean的afterPropertiesSet方法
		 * step6=====执行initMethod方法
		 * step7=====postProcessAfterInitialization 
		 * step8=====method1方法执行
		 * step9=====执行DisposableBean的destroy方法 
		 * step10=====执行destroyMethod方法
		 */

	}

}
