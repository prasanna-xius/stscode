package com.myscope.demo.restapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfileResponse {
	@JsonProperty("response")
	private String response;
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<PatientProfileBean> getResult() {
		return result;
	}

	public void setResult(List<PatientProfileBean> result) {
		this.result = result;
	}

	@JsonProperty("result")
	private List<PatientProfileBean> result;
	
}
