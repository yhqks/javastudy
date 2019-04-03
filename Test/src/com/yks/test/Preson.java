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
	public void fuck(String name) {
		System.out.println(name);
		
	}
	
	public int legth(String str) {
		
		return str.length();
	}
	private Preson (String name) {
		this.name=name;
	}
	 public Preson() {super();}
	 public static void main(String[] args) {
		Preson p=new Preson("yks",15);
	}

}
