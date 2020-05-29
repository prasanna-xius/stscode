package com.myscope.demo.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BmiBean {

	// Bmi
	
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	

				@JsonProperty("weight")
				private String weight;

				@JsonProperty("date_of_bmi")
				private String date_of_bmi;
				
				@JsonProperty("height")
				private String height;
				
				
				@JsonProperty("bmi")
				private String bmi;
				
				@JsonProperty("bmi_notes")
				private String bmi_notes;
	
				@JsonProperty("bmi_save_on")
				private String bmi_save_on;
				
				@JsonProperty("bmi_id")
				private int bmi_id;
				
				public String getMobile_no() {
					return mobile_no;
				}
				

				public void setMobile_no(String mobile_no) {
					this.mobile_no = mobile_no;
				}

				public String getWeight() {
					return weight;
				}

				public void setWeight(String weight) {
					this.weight = weight;
				}

				public String getDate_of_bmi() {
					return date_of_bmi;
				}

				public void setDate_of_bmi(String date_of_bmi) {
					this.date_of_bmi = date_of_bmi;
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

				public String getBmi_notes() {
					return bmi_notes;
				}

				public void setBmi_notes(String bmi_notes) {
					this.bmi_notes = bmi_notes;
				}

				public String getBmi_save_on() {
					return bmi_save_on;
				}

				public void setBmi_save_on(String bmi_save_on) {
					this.bmi_save_on = bmi_save_on;
				}

				

				public String getBmi_update_on() {
					return bmi_update_on;
				}

				public void setBmi_update_on(String bmi_update_on) {
					this.bmi_update_on = bmi_update_on;
				}

			

				public int getBmi_id() {
					return bmi_id;
				}

				public void setBmi_id(int bmi_id) {
					this.bmi_id = bmi_id;
				}

				@JsonProperty("bmi_update_on")
				private String bmi_update_on;
}
