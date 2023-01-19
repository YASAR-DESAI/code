package com.mypackage;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Customer {
	
	private String name;
	private int age;
	@Id
	@SequenceGenerator(
			name= "customer_id_sequence",
			sequenceName= "customer_id_sequence" )
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator= "customer_id_sequence")
	private int id;
	
	public Customer() {
		
	}
	
	public Customer(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
