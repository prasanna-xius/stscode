package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DietRow implements RowMapper<HabitsBean>{

	@Override
	public HabitsBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		HabitsBean obj = new HabitsBean();
		obj.setDiet(rs.getString("diet"));
		obj.setSpl_diet_notes(rs.getString("spl_diet_notes"));
		obj.setMobile_no(rs.getString("mobile_no"));
		obj.setDiet_saved_on(rs.getString("diet_saved_on"));
		obj.setDiet_updated_on(rs.getString("diet_updated_on"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getString("diet")
		+"|"+rs.getString("diet_saved_on")+"|"+rs.getString("diet_updated_on"));
		
		
		return obj;
	}

}
