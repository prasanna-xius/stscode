package com.myscope.demo.restapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrescriptionResponse {
	
	@JsonProperty("response")
	private String response;
	
	@JsonProperty("result")
	private List<PrescriptionManualBean> result;

	
	
	
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<PrescriptionManualBean> getResult() {
		return result;
	}

	public void setResult(List<PrescriptionManualBean> result) {
		this.result = result;
	}
}
