package com.mypackage;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	
	private String name;
	private int age;
	private String nationality;
	private HelloMessage message;	

	public Person(){}
	
	public Person(String name, int age, String nationality, HelloMessage message) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.message = message;
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
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public HelloMessage getMessage() {
		return message;
	}
	
	@Autowired
	public void setMessage(HelloMessage message) {
		this.message = message;
	}
	
	
	

}
