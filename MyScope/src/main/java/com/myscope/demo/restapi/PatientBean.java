package com.myscope.demo.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientBean {
	
	@JsonProperty("first_name")
	private String first_name;
	
	@JsonProperty("last_name")
	private String last_name;
	
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("email")
	private String email;
//	
//	@JsonProperty("date")
//	private String date;
	
//	// Patient Disease history - Medical history
//	@JsonProperty("patient_id")
//	private String patient_id;
//	
//	@JsonProperty("known_condition")
//	private String known_condition;
//	
//	@JsonProperty("disease_status")
//	private String disease_status;
//	
//	@JsonProperty("disease_duration")
//	private String disease_duration;
//	
//	@JsonProperty("when_started")
//	private String when_started;
//	
//	@JsonProperty("when_ended")
//	private String when_ended;
//	
//	@JsonProperty("disease_note")
//	private String disease_note;
//
//	@JsonProperty("module_name")
//	private String module_name;
//
//	
//	
//	//Implementing getters and setters
//	
//	
//	public String getKnown_condition() {
//		return known_condition;
//	}
//	public void setKnown_condition(String known_condition) {
//		this.known_condition = known_condition;
//	}
//	public String getDisease_status() {
//		return disease_status;
//	}
//	public void setDisease_status(String disease_status) {
//		this.disease_status = disease_status;
//	}
//	public String getDisease_duration() {
//		return disease_duration;
//	}
//	public void setDisease_duration(String disease_duration) {
//		this.disease_duration = disease_duration;
//	}
//	public String getWhen_started() {
//		return when_started;
//	}
//	public void setWhen_started(String when_started) {
//		this.when_started = when_started;
//	}
//	public String getWhen_ended() {
//		return when_ended;
//	}
//	public void setWhen_ended(String when_ended) {
//		this.when_ended = when_ended;
//	}
//	public String getDisease_note() {
//		return disease_note;
//	}
//	public void setDisease_note(String disease_note) {
//		this.disease_note = disease_note;
//	}
//		public String getPatient_id() {
//		return patient_id;
//	}
//	public void setPatient_id(String patient_id) {
//		this.patient_id = patient_id;
//	}
//	
//	public String getModule_name() {
//		return module_name;
//	}
//	public void setModule_name(String module_name) {
//		this.module_name = module_name;
//	}
//	
//	

	
	//Registration details
	
	
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
	public String getMobile() {
		return mobile_no;
	}
	public void setMobile(String string) {
		this.mobile_no = string;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
