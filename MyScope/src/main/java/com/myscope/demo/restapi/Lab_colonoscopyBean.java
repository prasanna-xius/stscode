package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lab_colonoscopyBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("lab_colonoscopy_id")
	private int lab_colonoscopy_id;
	
	@JsonProperty("lab_colonoscopy_file")
	private	MultipartFile lab_colonoscopy_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("lab_colonoscopy_saved")
	private String lab_colonoscopy_saved; 
	
	
	@JsonProperty("lab_colonoscopy_title")
	private String lab_colonoscopy_title; 
	
	@JsonProperty("lab_colonoscopy_type")
	private String lab_colonoscopy_type; 
	
	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getLab_colonoscopy_id() {
		return lab_colonoscopy_id;
	}

	public void setLab_colonoscopy_id(int lab_colonoscopy_id) {
		this.lab_colonoscopy_id = lab_colonoscopy_id;
	}

	public MultipartFile getLab_colonoscopy_file() {
		return lab_colonoscopy_file;
	}

	public void setLab_colonoscopy_file(MultipartFile lab_colonoscopy_file) {
		this.lab_colonoscopy_file = lab_colonoscopy_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getLab_colonoscopy_saved() {
		return lab_colonoscopy_saved;
	}

	public void setLab_colonoscopy_saved(String lab_colonoscopy_saved) {
		this.lab_colonoscopy_saved = lab_colonoscopy_saved;
	}
	public String getLab_colonoscopy_title() {
		return lab_colonoscopy_title;
	}

	public void setLab_colonoscopy_title(String lab_colonoscopy_title) {
		this.lab_colonoscopy_title = lab_colonoscopy_title;
	}

	public String getLab_colonoscopy_type() {
		return lab_colonoscopy_type;
	}

	public void setLab_colonoscopy_type(String lab_colonoscopy_type) {
		this.lab_colonoscopy_type = lab_colonoscopy_type;
	}

	
	
	
}
