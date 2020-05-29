package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ServicesRow  implements RowMapper<HabitsBean> {
	
	@Override
	public HabitsBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
//		
		HabitsBean obj = new HabitsBean();
		
		obj.setPatient_counselling(rs.getBoolean("patient_counselling"));
		obj.setDrug_interaction(rs.getBoolean("drug_interaction"));
		obj.setPrescription_audit(rs.getBoolean("Prescription_audit"));
		obj.setAdverse_drug_monitering(rs.getBoolean("Adverse_drug_monitering"));
		obj.setPost_dicharge_package(rs.getBoolean("post_dicharge_package"));
		obj.setServices_saved_on(rs.getString("services_saved_on"));
		obj.setServices_updated_on(rs.getString("services_updated_on"));
		
		
		
		
		
		
//		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getString("checkbox1")+rs.getString("checkbox2")
//		+rs.getString("checkbox3")+rs.getString("checkbox4")+rs.getString("checkbox5"));
		
		return obj;
	}
	
	
	}


