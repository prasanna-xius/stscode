package com.myscope.demo.restapi;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class MyScopeBean {
	
	
	


	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReaction() {
		return reaction;
	}
	public void setReaction(String reaction) {
		this.reaction = reaction;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSpnrdata() {
		return spnrdata;
	}
	public void setSpnrdata(String spnrdata) {
		this.spnrdata = spnrdata;
	}
	
	
	
	
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}




	@JsonProperty("allergy_id")
	int allergy_id ;
	
	public int getAllergy_id() {
		return allergy_id;
	}
	public void setAllergy_id(int allergy_id) {
		this.allergy_id = allergy_id;
	}




	@JsonProperty("name")
	private String name;
	
	@JsonProperty("reaction")
	private String reaction;
	
	@JsonProperty("treatment")
	private String treatment;
	
	@JsonProperty("notes")
	private String notes;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	@JsonProperty("date")
	private String date;
	
	@JsonProperty("spnrdata")
	private String spnrdata;
	

	@JsonProperty("allergy_saved_on")
	private String allergy_saved_on;
	
	public String getAllergy_saved_on() {
		return allergy_saved_on;
	}
	public void setAllergy_saved_on(String allergy_saved_on) {
		this.allergy_saved_on = allergy_saved_on;
	}
	public String getAllergy_updated_on() {
		return allergy_updated_on;
	}
	public void setAllergy_updated_on(String allergy_updated_on) {
		this.allergy_updated_on = allergy_updated_on;
	}




	@JsonProperty("allergy_updated_on")
	private String allergy_updated_on;
	


	
	
	
}
