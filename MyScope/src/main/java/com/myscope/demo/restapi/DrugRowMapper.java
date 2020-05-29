package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class DrugRowMapper implements RowMapper<PrescriptionDurgBean>{
	// TODO Auto-generated method stub
	
	

	@Override
	public PrescriptionDurgBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		PrescriptionDurgBean obj = new PrescriptionDurgBean();		
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		
		obj.setFormulation(rs.getString("formulation"));
		obj.setDrug_name(rs.getString("drug_name"));
		obj.setBrand_name(rs.getString("brand_name"));
		obj.setDose_strength(rs.getString("dose_strength"));
		obj.setDose_unit(rs.getString("dose_unit"));
		obj.setHow_often_taken(rs.getString("how_often_taken"));
		obj.setStart_date(rs.getString("start_date"));
		obj.setStop_date(rs.getString("stop_date"));
		obj.setDrug_id(rs.getInt("drug_id"));
		obj.setPrescription_id(rs.getInt("prescription_id"));
		obj.setTime(rs.getString("time"));
		obj.setDrug_saved_on(rs.getString("drug_saved_on"));
		obj.setDrug_updated_on(rs.getString("drug_updated_on"));
			
		
			System.out.println("result::"+
					"|"+rs.getString("formulation")+
					"|"+rs.getString("drug_name")+
					"|"+rs.getString("brand_name")+
					"|"+rs.getString("dose_strength")+
					"|"+rs.getString("dose_unit")+
					"|"+rs.getString("how_often_taken")+
					"|"+rs.getString("start_date")+
					"|"+rs.getString("brand_name")+
					"|"+rs.getString("stop_date")+
					"|"+rs.getInt("drug_id")+
					"|"+rs.getInt("prescription_id")+
					"|"+rs.getString("time")+"|"+
					rs.getString("drug_saved_on")+"|"+
					rs.getString("drug_updated_on"));
					
//					"|"+rs.getBytes("file"));
			return obj;
	}

}

