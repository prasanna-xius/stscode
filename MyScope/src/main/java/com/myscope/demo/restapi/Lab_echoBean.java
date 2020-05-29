package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lab_echoBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("lab_echo_id")
	private int lab_echo_id;
	
	@JsonProperty("lab_echo_file")
	private	MultipartFile lab_echo_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("lab_echo_saved")
	private String lab_echo_saved;
	
	@JsonProperty("lab_echo_title")
	private String lab_echo_title;
	
	
	@JsonProperty("lab_echo_type")
	private String lab_echo_type;

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getLab_echo_id() {
		return lab_echo_id;
	}

	public void setLab_echo_id(int lab_echo_id) {
		this.lab_echo_id = lab_echo_id;
	}

	public MultipartFile getLab_echo_file() {
		return lab_echo_file;
	}

	public void setLab_echo_file(MultipartFile lab_echo_file) {
		this.lab_echo_file = lab_echo_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getLab_echo_saved() {
		return lab_echo_saved;
	}

	public void setLab_echo_saved(String lab_echo_saved) {
		this.lab_echo_saved = lab_echo_saved;
	}
	public String getLab_echo_title() {
		return lab_echo_title;
	}

	public void setLab_echo_title(String lab_echo_title) {
		this.lab_echo_title = lab_echo_title;
	}

	public String getLab_echo_type() {
		return lab_echo_type;
	}

	public void setLab_echo_type(String lab_echo_type) {
		this.lab_echo_type = lab_echo_type;
	}

	
}
