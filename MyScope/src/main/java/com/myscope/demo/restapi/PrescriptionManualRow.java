package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class PrescriptionManualRow implements RowMapper<PrescriptionManualBean>{
	
	
	

	@Override
	public PrescriptionManualBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		PrescriptionManualBean obj = new PrescriptionManualBean();		
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		
		obj.setMobile_no(rs.getString("mobile_no"));
		
		obj.setIs_prescribed(rs.getString("is_prescribed"));
		obj.setPrescription_note(rs.getString("prescription_note"));
		obj.setDoctor_name(rs.getString("doctor_name"));
		obj.setHospital_name(rs.getString("hospital_name"));
		obj.setMedical_condition(rs.getString("medical_condition"));
		obj.setPrescription_id(rs.getInt("prescription_id"));
		obj.setModel_name(rs.getString("model_name"));
		obj.setManual_saved_on(rs.getString("manual_saved_on"));
		obj.setManual_updated_on(rs.getString("manual_updated_on"));

//		obj.setDownloadfile(rs.getBytes("file"));

		
		System.out.println("result::"+rs.getString("mobile_no")+
				"|"+rs.getString("is_prescribed")+
				"|"+rs.getString("prescription_note")+
				"|"+rs.getInt("prescription_id")+
				"|"+rs.getString("doctor_name")+
				"|"+rs.getString("hospital_name")+
				"|"+rs.getString("medical_condition")+
				"|"+rs.getString("model_name")+"|"+
				rs.getString("manual_saved_on")+"|"+
				rs.getString("manual_updated_on"));
				
//				"|"+rs.getBytes("file"));
		return obj;
		
	}


}
