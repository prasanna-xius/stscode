package com.myscope.demo.restapi;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicationBean {
	
	
	@JsonProperty("medicationname")
	private String medicationname;
	
	public String getMedicationname() {
		return medicationname;
	}

	public void setMedicationname(String medicationname) {
		this.medicationname = medicationname;
	}

	public String getHow_often_taken() {
		return how_often_taken;
	}

	public void setHow_often_taken(String how_often_taken) {
		this.how_often_taken = how_often_taken;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getMedication_id() {
		return medication_id;
	}

	public void setMedication_id(int medication_id) {
		this.medication_id = medication_id;
	}

	public String getFormulation() {
		return formulation;
	}

	public void setFormulation(String formulation) {
		this.formulation = formulation;
	}

	public String getDoseunit() {
		return doseunit;
	}

	public void setDoseunit(String doseunit) {
		this.doseunit = doseunit;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getIsprescribed() {
		return isprescribed;
	}

	public void setIsprescribed(String isprescribed) {
		this.isprescribed = isprescribed;
	}

	public String getMedicationnotes() {
		return medicationnotes;
	}

	public void setMedicationnotes(String medicationnotes) {
		this.medicationnotes = medicationnotes;
	}

	@JsonProperty("how_often_taken")
	private String how_often_taken;
	
	@JsonProperty("strength")
	private String strength;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	@JsonProperty("startdate")
	private String startdate;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	@JsonProperty("enddate")
	private String enddate;
	
	@JsonProperty("mobile_no")
	private String mobile_no ;
	
	@JsonProperty("medication_id")
	private int medication_id;
	
	@JsonProperty("formulation")
	private String formulation;
	
	
	@JsonProperty("doseunit")
	private String doseunit;
	
	@JsonProperty("reason")
	private String reason;
	
	@JsonProperty("isprescribed")
	private String isprescribed;

	@JsonProperty("medicationnotes")
	private String medicationnotes;
	
	@JsonProperty("medication_saved_on")
	private String medication_saved_on;

	public String getMedication_saved_on() {
		return medication_saved_on;
	}

	public void setMedication_saved_on(String medication_saved_on) {
		this.medication_saved_on = medication_saved_on;
	}

	public String getMedication_updated_on() {
		return medication_updated_on;
	}

	public void setMedication_updated_on(String medication_updated_on) {
		this.medication_updated_on = medication_updated_on;
	}

	@JsonProperty("medication_updated_on")
	private String medication_updated_on;
}
