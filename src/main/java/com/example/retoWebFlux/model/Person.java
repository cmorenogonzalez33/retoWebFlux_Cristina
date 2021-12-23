package com.example.retoWebFlux.model;

public class Person {
	private String firsName;
	private String lastName;
	private Integer age;
	
	
	
	public Person(String firsName, String lastName, Integer age) {
		super();
		this.firsName = firsName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firsName=" + firsName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
