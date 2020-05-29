package com.myscope.demo.restapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HabitResponse {

	
	@JsonProperty("response")
	private String response;
	
	@JsonProperty("result")
	private List<HabitsBean> result;

	
	
	
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<HabitsBean> getResult() {
		return result;
	}

	public void setResult(List<HabitsBean> result) {
		this.result = result;
	}
	
}
