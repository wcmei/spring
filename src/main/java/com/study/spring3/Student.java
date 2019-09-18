package com.study.spring3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {
	private String name;
	private int age;
	private School school;
	private String[] array;
	private List list;
	private Map map;
	private Properties pp;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, School school, String[] array, List list, Map map, Properties pp) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
		this.array = array;
		this.list = list;
		this.map = map;
		this.pp = pp;
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

	public final String[] getArray() {
		return array;
	}

	public final void setArray(String[] array) {
		this.array = array;
	}

	public final List getList() {
		return list;
	}

	public final void setList(List list) {
		this.list = list;
	}

	public final Map getMap() {
		return map;
	}

	public final void setMap(Map map) {
		this.map = map;
	}

	public final Properties getPp() {
		return pp;
	}

	public final void setPp(Properties pp) {
		this.pp = pp;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", array=" + Arrays.toString(array) + ", list=" + list
				+ ", map=" + map + ", pp=" + pp + "]";
	}

}
