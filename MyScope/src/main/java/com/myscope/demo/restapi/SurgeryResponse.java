package com.myscope.demo.restapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SurgeryResponse {
	@JsonProperty("response")
	private String response;
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<SurgeryBean> getResult() {
		return result;
	}

	public void setResult(List<SurgeryBean> result) {
		this.result = result;
	}

	@JsonProperty("result")
	private List<SurgeryBean> result;
	
}
