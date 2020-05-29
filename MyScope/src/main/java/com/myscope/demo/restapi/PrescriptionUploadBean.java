package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrescriptionUploadBean {
	
	
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("p_uploadid")
	private int p_uploadid;
	
	@JsonProperty("p_upload")
	private	MultipartFile p_upload;
	
	@JsonProperty("downloadfile")
	private byte[] downloadfile;
	
	@JsonProperty("upload_saved_on")
	private String upload_saved_on;
	
	@JsonProperty("upload_title")
	private String upload_title;
	
	@JsonProperty("upload_type")
	private String upload_type;
	
	@JsonProperty("model_name")
	private String model_name; 
	

	
	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public String getUpload_type() {
		return upload_type;
	}

	public void setUpload_type(String upload_type) {
		this.upload_type = upload_type;
	}

	public String getUpload_title() {
		return upload_title;
	}

	public void setUpload_title(String upload_title) {
		this.upload_title = upload_title;
	}

	public String getUpload_saved_on() {
		return upload_saved_on;
	}

	public void setUpload_saved_on(String upload_saved_on) {
		this.upload_saved_on = upload_saved_on;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getP_uploadid() {
		return p_uploadid;
	}

	public void setP_uploadid(int p_uploadid) {
		this.p_uploadid = p_uploadid;
	}

	public MultipartFile getP_upload() {
		return p_upload;
	}

	public void setP_upload(MultipartFile p_upload) {
		this.p_upload = p_upload;
	}

	public byte[] getDownloadfile() {
		return downloadfile;
	}

	public void setDownloadfile(byte[] string) {
		this.downloadfile = string;
	}

}
