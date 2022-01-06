package com.java.s3.member;

public class Member {
	
	private String name;
	private String email;
	private double weight;
	private double height;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//setter, getter
	//set변수명, get변수명
	
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	
//	public String getEmail() {
//		return this.email;
//	}
//	
//	public void setHeight(double height) {
//		this.height = 170.0;
//		if(height>0 && height<300.0) {
//			this.height = height;
//		}
//		
//	}
//	
//	public double getHeight() {
//		return this.height;
//	}
//	
//	public void setAge(int age) {
//		this.age = 20;
//		if(age>0 && age<200) {
//			this.age = age;
//		}
//		
//	}
//	
//	public int getAge() {
//		return this.age;
//	}

}
