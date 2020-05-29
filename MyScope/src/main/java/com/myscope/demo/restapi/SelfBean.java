package com.myscope.demo.restapi;


import com.fasterxml.jackson.annotation.JsonProperty;

public class SelfBean {
	
	
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
			
//			@JsonProperty("glucose_id")
//			private int glucose_id;

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

			public String getGlucose_notes() {
				return glucose_notes;
			}

			public void setGlucose_notes(String glucose_notes) {
				this.glucose_notes = glucose_notes;
			}

//			public int getGlucose_id() {
//				return glucose_id;
//			}
//
//			public void setGlucose_id(int glucose_id) {
//				this.glucose_id = glucose_id;
//			}
			
			
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

//			public int getPressure_id() {
//				return pressure_id;
//			}
//
//			public void setPressure_id(int pressure_id) {
//				this.pressure_id = pressure_id;
//			}

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
			
//			@JsonProperty("pressure_id")
//			private int pressure_id;


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

//			public int getCholestrol_id() {
//				return cholestrol_id;
//			}
//
//			public void setCholestrol_id(int cholestrol_id) {
//				this.cholestrol_id = cholestrol_id;
//			}

			@JsonProperty("diastrlic")
			private String other_test;
			
			@JsonProperty("cholestrol_notes")
			private String cholestrol_notes;
			
//			@JsonProperty("cholestrol_id")
//			private int cholestrol_id;
			
			// Bmi
			
			@JsonProperty("date_of_bmi")
			private String date_of_bmi;
			
						@JsonProperty("weight")
						private String weight;
								
						@JsonProperty("height")
						private String height;
						
						public String getDate_of_bmi() {
							return date_of_bmi;
						}

						public void setDate_of_bmi(String date_of_bmi) {
							this.date_of_bmi = date_of_bmi;
						}

						public String getWeight() {
							return weight;
						}

						public void setWeight(String weight) {
							this.weight = weight;
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

//						public int getBmi_id() {
//							return bmi_id;
//						}
//
//						public void setBmi_id(int bmi_id) {
//							this.bmi_id = bmi_id;
//						}

						@JsonProperty("bmi")
						private String bmi;
						
						@JsonProperty("bmi_notes")
						private String bmi_notes;
						
//						@JsonProperty("bmi_id")
//						private int bmi_id;

}
