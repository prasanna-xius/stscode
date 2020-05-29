package com.myscope.demo.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DiseaseBean {
	
	
	//Disease History

	@JsonProperty("known_condition")
	private String known_condition;
	
	@JsonProperty("disease_status")
	private String disease_status;
	
	@JsonProperty("disease_duration")
	private String disease_duration;
	
	@JsonProperty("when_started")
	private String when_started;
	
	@JsonProperty("when_ended")
	private String when_ended;
	
	@JsonProperty("disease_note")
	private String disease_note;
	
	@JsonProperty("disease_id")
	private int id;
	
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("disease_save_on")
	private String disease_save_on;
	
	
	@JsonProperty("disease_updated_on")
	private String disease_updated_on;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	
	
//	//Family History
//	@JsonProperty("mobile_no")
//	private String mobile_no;
//
//	@JsonProperty("family_condition")
//	private String family_condition;
//	
//	@JsonProperty("relationship")
//	private String relationship;
//	
//	@JsonProperty("family_note")
//	private String family_note;
//	
//	@JsonProperty("disease_id")
//	private int familyid;
	
	
	
	//Implementing getters and setters
	
	public String getKnown_condition() {
		return known_condition;
	}
	public void setKnown_condition(String known_condition) {
		this.known_condition = known_condition;
	}
	public String getDisease_status() {
		return disease_status;
	}
	public void setDisease_status(String disease_status) {
		this.disease_status = disease_status;
	}
	public String getDisease_duration() {
		return disease_duration;
	}
	public void setDisease_duration(String disease_duration) {
		this.disease_duration = disease_duration;
	}
	public String getWhen_started() {
		return when_started;
	}
	public void setWhen_started(String when_started) {
		this.when_started = when_started;
	}
	public String getWhen_ended() {
		return when_ended;
	}
	public void setWhen_ended(String when_ended) {
		this.when_ended = when_ended;
	}
	public String getDisease_note() {
		return disease_note;
	}
	public void setDisease_note(String disease_note) {
		this.disease_note = disease_note;
	}
	public String getDisease_save_on() {
		return disease_save_on;
	}
	public void setDisease_save_on(String disease_save_on) {
		this.disease_save_on = disease_save_on;
	}
	public String getDisease_updated_on() {
		return disease_updated_on;
	}
	public void setDisease_updated_on(String disease_updated_on) {
		this.disease_updated_on = disease_updated_on;
	}
	
//	//Family History
//	public String getMobile_no() {
//		return mobile_no;
//	}
//	public void setMobile_no(String mobile_no) {
//		this.mobile_no = mobile_no;
//	}
//	public String getFamily_condition() {
//		return family_condition;
//	}
//	public void setFamily_condition(String family_condition) {
//		this.family_condition = family_condition;
//	}
//	public String getRelationship() {
//		return relationship;
//	}
//	public void setRelationship(String relationship) {
//		this.relationship = relationship;
//	}
//	public String getFamily_note() {
//		return family_note;
//	}
//	public void setFamily_note(String family_note) {
//		this.family_note = family_note;
//	}
//	public int getFamilyid() {
//		return id;
//	}
//	public void setFamilyid(int id) {
//		this.id = id;
//	}
	
	
}
