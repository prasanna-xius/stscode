package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class MyScopeRm implements RowMapper<MyScopeBean> {
	
	

	public MyScopeBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		
		MyScopeBean obj = new MyScopeBean();
		
		
		obj.setAllergy_id(rs.getInt("allergy_id"));
		obj.setName(rs.getString("name"));
		obj.setNotes(rs.getString("notes"));
		obj.setReaction(rs.getString("reaction"));
		obj.setSpnrdata(rs.getString("spnrdata"));
		obj.setTreatment(rs.getString("treatment"));
		obj.setDate(rs.getString("date"));
		obj.setMobile_no(rs.getString("mobile_no"));
		obj.setAllergy_saved_on(rs.getString("allergy_saved_on"));
		obj.setAllergy_updated_on("allergy_updated_on");
		
		
		/*System.out.println("result::"+ rs.getString("name")+"|"+rs.getString("date")
		+"|"+rs.getString("notes")+"|"+rs.getString("reaction")+"|"+rs.getString("spnrdata")+"|"+rs.getString("treatment"));*/
		
		return obj;
	}

}
