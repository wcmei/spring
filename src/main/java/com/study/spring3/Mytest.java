package com.study.spring3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring3.Student;

public class Mytest {
	public static void main(String[] args) {

		// 加载配置文件，创建容器
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_3.xml");
		// 从容器中获取对象
		Student student = (Student) ac.getBean("student");
		System.out.println(student);
	}
}
