package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AdverseDrugRow implements RowMapper<HabitsBean>{

	@Override
	public HabitsBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		HabitsBean obj = new HabitsBean();
		obj.setDrugname(rs.getString("drugname"));
		obj.setReaction(rs.getString("reaction"));
		obj.setDate_of_start(rs.getString("date_of_start"));
		obj.setTreatment_taken(rs.getString("treatment_taken"));
		obj.setAdverse_id(rs.getInt("adverse_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
		obj.setAdverse_save_on(rs.getString("adverse_save_on"));

		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getString("reaction")+"|"+rs.getString("date_of_start")+"|"+rs.getString("treatment_taken")+"|"+rs.getInt("adverse_id")
		+"|"+rs.getString("adverse_save_on"));
		
		
		return obj;
	}
}
