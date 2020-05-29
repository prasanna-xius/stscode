package com.myscope.demo.restapi;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EducationBean {

	
	//education image
	@JsonProperty("education_imagetitle")
	private String education_imagetitle;
	

	@JsonProperty("education_image")
	private	MultipartFile education_image;
	
	@JsonProperty("educationdownloadimage")
	private byte[] educationdownloadimage;

	@JsonProperty("education_imagesubtype")
	private String education_imagesubtype;
	
	@JsonProperty("education_imagesno")
	private int education_imagesno;
	
	
	//education pdf
	@JsonProperty("education_pdf")
	private	MultipartFile education_pdf;
	
	@JsonProperty("downloadpdf")
	private byte[] downloadpdf;
	
	
	@JsonProperty("education_pdftitle")
	private String education_pdftitle;
	

	@JsonProperty("education_pdfsubtype")
	private String education_pdfsubtype;
	

	@JsonProperty("education_pdfsno")
	private int education_pdfsno;
	
	//education links
	
	@JsonProperty("education_weblink")
	private	String education_weblink;
	
	@JsonProperty("education_webtitle")
	private String education_webtitle;
	

	@JsonProperty("education_websubtype")
	private String education_websubtype;
	

	@JsonProperty("education_websno")
	private int education_websno;
	
	

	public String getEducation_imagetitle() {
		return education_imagetitle;
	}


	public void setEducation_imagetitle(String education_imagetitle) {
		this.education_imagetitle = education_imagetitle;
	}


	public MultipartFile getEducation_image() {
		return education_image;
	}


	public void setEducation_image(MultipartFile education_image) {
		this.education_image = education_image;
	}


	public byte[] geteducationdownloadimage() {
		return educationdownloadimage;
	}


	public void seteducationdownloadimage(byte[] educationdownloadimage) {
		this.educationdownloadimage = educationdownloadimage;
	}


	public String getEducation_imagesubtype() {
		return education_imagesubtype;
	}


	public void setEducation_imagesubtype(String education_imagesubtype) {
		this.education_imagesubtype = education_imagesubtype;
	}


	public int getEducation_imagesno() {
		return education_imagesno;
	}


	public void setEducation_imagesno(int education_imagesno) {
		this.education_imagesno = education_imagesno;
	}


	public MultipartFile getEducation_pdf() {
		return education_pdf;
	}


	public void setEducation_pdf(MultipartFile education_pdf) {
		this.education_pdf = education_pdf;
	}


	public byte[] getDownloadpdf() {
		return downloadpdf;
	}


	public void setDownloadpdf(byte[] downloadpdf) {
		this.downloadpdf = downloadpdf;
	}


	public String getEducation_pdftitle() {
		return education_pdftitle;
	}


	public void setEducation_pdftitle(String education_pdftitle) {
		this.education_pdftitle = education_pdftitle;
	}


	public String getEducation_pdfsubtype() {
		return education_pdfsubtype;
	}


	public void setEducation_pdfsubtype(String education_pdfsubtype) {
		this.education_pdfsubtype = education_pdfsubtype;
	}


	public int getEducation_pdfsno() {
		return education_pdfsno;
	}


	public void setEducation_pdfsno(int education_pdfsno) {
		this.education_pdfsno = education_pdfsno;
	}


	public String getEducation_weblink() {
		return education_weblink;
	}


	public void setEducation_weblink(String education_weblink) {
		this.education_weblink = education_weblink;
	}


	public String getEducation_webtitle() {
		return education_webtitle;
	}


	public void setEducation_webtitle(String education_webtitle) {
		this.education_webtitle = education_webtitle;
	}


	public String getEducation_websubtype() {
		return education_websubtype;
	}


	public void setEducation_websubtype(String education_websubtype) {
		this.education_websubtype = education_websubtype;
	}


	public int getEducation_websno() {
		return education_websno;
	}


	public void setEducation_websno(int education_websno) {
		this.education_websno = education_websno;
	}


}
