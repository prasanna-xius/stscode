package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FamilyRow implements RowMapper<FamilyBean>  {

	@Override
	public FamilyBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		FamilyBean obj = new FamilyBean();
		obj.setFamily_condition(rs.getString("family_condition"));
		obj.setRelationship(rs.getString("relationship"));
		obj.setFamily_note(rs.getString("family_note"));
		obj.setMobile_no(rs.getString("mobile_no"));
		obj.setFamilyid(rs.getInt("family_id"));
		obj.setFamily_save_on(rs.getString("family_saved_on"));
		obj.setFamily_updated_on(rs.getString("family_updated_on"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getString("family_condition")+"|"+
		rs.getString("relationship")+"|"+rs.getString("family_note")+"|"+rs.getInt("family_id")
		+"|"+rs.getString("family_saved_on")+"|"+rs.getString("family_updated_on"));
		return obj;
	}

}
