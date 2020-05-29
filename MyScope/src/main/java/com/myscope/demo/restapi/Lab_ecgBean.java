package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lab_ecgBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("lab_ecg_id")
	private int lab_ecg_id;
	
	@JsonProperty("lab_ecg_file")
	private	MultipartFile lab_ecg_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("lab_ecg_saved")
	private String lab_ecg_saved;
	
	@JsonProperty("lab_ecg_title")
	private String lab_ecg_title;
	
	

	@JsonProperty("lab_ecg_type")
	private String lab_ecg_type;

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getLab_ecg_id() {
		return lab_ecg_id;
	}

	public void setLab_ecg_id(int lab_ecg_id) {
		this.lab_ecg_id = lab_ecg_id;
	}

	public MultipartFile getLab_ecg_file() {
		return lab_ecg_file;
	}

	public void setLab_ecg_file(MultipartFile lab_ecg_file) {
		this.lab_ecg_file = lab_ecg_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getLab_ecg_saved() {
		return lab_ecg_saved;
	}

	public void setLab_ecg_saved(String lab_ecg_saved) {
		this.lab_ecg_saved = lab_ecg_saved;
	}
	public String getLab_ecg_title() {
		return lab_ecg_title;
	}

	public void setLab_ecg_title(String lab_ecg_title) {
		this.lab_ecg_title = lab_ecg_title;
	}

	public String getLab_ecg_type() {
		return lab_ecg_type;
	}

	public void setLab_ecg_type(String lab_ecg_type) {
		this.lab_ecg_type = lab_ecg_type;
	}
}
