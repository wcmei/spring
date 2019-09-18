package com.study.spring5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring5.Student;

public class MyTest5 {

	public static void main(String[] args) {
		// 加载配置文件，创建容器
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_5.xml");
		// 从容器中获取对象
		Student student1 = (Student) ac.getBean("student1");
		Student student2 = (Student) ac.getBean("student2");
		System.out.println(student1);
		System.out.println(student2);
	}
}
