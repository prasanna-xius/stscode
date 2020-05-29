package com.myscope.demo.restapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EducationBlogResponse {
	@JsonProperty("response")
	private String response;
	
	@JsonProperty("result")
	private List<EducationBean> result;

	
	
	
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<EducationBean> getResult() {
		return result;
	}

	public void setResult(List<EducationBean> result) {
		this.result = result;
	}
}
