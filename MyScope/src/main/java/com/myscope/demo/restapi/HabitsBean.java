package com.myscope.demo.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HabitsBean {
	

	//Diet
	@JsonProperty("diet")
	private String diet;


	@JsonProperty("spl_diet_notes")
	private String spl_diet_notes;
	
	@JsonProperty("diet_saved_on")
	private String diet_saved_on;

	@JsonProperty("diet_updated_on")
	private String diet_updated_on;
	
	
	//Social History
	@JsonProperty("smoking")
	private String smoking;
	
	@JsonProperty("smoking_duration")
	private String smoking_duration;
	
	@JsonProperty("tobacco")
	private String tobacco;
	
	@JsonProperty("alcohol")
	private String alcohol;
	
	@JsonProperty("alcohol_duration")
	private String alcohol_duration;
	
	@JsonProperty("social_saved_on")
	private String social_saved_on;

	@JsonProperty("social_updated_on")
	private String social_updated_on;
	
	
	
	//Adverse Drug
	@JsonProperty("drugname")
	private String drugname;
	
	@JsonProperty("reaction")
	private String reaction;
	
	@JsonProperty("date_of_start")
	private String date_of_start;
	
	@JsonProperty("treatment_taken")
	private String treatment_taken;
	
	@JsonProperty("adverse_id")
	private int adverse_id;
	
	@JsonProperty("adverse_save_on")
	private String adverse_save_on;

	@JsonProperty("adverse_updated_on")
	private String adverse_updated_on;
	
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	
	//Services properties
			@JsonProperty("patient_counselling")
		private Boolean patient_counselling;
		
		@JsonProperty("drug_interaction")
		private Boolean drug_interaction;
		
		@JsonProperty("prescription_audit")
		private Boolean prescription_audit;
		
		@JsonProperty("adverse_drug_monitering")
		private Boolean adverse_drug_monitering;
		
		@JsonProperty("post_dicharge_package")
		private Boolean post_dicharge_package;
		
		@JsonProperty("services_saved_on")
		private String services_saved_on;

		@JsonProperty("services_updated_on")
		private String services_updated_on;
		
	
		public Boolean getPatient_counselling() {
			return patient_counselling;
		}
		public void setPatient_counselling(Boolean patient_counselling) {
			this.patient_counselling = patient_counselling;
		}
		public Boolean getDrug_interaction() {
			return drug_interaction;
		}
		public void setDrug_interaction(Boolean drug_interaction) {
			this.drug_interaction = drug_interaction;
		}
		public Boolean getPrescription_audit() {
			return prescription_audit;
		}
		public void setPrescription_audit(Boolean prescription_audit) {
			this.prescription_audit = prescription_audit;
		}
		public Boolean getAdverse_drug_monitering() {
			return adverse_drug_monitering;
		}
		public void setAdverse_drug_monitering(Boolean adverse_drug_monitering) {
			this.adverse_drug_monitering = adverse_drug_monitering;
		}
		public Boolean getPost_dicharge_package() {
			return post_dicharge_package;
		}
		public void setPost_dicharge_package(Boolean post_dicharge_package) {
			this.post_dicharge_package = post_dicharge_package;
		}
	
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	
	
	
	public String getDrugname() {
		return drugname;
	}
	public void setDrugname(String drugname) {
		this.drugname = drugname;
	}
	public String getReaction() {
		return reaction;
	}
	public void setReaction(String reaction) {
		this.reaction = reaction;
	}
	public String getDate_of_start() {
		return date_of_start;
	}
	public void setDate_of_start(String date_of_start) {
		this.date_of_start = date_of_start;
	}
	public String getTreatment_taken() {
		return treatment_taken;
	}
	public void setTreatment_taken(String treatment_taken) {
		this.treatment_taken = treatment_taken;
	}
	
	public int getAdverse_id() {
		return adverse_id;
	}
	public void setAdverse_id(int adverse_id) {
		this.adverse_id = adverse_id;
	}
	
	public String getAdverse_save_on() {
		return adverse_save_on;
	}
	public void setAdverse_save_on(String adverse_save_on) {
		this.adverse_save_on = adverse_save_on;
	}
	
		//Diet
		public String getDiet() {
			return diet;
		}
		public void setDiet(String diet) {
			this.diet = diet;
		}
		
		public String getSpl_diet_notes() {
			return spl_diet_notes;
		}
		public void setSpl_diet_notes(String spl_diet_notes) {
			this.spl_diet_notes = spl_diet_notes;
		}
		
		//Social History
		public String getSmoking() {
			return smoking;
		}
		public void setSmoking(String smoking) {
			this.smoking = smoking;
		}
		public String getSmoking_duration() {
			return smoking_duration;
		}
		public void setSmoking_duration(String smoking_duration) {
			this.smoking_duration = smoking_duration;
		}
		public String getTobacco() {
			return tobacco;
		}
		public void setTobacco(String tobacco) {
			this.tobacco = tobacco;
		}
		public String getAlcohol() {
			return alcohol;
		}
		public void setAlcohol(String alcohol) {
			this.alcohol = alcohol;
		}
		public String getAlcohol_duration() {
			return alcohol_duration;
		}
		public void setAlcohol_duration(String alcohol_duration) {
			this.alcohol_duration = alcohol_duration;
		}
		public String getDiet_saved_on() {
			return diet_saved_on;
		}
		public void setDiet_saved_on(String diet_saved_on) {
			this.diet_saved_on = diet_saved_on;
		}
		public String getDiet_updated_on() {
			return diet_updated_on;
		}
		public void setDiet_updated_on(String diet_updated_on) {
			this.diet_updated_on = diet_updated_on;
		}
		public String getSocial_saved_on() {
			return social_saved_on;
		}
		public void setSocial_saved_on(String social_saved_on) {
			this.social_saved_on = social_saved_on;
		}
		public String getSocial_updated_on() {
			return social_updated_on;
		}
		public void setSocial_updated_on(String social_updated_on) {
			this.social_updated_on = social_updated_on;
		}
		public String getAdverse_updated_on() {
			return adverse_updated_on;
		}
		public void setAdverse_updated_on(String adverse_updated_on) {
			this.adverse_updated_on = adverse_updated_on;
		}
		public String getServices_saved_on() {
			return services_saved_on;
		}
		public void setServices_saved_on(String services_saved_on) {
			this.services_saved_on = services_saved_on;
		}
		public String getServices_updated_on() {
			return services_updated_on;
		}
		public void setServices_updated_on(String services_updated_on) {
			this.services_updated_on = services_updated_on;
		}
}
