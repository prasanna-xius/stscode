package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lab_ultrasoundBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("lab_ultrasound_id")
	private int lab_ultrasound_id;
	
	@JsonProperty("lab_ultrasound_file")
	private	MultipartFile lab_ultrasound_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("lab_ultrasound_saved")
	private String lab_ultrasound_saved;
	
	
	@JsonProperty("lab_ultrasound_title")
	private String lab_ultrasound_title;
	
	@JsonProperty("lab_ultrasound_type")
	private String lab_ultrasound_type;
	
	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getLab_ultrasound_id() {
		return lab_ultrasound_id;
	}

	public void setLab_ultrasound_id(int lab_ultrasound_id) {
		this.lab_ultrasound_id = lab_ultrasound_id;
	}

	public MultipartFile getLab_ultrasound_file() {
		return lab_ultrasound_file;
	}

	public void setLab_ultrasound_file(MultipartFile lab_ultrasound_file) {
		this.lab_ultrasound_file = lab_ultrasound_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getLab_ultrasound_saved() {
		return lab_ultrasound_saved;
	}

	public void setLab_ultrasound_saved(String lab_ultrasound_saved) {
		this.lab_ultrasound_saved = lab_ultrasound_saved;
	}

	public String getLab_ultrasound_title() {
		return lab_ultrasound_title;
	}

	public void setLab_ultrasound_title(String lab_ultrasound_title) {
		this.lab_ultrasound_title = lab_ultrasound_title;
	}

	public String getLab_ultrasound_type() {
		return lab_ultrasound_type;
	}

	public void setLab_ultrasound_type(String lab_ultrasound_type) {
		this.lab_ultrasound_type = lab_ultrasound_type;
	}

	

}
