package com.myscope.demo.restapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientResponse {

	@JsonProperty("response")
	private String response;
	
	@JsonProperty("result")
	private List<PatientBean> result;

	
	
	
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<PatientBean> getResult() {
		return result;
	}

	public void setResult(List<PatientBean> result) {
		this.result = result;
	}
	
	
	
	
	
}
