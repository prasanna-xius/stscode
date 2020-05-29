package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lab_mriBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("lab_mri_id")
	private int lab_mri_id;
	
	@JsonProperty("lab_mri_file")
	private	MultipartFile lab_mri_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("lab_mri_saved")
	private String lab_mri_saved;

	@JsonProperty("lab_mri_title")
	private String lab_mri_title;
	
	

	@JsonProperty("lab_mri_type")
	private String lab_mri_type; 
	
	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getLab_mri_id() {
		return lab_mri_id;
	}

	public void setLab_mri_id(int lab_mri_id) {
		this.lab_mri_id = lab_mri_id;
	}

	public MultipartFile getLab_mri_file() {
		return lab_mri_file;
	}

	public void setLab_mri_file(MultipartFile lab_mri_file) {
		this.lab_mri_file = lab_mri_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getLab_mri_saved() {
		return lab_mri_saved;
	}

	public void setLab_mri_saved(String lab_mri_saved) {
		this.lab_mri_saved = lab_mri_saved;
	}
	public String getLab_mri_title() {
		return lab_mri_title;
	}

	public void setLab_mri_title(String lab_mri_title) {
		this.lab_mri_title = lab_mri_title;
	}

	public String getLab_mri_type() {
		return lab_mri_type;
	}

	public void setLab_mri_type(String lab_mri_type) {
		this.lab_mri_type = lab_mri_type;
	}
	
}
