package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document_educationBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("document_education_id")
	private int document_education_id;
	
	@JsonProperty("document_education_file")
	private	MultipartFile document_education_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("document_education_saved_on")
	private String document_education_saved_on;
	
	@JsonProperty("document_education_title")
	private String document_education_title;
	
	

	@JsonProperty("document_education_type")
	private String document_education_type;

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getDocument_education_id() {
		return document_education_id;
	}

	public void setDocument_education_id(int document_education_id) {
		this.document_education_id = document_education_id;
	}

	public MultipartFile getDocument_education_file() {
		return document_education_file;
	}

	public void setDocument_education_file(MultipartFile document_education_file) {
		this.document_education_file = document_education_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getDocument_education_saved_on() {
		return document_education_saved_on;
	}

	public void setDocument_education_saved_on(String document_education_saved_on) {
		this.document_education_saved_on = document_education_saved_on;
	}
	
	public String getDocument_education_title() {
		return document_education_title;
	}

	public void setDocument_education_title(String document_education_title) {
		this.document_education_title = document_education_title;
	}

	public String getDocument_education_type() {
		return document_education_type;
	}

	public void setDocument_education_type(String document_education_type) {
		this.document_education_type = document_education_type;
	}
}
