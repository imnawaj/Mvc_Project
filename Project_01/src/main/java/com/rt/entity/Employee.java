package com.rt.entity;

public class Employee {
	
	private int id;
	private String fname;
	private String lname;
	private String birthdate;
	private String gender;
	private String email;
	private String number;
	private String country;
	
	public Employee(){}

	public Employee(int id, String fname, String lname, String birthdate, String gender, String email, String number,
			String country) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.birthdate = birthdate;
		this.gender = gender;
		this.email = email;
		this.number = number;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
