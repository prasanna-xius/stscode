package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class BmiRow implements RowMapper<BmiBean> {

	
	@Override
	public BmiBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
//		
		BmiBean obj = new BmiBean();
		
		obj.setDate_of_bmi(rs.getString("date_of_bmi"));
		obj.setWeight(rs.getString("weight"));
		obj.setHeight(rs.getString("height"));
		obj.setBmi(rs.getString("bmi"));
		obj.setBmi_notes(rs.getString("bmi_notes"));
		obj.setMobile_no(rs.getString("mobile_no"));
		obj.setBmi_save_on(rs.getString("bmi_save_on"));
		obj.setBmi_update_on(rs.getString("bmi_update_on"));
		obj.setBmi_id(rs.getInt("bmi_id"));
		
		
	
	
	
//		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getString("checkbox1")+rs.getString("checkbox2")
//		+rs.getString("checkbox3")+rs.getString("checkbox4")+rs.getString("checkbox5"));
		
		return obj;

	}
	
	
}
