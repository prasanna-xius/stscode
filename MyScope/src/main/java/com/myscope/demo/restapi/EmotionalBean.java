package com.myscope.demo.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmotionalBean {

	@JsonProperty("score_of_wellness")
	private String score_of_wellness;
	
	@JsonProperty("emotional_status")
	private String emotional_status;
	
	@JsonProperty("duration")
	private String duration;
	
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getScore_of_wellness() {
		return score_of_wellness;
	}

	public void setScore_of_wellness(String score_of_wellness) {
		this.score_of_wellness = score_of_wellness;
	}

	public String getEmotional_status() {
		return emotional_status;
	}

	public void setEmotional_status(String emotional_status) {
		this.emotional_status = emotional_status;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getAny_emotional_trauma() {
		return any_emotional_trauma;
	}

	public void setAny_emotional_trauma(String any_emotional_trauma) {
		this.any_emotional_trauma = any_emotional_trauma;
	}

	public String getReason_of_trauma() {
		return reason_of_trauma;
	}

	public void setReason_of_trauma(String reason_of_trauma) {
		this.reason_of_trauma = reason_of_trauma;
	}

	public String getEmotional_saved_on() {
		return emotional_saved_on;
	}

	public void setEmotional_saved_on(String emotional_saved_on) {
		this.emotional_saved_on = emotional_saved_on;
	}

	public String getEmotional_updated_on() {
		return emotional_updated_on;
	}

	public void setEmotional_updated_on(String emotional_updated_on) {
		this.emotional_updated_on = emotional_updated_on;
	}

	public int getEmotional_id() {
		return emotional_id;
	}

	public void setEmotional_id(int emotional_id) {
		this.emotional_id = emotional_id;
	}

	@JsonProperty("any_emotional_trauma")
	private String any_emotional_trauma;
	
	@JsonProperty("reason_of_trauma")
	private String reason_of_trauma;
	
	@JsonProperty("emotional_saved_on")
	private String emotional_saved_on;

	@JsonProperty("emotional_updated_on")
	private String emotional_updated_on;
	
	@JsonProperty("emotional_id")
	private int emotional_id;
}
