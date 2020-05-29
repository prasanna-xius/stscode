package com.myscope.demo.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientProfileBean {
	
	@JsonProperty("mobile_no")
	private String mobile_no;

	@JsonProperty("first_name")
	private String first_name;
	
	@JsonProperty("last_name")
	private String last_name;
	
	@JsonProperty("gender")
	private String gender;
	
	@JsonProperty("dob")
	private String dob;

	@JsonProperty("age")
	private String age;

	@JsonProperty("weight")
	private String weight;
	
	@JsonProperty("height")
	private String height;
	
	@JsonProperty("bmi")
	private String bmi;
	
	@JsonProperty("blood_group")
	private String blood_group;
	
	@JsonProperty("doctor_name")
	private String doctor_name;

	@JsonProperty("pharmacist_name")
	private String pharmacist_name;
	
	@JsonProperty("languages_known")
	private String languages_known;
	
	@JsonProperty("education")
	private String education;
	
	@JsonProperty("marrital_status")
	private String marrital_status;
	
	@JsonProperty("family_income")
	private String family_income;
	
	@JsonProperty("email")
	private String email;
	
	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getBmi() {
		return bmi;
	}

	public void setBmi(String bmi) {
		this.bmi = bmi;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getPharmacist_name() {
		return pharmacist_name;
	}

	public void setPharmacist_name(String pharmacist_name) {
		this.pharmacist_name = pharmacist_name;
	}

	public String getLanguages_known() {
		return languages_known;
	}

	public void setLanguages_known(String languages_known) {
		this.languages_known = languages_known;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getMarrital_status() {
		return marrital_status;
	}

	public void setMarrital_status(String marrital_status) {
		this.marrital_status = marrital_status;
	}

	public String getFamily_income() {
		return family_income;
	}

	public void setFamily_income(String family_income) {
		this.family_income = family_income;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
