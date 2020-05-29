package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document_dischargeBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("document_discharge_id")
	private int document_discharge_id;
	
	@JsonProperty("document_discharge_file")
	private	MultipartFile document_discharge_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("document_discharge_saved_on")
	private String document_discharge_saved_on;
	
	@JsonProperty("document_discharge_title")
	private String document_discharge_title;

	
	@JsonProperty("document_discharge_type")
	private String document_discharge_type;


	public String getMobile_no() {
		return mobile_no;
	}


	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}


	public int getDocument_discharge_id() {
		return document_discharge_id;
	}


	public void setDocument_discharge_id(int document_discharge_id) {
		this.document_discharge_id = document_discharge_id;
	}


	public MultipartFile getDocument_discharge_file() {
		return document_discharge_file;
	}


	public void setDocument_discharge_file(MultipartFile document_discharge_file) {
		this.document_discharge_file = document_discharge_file;
	}


	public byte[] getDownloadfile() {
		return downloadfile;
	}


	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}


	public String getDocument_discharge_saved_on() {
		return document_discharge_saved_on;
	}


	public void setDocument_discharge_saved_on(String document_discharge_saved_on) {
		this.document_discharge_saved_on = document_discharge_saved_on;
	}


	public String getDocument_discharge_title() {
		return document_discharge_title;
	}


	public void setDocument_discharge_title(String document_discharge_title) {
		this.document_discharge_title = document_discharge_title;
	}


	public String getDocument_discharge_type() {
		return document_discharge_type;
	}


	public void setDocument_discharge_type(String document_discharge_type) {
		this.document_discharge_type = document_discharge_type;
	}


}
