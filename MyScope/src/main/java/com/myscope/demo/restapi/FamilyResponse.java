package com.myscope.demo.restapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FamilyResponse {
	@JsonProperty("response")
	private String response;
	
	@JsonProperty("result")
	private List<FamilyBean> result;

	
	
	
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<FamilyBean> getResult() {
		return result;
	}

	public void setResult(List<FamilyBean> result) {
		this.result = result;
	}
}
