package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document_dietBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	

	@JsonProperty("document_diet_id")
	private int document_diet_id;
	
	@JsonProperty("document_diet_file")
	private	MultipartFile document_diet_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("document_diet_saved_on")
	private String document_diet_saved_on;
	
	@JsonProperty("document_diet_title")
	private String document_diet_title;
	
	

	@JsonProperty("document_diet_type")
	private String document_diet_type;
	
	
	public String getDocument_diet_title() {
		return document_diet_title;
	}

	public void setDocument_diet_title(String document_diet_title) {
		this.document_diet_title = document_diet_title;
	}

	public String getDocument_diet_type() {
		return document_diet_type;
	}

	public void setDocument_diet_type(String document_diet_type) {
		this.document_diet_type = document_diet_type;
	}
	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] string) {
		this.downloadfile = string;
	}
	public int getDocument_diet_id() {
		return document_diet_id;
	}

	public void setDocument_diet_id(int document_diet_id) {
		this.document_diet_id = document_diet_id;
	}

	public MultipartFile getDocument_diet_file() {
		return document_diet_file;
	}

	public void setDocument_diet_file(MultipartFile document_diet_file) {
		this.document_diet_file = document_diet_file;
	}

	public String getDocument_diet_saved_on() {
		return document_diet_saved_on;
	}

	public void setDocument_diet_saved_on(String document_diet_saved_on) {
		this.document_diet_saved_on = document_diet_saved_on;
	}

	
}
