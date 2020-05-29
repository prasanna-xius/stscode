package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lab_otherBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("lab_others_id")
	private int lab_others_id;
	
	@JsonProperty("lab_others_file")
	private	MultipartFile lab_others_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("lab_others_saved")
	private String lab_others_saved;

	@JsonProperty("lab_others_title")
	private String lab_others_title;
	
	

	@JsonProperty("lab_others_type")
	private String lab_others_type;
	
	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getLab_others_id() {
		return lab_others_id;
	}

	public void setLab_others_id(int lab_others_id) {
		this.lab_others_id = lab_others_id;
	}

	public MultipartFile getLab_others_file() {
		return lab_others_file;
	}

	public void setLab_others_file(MultipartFile lab_others_file) {
		this.lab_others_file = lab_others_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getLab_others_saved() {
		return lab_others_saved;
	}

	public void setLab_others_saved(String lab_others_saved) {
		this.lab_others_saved = lab_others_saved;
	}
	public String getLab_others_title() {
		return lab_others_title;
	}

	public void setLab_others_title(String lab_others_title) {
		this.lab_others_title = lab_others_title;
	}

	public String getLab_others_type() {
		return lab_others_type;
	}

	public void setLab_others_type(String lab_others_type) {
		this.lab_others_type = lab_others_type;
	}
	
}
