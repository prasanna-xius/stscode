package com.myscope.demo.restapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GlucoseResponse {

	@JsonProperty("response")
	private String response;
	
	@JsonProperty("result")
	private List<GlucoseBean> result;
	
	
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<GlucoseBean> getResult() {
		return result;
	}

	public void setResult(List<GlucoseBean> result) {
		this.result = result;
	}
	
}
