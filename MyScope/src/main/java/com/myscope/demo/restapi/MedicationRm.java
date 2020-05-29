package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class MedicationRm implements RowMapper<MedicationBean> {
	
	

	public MedicationBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		
		MedicationBean obj = new MedicationBean();
		obj.setDoseunit(rs.getString("doseunit"));
		obj.setEnddate(rs.getString("enddate"));
		obj.setFormulation(rs.getString("formulation"));
		obj.setHow_often_taken(rs.getString("how_often_taken"));
		obj.setIsprescribed(rs.getString("isprescribed"));
		obj.setMobile_no(rs.getString("mobile_no"));
		obj.setMedication_id(rs.getInt("medication_id"));
		
		obj.setMedicationname(rs.getString("medicationname"));
		obj.setMedicationnotes(rs.getString("medicationnotes"));
		obj.setReason(rs.getString("reason"));
		obj.setStartdate(rs.getString("startdate"));
		obj.setStrength(rs.getString("strength"));
		obj.setMedication_saved_on(rs.getString("medication_saved_on"));
		obj.setMedication_updated_on(rs.getString("medication_updated_on"));
		
		//obj.setDate(rs.getName());
		
		
		/*System.out.println("result::"+ rs.getString("name")+"|"+rs.getString("date")
		+"|"+rs.getString("notes")+"|"+rs.getString("reaction")+"|"+rs.getString("spnrdata")+"|"+rs.getString("treatment"));*/
		
		return obj;
	}

}
