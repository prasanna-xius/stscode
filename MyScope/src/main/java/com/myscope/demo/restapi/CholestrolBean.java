package com.myscope.demo.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CholestrolBean {

	@JsonProperty("mobile_no")
	private String mobile_no;
	
	// Cholestrol

				@JsonProperty("ldl")
				private String ldl;

				@JsonProperty("date_of_cholestrol")
				private String date_of_cholestrol;
				
				@JsonProperty("hdl")
				private String hdl;
				
				@JsonProperty("trigly")
				private String trigly;
				
				@JsonProperty("total_cholestrol")
				private String total_cholestrol;
				
				public String getLdl() {
					return ldl;
				}

				public void setLdl(String ldl) {
					this.ldl = ldl;
				}

				public String getDate_of_cholestrol() {
					return date_of_cholestrol;
				}

				public void setDate_of_cholestrol(String date_of_cholestrol) {
					this.date_of_cholestrol = date_of_cholestrol;
				}

				public String getHdl() {
					return hdl;
				}

				public void setHdl(String hdl) {
					this.hdl = hdl;
				}

				public String getTrigly() {
					return trigly;
				}

				public void setTrigly(String trigly) {
					this.trigly = trigly;
				}

				public String getTotal_cholestrol() {
					return total_cholestrol;
				}

				public void setTotal_cholestrol(String total_cholestrol) {
					this.total_cholestrol = total_cholestrol;
				}

				public String getOther_test() {
					return other_test;
				}

				public void setOther_test(String other_test) {
					this.other_test = other_test;
				}

				public String getCholestrol_notes() {
					return cholestrol_notes;
				}

				public void setCholestrol_notes(String cholestrol_notes) {
					this.cholestrol_notes = cholestrol_notes;
				}

				public int getCholestrol_id() {
					return cholestrol_id;
				}

				public void setCholestrol_id(int cholestrol_id) {
					this.cholestrol_id = cholestrol_id;
				}

				@JsonProperty("other_test")
				private String other_test;
				
				@JsonProperty("cholestrol_notes")
				private String cholestrol_notes;
				
				@JsonProperty("cholestrol_id")
				private int cholestrol_id;
				
				@JsonProperty("cholestrol_save_on")
				private String cholestrol_save_on;
				
				@JsonProperty("cholestrol_update_on")
				private String cholestrol_update_on;
				
				public String getCholestrol_save_on() {
					return cholestrol_save_on;
				}

				public void setCholestrol_save_on(String cholestrol_save_on) {
					this.cholestrol_save_on = cholestrol_save_on;
				}

				public String getCholestrol_update_on() {
					return cholestrol_update_on;
				}

				public void setCholestrol_update_on(String cholestrol_update_on) {
					this.cholestrol_update_on = cholestrol_update_on;
				}

				public String getMobile_no() {
					return mobile_no;
				}

				public void setMobile_no(String mobile_no) {
					this.mobile_no = mobile_no;
				}
}
