package com.myscope.demo.restapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PressureResponse {
	@JsonProperty("response")
	private String response;
	
	@JsonProperty("result")
	private List<PressureBean> result;
	
	
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<PressureBean> getResult() {
		return result;
	}

	public void setResult(List<PressureBean> result) {
		this.result = result;
	}
	
	
	
}
