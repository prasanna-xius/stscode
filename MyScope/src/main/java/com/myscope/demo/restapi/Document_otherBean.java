package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document_otherBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("document_other_id")
	private int document_other_id;
	
	@JsonProperty("document_other_file")
	private	MultipartFile document_other_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("document_other_saved_on")
	private String document_other_saved_on;

	@JsonProperty("document_other_title")
	private String document_other_title;
	
	@JsonProperty("document_other_type")
	private String document_other_type;
	
	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getDocument_other_id() {
		return document_other_id;
	}

	public void setDocument_other_id(int document_other_id) {
		this.document_other_id = document_other_id;
	}

	public MultipartFile getDocument_other_file() {
		return document_other_file;
	}

	public void setDocument_other_file(MultipartFile document_other_file) {
		this.document_other_file = document_other_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getDocument_other_saved_on() {
		return document_other_saved_on;
	}

	public void setDocument_other_saved_on(String document_other_saved_on) {
		this.document_other_saved_on = document_other_saved_on;
	}
	
	public String getDocument_other_title() {
		return document_other_title;
	}

	public void setDocument_other_title(String document_other_title) {
		this.document_other_title = document_other_title;
	}

	public String getDocument_other_type() {
		return document_other_type;
	}

	public void setDocument_other_type(String document_other_type) {
		this.document_other_type = document_other_type;
	}
}
