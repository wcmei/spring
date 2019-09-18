package com.study.spring7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	@Value("小万")
	private String name;
	@Value("22")
	private int age;
	
//	@Autowired
//	@Qualifier("school")	// 联合使用是根据名称注入
	
//	@Resource(name = "school")   //javax提供的根据名称注入
	
	@Autowired	// 单独使用是根据类型注入
	private School school;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, School school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getAge() {
		return age;
	}

	public final void setAge(int age) {
		this.age = age;
	}

	public final School getSchool() {
		return school;
	}

	public final void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}

}
