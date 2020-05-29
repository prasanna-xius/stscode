package com.myscope.demo.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrescriptionDurgBean {

	@JsonProperty("formulation")
	private String formulation;

	@JsonProperty("drug_name")
	private String drug_name;
	
	@JsonProperty("brand_name")
	private String brand_name;
	
	@JsonProperty("dose_strength")
	private String dose_strength;
	
	@JsonProperty("dose_unit")
	private String dose_unit;
	
	@JsonProperty("how_often_taken")
	private String how_often_taken;
	
	@JsonProperty("start_date")
	private String start_date;
	
	@JsonProperty("stop_date")
	private String stop_date;
	
	@JsonProperty("drug_id")
	private int drug_id;
	
	@JsonProperty("prescription_id")
	private int prescription_id;
	
	@JsonProperty("time")
	private String time;
	
	@JsonProperty("drug_saved_on")
	private String drug_saved_on;
	
	

//	public int getDrug_id() {
//		return drug_id;
//	}

	@JsonProperty("drug_updated_on")
	private String drug_updated_on;
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

//	public int getDrug_id() {
//		return drug_id;
//	}

	public String getFormulation() {
		return formulation;
	}

	public void setFormulation(String formulation) {
		this.formulation = formulation;
	}

	public String getDrug_name() {
		return drug_name;
	}

	public void setDrug_name(String drug_name) {
		this.drug_name = drug_name;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getDose_strength() {
		return dose_strength;
	}

	public void setDose_strength(String dose_strength) {
		this.dose_strength = dose_strength;
	}

	public String getDose_unit() {
		return dose_unit;
	}

	public void setDose_unit(String dose_unit) {
		this.dose_unit = dose_unit;
	}

	public String getHow_often_taken() {
		return how_often_taken;
	}

	public void setHow_often_taken(String how_often_taken) {
		this.how_often_taken = how_often_taken;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getStop_date() {
		return stop_date;
	}

	public void setStop_date(String stop_date) {
		this.stop_date = stop_date;
	}
	public int getdrug_id() {
		return drug_id;
	}

	public void setDrug_id(int drug_id) {
		this.drug_id = drug_id;
	}
	public int getPrescription_id() {
		return prescription_id;
	}

	public void setPrescription_id(int prescription_id) {
		this.prescription_id = prescription_id;
	}
	public String getDrug_saved_on() {
		return drug_saved_on;
	}

	public void setDrug_saved_on(String drug_saved_on) {
		this.drug_saved_on = drug_saved_on;
	}

	public String getDrug_updated_on() {
		return drug_updated_on;
	}

	public void setDrug_updated_on(String drug_updated_on) {
		this.drug_updated_on = drug_updated_on;
	}
}
