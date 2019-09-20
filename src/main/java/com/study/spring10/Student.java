package com.study.spring10;

public class Student {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String method1() {
		System.out.println("method1()方法执行");
//		// 测试异常通知
//		int i = 3/0;
		return "method1方法返回值";
	}

	public String method2() {
		System.out.println("method2()方法执行");
		return "method2方法返回值";
	}

	public String method3() {
		System.out.println("method3()方法执行");
		return "method3方法返回值";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
