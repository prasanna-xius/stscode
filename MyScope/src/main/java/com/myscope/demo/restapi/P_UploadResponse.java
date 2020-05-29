package com.myscope.demo.restapi;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class P_UploadResponse {

		
		@JsonProperty("response")
		private String response;
		
		@JsonProperty("result")
		private List<PrescriptionUploadBean> result;

		
		
		
		
		public String getResponse() {
			return response;
		}

		public void setResponse(String response) {
			this.response = response;
		}

		public List<PrescriptionUploadBean> getResult() {
			return result;
		}

		public void setResult(List<PrescriptionUploadBean> result) {
			this.result = result;
		}
	

}
