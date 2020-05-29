package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document_insuranceBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("document_insurance_id")
	private int document_insurance_id;
	
	@JsonProperty("document_insurance_file")
	private	MultipartFile document_insurance_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("document_insurance_saved_on")
	private String document_insurance_saved_on;
		
	@JsonProperty("document_insurance_title")
	private String document_insurance_title;
	
	@JsonProperty("document_insurance_type")
	private String document_insurance_type;

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getDocument_insurance_id() {
		return document_insurance_id;
	}

	public void setDocument_insurance_id(int document_insurance_id) {
		this.document_insurance_id = document_insurance_id;
	}

	public MultipartFile getDocument_insurance_file() {
		return document_insurance_file;
	}

	public void setDocument_insurance_file(MultipartFile document_insurance_file) {
		this.document_insurance_file = document_insurance_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getDocument_insurance_saved_on() {
		return document_insurance_saved_on;
	}

	public void setDocument_insurance_saved_on(String document_insurance_saved_on) {
		this.document_insurance_saved_on = document_insurance_saved_on;
	}
	
	public String getDocument_insurance_title() {
		return document_insurance_title;
	}

	public void setDocument_insurance_title(String document_insurance_title) {
		this.document_insurance_title = document_insurance_title;
	}

	public String getDocument_insurance_type() {
		return document_insurance_type;
	}

	public void setDocument_insurance_type(String document_insurance_type) {
		this.document_insurance_type = document_insurance_type;
	}

}
