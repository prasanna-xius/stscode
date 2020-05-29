package com.myscope.demo.restapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CholestrolResponse {

	@JsonProperty("response")
	private String response;
	
	@JsonProperty("result")
	private List<CholestrolBean> result;
	
	
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<CholestrolBean> getResult() {
		return result;
	}

	public void setResult(List<CholestrolBean> result) {
		this.result = result;
	}
	
}
