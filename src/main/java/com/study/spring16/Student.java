package com.study.spring16;

public class Student {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String name;
	private int age;

	public Student() {
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String doFirst() {
		System.out.println("执行doFirst()方法");
		return "adcd";
	}

	public String doSecond() {
		System.out.println("执行doSecond()方法");
		return "efgh";
	}

	public void doThird() {
		System.out.println("执行doThird()方法");
		// 测试异常通知
		int i = 3 / 0;
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
