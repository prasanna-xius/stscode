package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class SurgeryRm implements RowMapper<SurgeryBean> {
	
	

	public SurgeryBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		
		SurgeryBean obj = new SurgeryBean();
		obj.setSurgeryname(rs.getString("surgeryname"));
		obj.setSurgeryhospital(rs.getString("surgeryhospital"));
		obj.setSurgerylocation(rs.getString("surgerylocation"));
		obj.setSurgerynotes(rs.getString("surgerynotes"));
		obj.setSurgeryprovider(rs.getString("surgeryprovider"));
		obj.setMobile_no(rs.getString("mobile_no"));
		obj.setSurgerydate(rs.getString("surgerydate"));
		obj.setSurgery_id(rs.getInt("surgery_id"));
		obj.setSurgery_saved_on(rs.getString("surgery_saved_on"));
		obj.setSurgery_updated_on(rs.getString("surgery_updated_on"));
	
		
		//obj.setDate(rs.getName());
		
		
		/*System.out.println("result::"+ rs.getString("name")+"|"+rs.getString("date")
		+"|"+rs.getString("notes")+"|"+rs.getString("reaction")+"|"+rs.getString("spnrdata")+"|"+rs.getString("treatment"));*/
		
		return obj;
	}

}
