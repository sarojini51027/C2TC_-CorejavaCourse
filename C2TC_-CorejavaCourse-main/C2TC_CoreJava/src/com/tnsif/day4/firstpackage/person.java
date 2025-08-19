package com.tnsif.day4.firstpackage;

public class person {
	private String personName;
	private int personAge;
	private String personCity;
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonCity() {
		return personCity;
	}

	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}

	public person(String string, String string2, String string3, int i) {
		System.out.println("Default Constructor");
	}
	
	public person(String personName, int personAge, String personCity){
		System.out.println("Parameterized Constructor");
		this.personName = personName;
		this.personAge = personAge;
		this.personCity = personCity;
	}
	
	
}

