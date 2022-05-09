package com.microservice.studentinfo.model;

public class StudentInfo {

	private int id;
	private String index;
	private String adress;
	private String email;
	private String phoneNumber;
	private String yearOfStudy;
	private String departmentOfStudy;
	
	public StudentInfo() {}
	
	public StudentInfo(int id, String index, String adress, String email, String phoneNumber, String yearOfStudy,
			String departmentOfStudy) {
		super();
		this.id = id;
		this.index = index;
		this.adress = adress;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.yearOfStudy = yearOfStudy;
		this.departmentOfStudy = departmentOfStudy;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getYearOfStudy() {
		return yearOfStudy;
	}
	public void setYearOfStudy(String yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	public String getDepartmentOfStudy() {
		return departmentOfStudy;
	}
	public void setDepartmentOfStudy(String departmentOfStudy) {
		this.departmentOfStudy = departmentOfStudy;
	}
	
}
