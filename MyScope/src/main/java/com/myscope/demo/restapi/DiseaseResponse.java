package com.myscope.demo.restapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DiseaseResponse {
	@JsonProperty("response")
	private String response;
	
	@JsonProperty("result")
	private List<DiseaseBean> result;

	
	
	
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<DiseaseBean> getResult() {
		return result;
	}

	public void setResult(List<DiseaseBean> result) {
		this.result = result;
	}
}
