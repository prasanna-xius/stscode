package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lab_bloodBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("lab_blood_id")
	private int lab_blood_id;
	
	@JsonProperty("lab_blood_file")
	private	MultipartFile lab_blood_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("lab_blood_saved")
	private String lab_blood_saved;
	
	
	@JsonProperty("lab_blood_title")
	private String lab_blood_title;
	
	@JsonProperty("lab_blood_type")
	private String lab_blood_type;

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getLab_blood_id() {
		return lab_blood_id;
	}

	public void setLab_blood_id(int lab_blood_id) {
		this.lab_blood_id = lab_blood_id;
	}

	public MultipartFile getLab_blood_file() {
		return lab_blood_file;
	}

	public void setLab_blood_file(MultipartFile lab_blood_file) {
		this.lab_blood_file = lab_blood_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getLab_blood_saved() {
		return lab_blood_saved;
	}

	public void setLab_blood_saved(String lab_blood_saved) {
		this.lab_blood_saved = lab_blood_saved;
	}
	public String getLab_blood_title() {
		return lab_blood_title;
	}

	public void setLab_blood_title(String lab_blood_title) {
		this.lab_blood_title = lab_blood_title;
	}

	public String getLab_blood_type() {
		return lab_blood_type;
	}

	public void setLab_blood_type(String lab_blood_type) {
		this.lab_blood_type = lab_blood_type;
	}

}
