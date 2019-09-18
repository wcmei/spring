package com.study.spring4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring4.Student;

public class MyTest4 {

	public static void main(String[] args) {
		// 加载配置文件，创建容器
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_4.xml");
		// 从容器中获取对象
		Student student = (Student) ac.getBean("student");
		System.out.println(student);
	}

}
