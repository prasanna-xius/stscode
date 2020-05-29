package com.myscope.demo.restapi;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ImmunBean {
	
	
	public String getImmuevent() {
		return immuevent;
	}

	public void setImmuevent(String immuevent) {
		this.immuevent = immuevent;
	}

	public String getImmubrand() {
		return immubrand;
	}

	public void setImmubrand(String immubrand) {
		this.immubrand = immubrand;
	}

	public String getImmunotes() {
		return immunotes;
	}

	public void setImmunotes(String immunotes) {
		this.immunotes = immunotes;
	}

	public String getImmudate() {
		return immudate;
	}

	public void setImmudate(String immudate) {
		this.immudate = immudate;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getImmun_id() {
		return immun_id;
	}

	public void setImmun_id(int immun_id) {
		this.immun_id = immun_id;
	}

	public String getImmuname() {
		return immuname;
	}

	public void setImmuname(String immuname) {
		this.immuname = immuname;
	}
	public String getImmun_saved_on() {
		return immun_saved_on;
	}

	public void setImmun_saved_on(String immun_saved_on) {
		this.immun_saved_on = immun_saved_on;
	}

	public String getImmun_updated_on() {
		return immun_updated_on;
	}

	public void setImmun_updated_on(String immun_updated_on) {
		this.immun_updated_on = immun_updated_on;
	}

	@JsonProperty("immuevent")
	private String immuevent;
	
	@JsonProperty("immubrand")
	private String immubrand;
	
	@JsonProperty("immunotes")
	private String immunotes;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	@JsonProperty("immudate")
	private String immudate;
	
	@JsonProperty("mobile_no")
	private String mobile_no ;
	
	@JsonProperty("immun_id")
	private int immun_id;
	
	@JsonProperty("immuname")
	private String immuname;
	
	@JsonProperty("immun_saved_on")
	private String immun_saved_on;
	
	
	@JsonProperty("immun_updated_on")
	private String immun_updated_on;

}
