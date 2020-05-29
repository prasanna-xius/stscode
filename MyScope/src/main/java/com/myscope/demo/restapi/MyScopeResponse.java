package com.myscope.demo.restapi;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyScopeResponse {
	
	
	@JsonProperty("response")
	private String response;
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<MyScopeBean> getResult() {
		return result;
	}

	public void setResult(List<MyScopeBean> result) {
		this.result = result;
	}

	@JsonProperty("result")
	private List<MyScopeBean> result;
	
	

}
