package com.yks.test;

public class Preson {
	
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Preson [age=" + age + ", name=" + name + "]";
	}
	public Preson(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	

}
