package com.myscope.demo.restapi;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SurgeryBean {

	public String getSurgeryprovider() {
		return surgeryprovider;
	}

	public void setSurgeryprovider(String surgeryprovider) {
		this.surgeryprovider = surgeryprovider;
	}

	public String getSurgeryhospital() {
		return surgeryhospital;
	}

	public void setSurgeryhospital(String surgeryhospital) {
		this.surgeryhospital = surgeryhospital;
	}

	public String getSurgerylocation() {
		return surgerylocation;
	}

	public void setSurgerylocation(String surgerylocation) {
		this.surgerylocation = surgerylocation;
	}

	public String getSurgerynotes() {
		return surgerynotes;
	}

	public void setSurgerynotes(String surgerynotes) {
		this.surgerynotes = surgerynotes;
	}

	public String getSurgerydate() {
		return surgerydate;
	}

	public void setSurgerydate(String surgerydate) {
		this.surgerydate = surgerydate;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getSurgery_id() {
		return surgery_id;
	}

	public void setSurgery_id(int surgery_id) {
		this.surgery_id = surgery_id;
	}

	public String getSurgeryname() {
		return surgeryname;
	}

	public void setSurgeryname(String surgeryname) {
		this.surgeryname = surgeryname;
	}

	@JsonProperty("surgeryprovider")
	private String surgeryprovider;
	
	@JsonProperty("surgeryhospital")
	private String surgeryhospital;
	
	@JsonProperty("surgerylocation")
	private String surgerylocation;
	
	@JsonProperty("surgerynotes")
	private String surgerynotes;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	@JsonProperty("surgerydate")
	private String surgerydate;
	
	@JsonProperty("mobile_no")
	private String mobile_no ;
	
	@JsonProperty("surgery_id")
	private int surgery_id;
	
	@JsonProperty("surgeryname")
	private String surgeryname;
	
	@JsonProperty("surgery_saved_on")
	private String surgery_saved_on;
	
	public String getSurgery_saved_on() {
		return surgery_saved_on;
	}

	public void setSurgery_saved_on(String surgery_saved_on) {
		this.surgery_saved_on = surgery_saved_on;
	}

	public String getSurgery_updated_on() {
		return surgery_updated_on;
	}

	public void setSurgery_updated_on(String surgery_updated_on) {
		this.surgery_updated_on = surgery_updated_on;
	}

	@JsonProperty("surgery_updated_on")
	private String surgery_updated_on;
	
}
