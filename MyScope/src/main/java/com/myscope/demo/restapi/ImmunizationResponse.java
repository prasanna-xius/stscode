package com.myscope.demo.restapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImmunizationResponse {
	@JsonProperty("response")
	private String response;
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<ImmunBean> getResult() {
		return result;
	}

	public void setResult(List<ImmunBean> result) {
		this.result = result;
	}

	@JsonProperty("result")
	private List<ImmunBean> result;
	
}
