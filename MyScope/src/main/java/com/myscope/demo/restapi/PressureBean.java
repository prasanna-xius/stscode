package com.myscope.demo.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PressureBean {

	//Blood Pressure
	
//	

		@JsonProperty("date_of_pressure")
		private String date_of_pressure;
		
		@JsonProperty("systolic")
		private String systolic;
		
		@JsonProperty("diastrlic")
		private String diastrlic;
		
		@JsonProperty("pulse")
		private String pulse;
		
		public String getDate_of_pressure() {
			return date_of_pressure;
		}

		public void setDate_of_pressure(String date_of_pressure) {
			this.date_of_pressure = date_of_pressure;
		}

		public String getSystolic() {
			return systolic;
		}

		public void setSystolic(String systolic) {
			this.systolic = systolic;
		}

		public String getDiastrlic() {
			return diastrlic;
		}

		public void setDiastrlic(String diastrlic) {
			this.diastrlic = diastrlic;
		}

		public String getPulse() {
			return pulse;
		}

		public void setPulse(String pulse) {
			this.pulse = pulse;
		}

		public String getHeart_rate() {
			return heart_rate;
		}

		public void setHeart_rate(String heart_rate) {
			this.heart_rate = heart_rate;
		}

		public String getPressure_notes() {
			return pressure_notes;
		}

		public void setPressure_notes(String pressure_notes) {
			this.pressure_notes = pressure_notes;
		}

		public int getPressure_id() {
			return pressure_id;
		}

		public void setPressure_id(int pressure_id) {
			this.pressure_id = pressure_id;
		}

		@JsonProperty("heart_rate")
		private String heart_rate;
		
		@JsonProperty("irregular_heart_beat")
		private String irregular_heart_beat;
		
		public String getIrregular_heart_beat() {
			return irregular_heart_beat;
		}

		public void setIrregular_heart_beat(String irregular_heart_beat) {
			this.irregular_heart_beat = irregular_heart_beat;
		}

		@JsonProperty("pressure_notes")
		private String pressure_notes;
		
		@JsonProperty("pressure_id")
		private int pressure_id;

		@JsonProperty("pressure_save_on")
		private String pressure_save_on;
		
		@JsonProperty("pressure_update_on")
		private String pressure_update_on;

		@JsonProperty("mobile_no")
		private String mobile_no;
		
		public String getMobile_no() {
			return mobile_no;
		}

		public void setMobile_no(String mobile_no) {
			this.mobile_no = mobile_no;
		}

		public String getPressure_save_on() {
			return pressure_save_on;
		}

		public void setPressure_save_on(String pressure_save_on) {
			this.pressure_save_on = pressure_save_on;
		}

		public String getPressure_update_on() {
			return pressure_update_on;
		}

		public void setPressure_update_on(String pressure_update_on) {
			this.pressure_update_on = pressure_update_on;
		}
}
