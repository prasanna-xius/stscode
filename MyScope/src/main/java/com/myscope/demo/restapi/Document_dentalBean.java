package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document_dentalBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	

	@JsonProperty("document_dental_id")
	private int document_dental_id;
	
	@JsonProperty("document_dental_file")
	private	MultipartFile document_dental_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("document_dental_saved_on")
	private String document_dental_saved_on;
	
	@JsonProperty("document_dental_title")
	private String document_dental_title;
	
	
	@JsonProperty("document_dental_type")
	private String document_dental_type;
	
	public String getDocument_dental_title() {
		return document_dental_title;
	}

	public void setDocument_dental_title(String document_dental_title) {
		this.document_dental_title = document_dental_title;
	}

	public String getDocument_dental_type() {
		return document_dental_type;
	}

	public void setDocument_dental_type(String document_dental_type) {
		this.document_dental_type = document_dental_type;
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
	public int getDocument_dental_id() {
		return document_dental_id;
	}

	public void setDocument_dental_id(int document_dental_id) {
		this.document_dental_id = document_dental_id;
	}

	public MultipartFile getDocument_dental_file() {
		return document_dental_file;
	}

	public void setDocument_dental_file(MultipartFile document_dental_file) {
		this.document_dental_file = document_dental_file;
	}

	public String getDocument_dental_saved_on() {
		return document_dental_saved_on;
	}

	public void setDocument_dental_saved_on(String document_dental_saved_on) {
		this.document_dental_saved_on = document_dental_saved_on;
	}
}
