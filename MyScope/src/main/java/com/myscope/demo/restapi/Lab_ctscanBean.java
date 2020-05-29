package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lab_ctscanBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("lab_ctscan_id")
	private int lab_ctscan_id;
	
	@JsonProperty("lab_ctscan_file")
	private	MultipartFile lab_ctscan_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("lab_ctscan_saved")
	private String lab_ctscan_saved;
	
	@JsonProperty("lab_ctscan_title")
	private String lab_ctscan_title;


	@JsonProperty("lab_ctscan_type")
	private String lab_ctscan_type;


	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getLab_ctscan_id() {
		return lab_ctscan_id;
	}

	public void setLab_ctscan_id(int lab_ctscan_id) {
		this.lab_ctscan_id = lab_ctscan_id;
	}

	public MultipartFile getLab_ctscan_file() {
		return lab_ctscan_file;
	}

	public void setLab_ctscan_file(MultipartFile lab_ctscan_file) {
		this.lab_ctscan_file = lab_ctscan_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getLab_ctscan_saved() {
		return lab_ctscan_saved;
	}

	public void setLab_ctscan_saved(String lab_ctscan_saved) {
		this.lab_ctscan_saved = lab_ctscan_saved;
	}
	
	public String getLab_ctscan_title() {
		return lab_ctscan_title;
	}

	public void setLab_ctscan_title(String lab_ctscan_title) {
		this.lab_ctscan_title = lab_ctscan_title;
	}

	public String getLab_ctscan_type() {
		return lab_ctscan_type;
	}

	public void setLab_ctscan_type(String lab_ctscan_type) {
		this.lab_ctscan_type = lab_ctscan_type;
	}

}
