package com.study.spring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	public static void main(String[] args) {
		
		// 加载配置文件，创建容器
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_2.xml");
		// 从容器中获取对象
		Student student = (Student) ac.getBean("student");
		System.out.println(student);
	}
}
