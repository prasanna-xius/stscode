package com.myscope.demo.restapi;



import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import retrofit2.http.Multipart;

public class PrescriptionManualBean {
	

	
	
	@JsonProperty("is_prescribed")
	private String is_prescribed;
	
	@JsonProperty("prescription_note")
	private String prescription_note;
	
	@JsonProperty("mobile_no")
	private String mobile_no;
	
	@JsonProperty("prescription_id")
	private int prescription_id;
	
	
	@JsonProperty("doctor_name")
	private String doctor_name;
	
	@JsonProperty("hospital_name")
	private String hospital_name;
	
	
	@JsonProperty("medical_condition")
	private String medical_condition;
	 
	
	@JsonProperty("model_name")
	private String model_name;
	
	

	@JsonProperty("manual_saved_on")
	private String manual_saved_on;
	
	@JsonProperty("manual_updated_on")
	private String manual_updated_on;
	
//	@JsonProperty("file")
//	private	MultipartFile file;
//	
//	@JsonProperty("downloadfile")
//	private byte[] downloadfile;
	
	

	
	// Setting data through setters and getters
	
	public String getIs_prescribed() {
		return is_prescribed;
	}

	public void setIs_prescribed(String is_prescribed) {
		this.is_prescribed = is_prescribed;
	}

	public String getPrescription_note() {
		return prescription_note;
	}

	public void setPrescription_note(String prescription_note) {
		this.prescription_note = prescription_note;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	
//	public MultipartFile getFile() {
//		return file;
//	}
//
//	public void setFile(MultipartFile b) {
//		this.file = b;
//	}
//	public byte[] getDownloadfile() {
//		return downloadfile;
//	}
//
//	public void setDownloadfile(byte[] downloadfile) {
//		this.downloadfile = downloadfile;
//	}
	public int getPrescription_id() {
		return prescription_id;
	}

	public void setPrescription_id(int prescription_id) {
		this.prescription_id = prescription_id;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getHospital_name() {
		return hospital_name;
	}

	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}



	public void setMedical_condition(String medical_condition) {
		// TODO Auto-generated method stub
		this.medical_condition = medical_condition;
	}
	public String getMedical_condition() {
		return medical_condition;
	}
	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getManual_saved_on() {
		return manual_saved_on;
	}

	public void setManual_saved_on(String manual_saved_on) {
		this.manual_saved_on = manual_saved_on;
	}

	public String getManual_updated_on() {
		return manual_updated_on;
	}

	public void setManual_updated_on(String manual_updated_on) {
		this.manual_updated_on = manual_updated_on;
	}
}
