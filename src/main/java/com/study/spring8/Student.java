package com.study.spring8;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean{
	private String name;
	private int age;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String method1() {
		System.out.println("step8=====method1方法执行");
		return "this is method1";
	}
	
	public void initMethod() {
		System.out.println("step6=====执行initMethod方法");
	}
	
	public void destroyMethod() {
		System.out.println("step10=====执行destroyMethod方法");
	}
	

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
		System.out.println("执行setName方法");
	}

	public final int getAge() {
		return age;
	}

	public final void setAge(int age) {
		this.age = age;
		System.out.println("执行setAge方法");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("step1=====执行BeanNameAware的setBeanName方法，name:" + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("step2=====执行BeanFactoryAware的setBeanFactory方法，beanFactory：" + name);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("step3=====执行ApplicationContextAware的setApplicationContext方法，applicationContext：" + applicationContext);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("step5=====执行InitializingBean的afterPropertiesSet方法：");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("step9=====执行DisposableBean的destroy方法");
	}

}
