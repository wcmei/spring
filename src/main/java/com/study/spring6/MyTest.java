package com.study.spring6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring6.Student;

public class MyTest {

	public static void main(String[] args) {
		// 加载配置文件，创建容器
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_6.xml");
		// 从容器中获取对象
		Student student1 = (Student) ac.getBean("student1");
		Student student2 = (Student) ac.getBean("student2");
		System.out.println(student1);
		System.out.println(student2);
	}

}
