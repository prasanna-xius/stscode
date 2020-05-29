package com.myscope.demo.restapi;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SelfResponse {

	@JsonProperty("response")
	private String response;
	
	@JsonProperty("result")
	private List<SelfBean> result;
	
	
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<SelfBean> getResult() {
		return result;
	}

	public void setResult(List<SelfBean> result) {
		this.result = result;
	}
}
