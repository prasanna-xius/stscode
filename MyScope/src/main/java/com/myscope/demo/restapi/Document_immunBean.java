package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document_immunBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("document_immunization_id")
	private int document_immunization_id;
	
	@JsonProperty("document_immunization_file")
	private	MultipartFile document_immunization_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("document_immunization_saved_on")
	private String document_immunization_saved_on;
	
	@JsonProperty("document_immunization_title")
	private String document_immunization_title;
	


	@JsonProperty("document_immunization_type")
	private String document_immunization_type;

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getDocument_immunization_id() {
		return document_immunization_id;
	}

	public void setDocument_immunization_id(int document_immunization_id) {
		this.document_immunization_id = document_immunization_id;
	}

	public MultipartFile getDocument_immunization_file() {
		return document_immunization_file;
	}

	public void setDocument_immunization_file(MultipartFile document_immunization_file) {
		this.document_immunization_file = document_immunization_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getDocument_immunization_saved_on() {
		return document_immunization_saved_on;
	}

	public void setDocument_immunization_saved_on(String document_immunization_saved_on) {
		this.document_immunization_saved_on = document_immunization_saved_on;
	}
	
	public String getDocument_immunization_title() {
		return document_immunization_title;
	}

	public void setDocument_immunization_title(String document_immunization_title) {
		this.document_immunization_title = document_immunization_title;
	}

	public String getDocument_immunization_type() {
		return document_immunization_type;
	}

	public void setDocument_immunization_type(String document_immunization_type) {
		this.document_immunization_type = document_immunization_type;
	}
	
}
