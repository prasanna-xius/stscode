package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lab_urineBean {
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("lab_urine_report_id")
	private int lab_urine_report_id;
	
	@JsonProperty("lab_urine_report_file")
	private	MultipartFile lab_urine_report_file;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("lab_urine_report_saved")
	private String lab_urine_report_saved;
	
	@JsonProperty("lab_urine_report_title")
	private String lab_urine_report_title;
	

	@JsonProperty("lab_urine_report_type")
	private String lab_urine_report_type;

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getLab_urine_report_id() {
		return lab_urine_report_id;
	}

	public void setLab_urine_report_id(int lab_urine_report_id) {
		this.lab_urine_report_id = lab_urine_report_id;
	}

	public MultipartFile getLab_urine_report_file() {
		return lab_urine_report_file;
	}

	public void setLab_urine_report_file(MultipartFile lab_urine_report_file) {
		this.lab_urine_report_file = lab_urine_report_file;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] downloadfile) {
		this.downloadfile = downloadfile;
	}

	public String getLab_urine_report_saved() {
		return lab_urine_report_saved;
	}

	public void setLab_urine_report_saved(String lab_urine_report_saved) {
		this.lab_urine_report_saved = lab_urine_report_saved;
	}

	public String getLab_urine_report_title() {
		return lab_urine_report_title;
	}

	public void setLab_urine_report_title(String lab_urine_report_title) {
		this.lab_urine_report_title = lab_urine_report_title;
	}

	public String getLab_urine_report_type() {
		return lab_urine_report_type;
	}

	public void setLab_urine_report_type(String lab_urine_report_type) {
		this.lab_urine_report_type = lab_urine_report_type;
	}
}
