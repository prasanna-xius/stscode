package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lab_xrayBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("lab_xray_id")
	private int lab_xray_id;
	
	@JsonProperty("lab_xray_file")
	private	MultipartFile lab_xray_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("lab_xray_saved")
	private String lab_xray_saved;


	@JsonProperty("lab_xray_title")
	private String lab_xray_title;
	
	@JsonProperty("lab_xray_type")
	private String lab_xray_type;
	
	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getLab_xray_id() {
		return lab_xray_id;
	}

	public void setLab_xray_id(int lab_xray_id) {
		this.lab_xray_id = lab_xray_id;
	}

	public MultipartFile getLab_xray_file() {
		return lab_xray_file;
	}

	public void setLab_xray_file(MultipartFile lab_xray_file) {
		this.lab_xray_file = lab_xray_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getLab_xray_saved() {
		return lab_xray_saved;
	}

	public void setLab_xray_saved(String lab_xray_saved) {
		this.lab_xray_saved = lab_xray_saved;
	}

	public String getLab_xray_title() {
		return lab_xray_title;
	}

	public void setLab_xray_title(String lab_xray_title) {
		this.lab_xray_title = lab_xray_title;
	}

	public String getLab_xray_type() {
		return lab_xray_type;
	}

	public void setLab_xray_type(String lab_xray_type) {
		this.lab_xray_type = lab_xray_type;
	}
	
}
