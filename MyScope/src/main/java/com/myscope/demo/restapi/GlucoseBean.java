package com.myscope.demo.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GlucoseBean {

	//Blood Glucose
	@JsonProperty("mobile_no")
	private String mobile_no;

	@JsonProperty("date_of_test")
	private String date_of_test;
	
	@JsonProperty("test")
	private String test;
	
	@JsonProperty("test_result")
	private String test_result;
	
	@JsonProperty("glucose_notes")
	private String glucose_notes;
	
	@JsonProperty("glucose_save_on")
	private String glucose_save_on;
	
	@JsonProperty("glucose_update_on")
	private String glucose_update_on;
	
	@JsonProperty("glucose_id")
	private int glucose_id;

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getDate_of_test() {
		return date_of_test;
	}

	public void setDate_of_test(String date_of_test) {
		this.date_of_test = date_of_test;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getTest_result() {
		return test_result;
	}

	public void setTest_result(String test_result) {
		this.test_result = test_result;
	}

	public String getGlucose_save_on() {
		return glucose_save_on;
	}

	public void setGlucose_save_on(String glucose_save_on) {
		this.glucose_save_on = glucose_save_on;
	}

	public String getGlucose_update_on() {
		return glucose_update_on;
	}

	public void setGlucose_update_on(String glucose_update_on) {
		this.glucose_update_on = glucose_update_on;
	}

	public String getGlucose_notes() {
		return glucose_notes;
	}

	public void setGlucose_notes(String glucose_notes) {
		this.glucose_notes = glucose_notes;
	}

	public int getGlucose_id() {
		return glucose_id;
	}

	public void setGlucose_id(int glucose_id) {
		this.glucose_id = glucose_id;
	}
	

	
	
}
