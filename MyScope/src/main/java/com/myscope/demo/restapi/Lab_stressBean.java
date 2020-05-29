package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lab_stressBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("lab_stresstest_id")
	private int lab_stresstest_id;
	
	@JsonProperty("lab_stresstest_file")
	private	MultipartFile lab_stresstest_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("lab_stresstest_saved")
	private String lab_stresstest_saved;
	
	
	@JsonProperty("lab_stresstest_title")
	private String lab_stresstest_title;
	
	@JsonProperty("lab_stresstest_type")
	private String lab_stresstest_type;

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getLab_stresstest_id() {
		return lab_stresstest_id;
	}

	public void setLab_stresstest_id(int lab_stresstest_id) {
		this.lab_stresstest_id = lab_stresstest_id;
	}

	public MultipartFile getLab_stresstest_file() {
		return lab_stresstest_file;
	}

	public void setLab_stresstest_file(MultipartFile lab_stresstest_file) {
		this.lab_stresstest_file = lab_stresstest_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getLab_stresstest_saved() {
		return lab_stresstest_saved;
	}

	public void setLab_stresstest_saved(String lab_stresstest_saved) {
		this.lab_stresstest_saved = lab_stresstest_saved;
	}
	public String getLab_stresstest_title() {
		return lab_stresstest_title;
	}

	public void setLab_stresstest_title(String lab_stresstest_title) {
		this.lab_stresstest_title = lab_stresstest_title;
	}

	public String getLab_stresstest_type() {
		return lab_stresstest_type;
	}

	public void setLab_stresstest_type(String lab_stresstest_type) {
		this.lab_stresstest_type = lab_stresstest_type;
	}

}
