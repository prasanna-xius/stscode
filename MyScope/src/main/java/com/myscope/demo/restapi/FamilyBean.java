package com.myscope.demo.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FamilyBean {
	

		//Family History
		@JsonProperty("mobile_no")
		private String mobile_no;

		@JsonProperty("family_condition")
		private String family_condition;
		
		@JsonProperty("relationship")
		private String relationship;
		
		@JsonProperty("family_note")
		private String family_note;
		
		@JsonProperty("family_id")
		private int familyid;
		
		@JsonProperty("family_save_on")
		private String family_save_on;

	

		@JsonProperty("family_updated_on")
		private String family_updated_on;
		
		public String getMobile_no() {
			return mobile_no;
		}

		public void setMobile_no(String mobile_no) {
			this.mobile_no = mobile_no;
		}

		public String getFamily_condition() {
			return family_condition;
		}

		public void setFamily_condition(String family_condition) {
			this.family_condition = family_condition;
		}

		public String getRelationship() {
			return relationship;
		}

		public void setRelationship(String relationship) {
			this.relationship = relationship;
		}

		public String getFamily_note() {
			return family_note;
		}

		public void setFamily_note(String family_note) {
			this.family_note = family_note;
		}

		public int getFamilyid() {
			return familyid;
		}

		public void setFamilyid(int familyid) {
			this.familyid = familyid;
		}
		public String getFamily_save_on() {
			return family_save_on;
		}

		public void setFamily_save_on(String family_save_on) {
			this.family_save_on = family_save_on;
		}

		public String getFamily_updated_on() {
			return family_updated_on;
		}

		public void setFamily_updated_on(String family_updated_on) {
			this.family_updated_on = family_updated_on;
		}
}
