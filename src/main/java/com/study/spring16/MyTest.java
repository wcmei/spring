package com.study.spring16;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_16.xml");

		StuDao stuDao = (StuDao) ac.getBean("stuDao");

		// 测试增加
		// stuDao.insert(new Student(1,"小万",22));

		// 测试删除
		// stuDao.delete(0);

		// 测试更新
		// stuDao.update(new Student(1,"小小小万",22));

		// 测试查询单个对象
		// System.out.println(stuDao.queryById(1));

		// 测试查询所有对象
		// System.out.println(stuDao.queryAll());

		// 测试查询单个名称
		// System.out.println(stuDao.queryNameById(1));

		// 测试查询所有名称
		// System.out.println(stuDao.queryAllNames());

	}

}
