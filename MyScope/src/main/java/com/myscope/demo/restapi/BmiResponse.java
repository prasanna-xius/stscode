package com.myscope.demo.restapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BmiResponse {

	@JsonProperty("response")
	private String response;
	
	@JsonProperty("result")
	private List<BmiBean> result;
	
	
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<BmiBean> getResult() {
		return result;
	}

	public void setResult(List<BmiBean> result) {
		this.result = result;
	}
}
