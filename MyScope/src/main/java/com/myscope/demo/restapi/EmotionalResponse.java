package com.myscope.demo.restapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmotionalResponse {

	@JsonProperty("response")
	private String response;
	
	@JsonProperty("result")
	private List<EmotionalBean> result;

	
	
	
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<EmotionalBean> getResult() {
		return result;
	}

	public void setResult(List<EmotionalBean> result) {
		this.result = result;
	}
	
	
}
