package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PatientProfileRow implements RowMapper<PatientProfileBean> {

	@Override
	public PatientProfileBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		PatientProfileBean obj = new PatientProfileBean();
		obj.setAge(rs.getString("age"));
		obj.setBlood_group(rs.getString("blood_group"));
		obj.setBmi(rs.getString("bmi"));
		obj.setDob(rs.getString("dob"));
		obj.setDoctor_name(rs.getString("doctor_name"));
		obj.setEducation(rs.getString("education"));
		obj.setEmail(rs.getString("email"));
		obj.setFamily_income(rs.getString("family_income"));
		obj.setFirst_name(rs.getString("first_name"));
		obj.setGender(rs.getString("gender"));
		obj.setHeight(rs.getString("height"));
		obj.setLanguages_known(rs.getString("languages_known"));
		obj.setLast_name(rs.getString("last_name"));
		obj.setMarrital_status(rs.getString("marital_status"));
		obj.setPharmacist_name(rs.getString("pharmacist_name"));
		obj.setWeight(rs.getString("weight"));
		obj.setMobile_no(rs.getString("mobile_no"));
		
		
//		System.out.println("result::"+rs.getString("mobile_no")+"|"+
//		rs.getString("age")+"|"+
//		rs.getString("blood_group")+"|"+
//		rs.getString("bmi")+"|"+
//		rs.getString("doctor_name")+"|"+
//		rs.getString("education")+"|"+
//		rs.getString("email")+"|"+
//		rs.getString("family_income")+"|"+
//		rs.getString("first_name")+"|"+
//		rs.getString("height")+"|"+
//		rs.getString("languages_known")+"|"+
//		rs.getString("last_name")+"|"+
//		rs.getString("marrital_status")+"|"+
//		rs.getString("pharmacist_name")+"|"+
//		rs.getString("weight"));
		return obj;
	}

}
