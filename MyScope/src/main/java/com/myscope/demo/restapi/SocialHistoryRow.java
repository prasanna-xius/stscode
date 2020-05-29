package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SocialHistoryRow implements RowMapper<HabitsBean>{

	@Override
	public HabitsBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		HabitsBean obj = new HabitsBean();
		obj.setMobile_no(rs.getString("mobile_no"));
		obj.setSmoking(rs.getString("smoking"));
		obj.setSmoking_duration(rs.getString("smoking_duration"));
		obj.setTobacco(rs.getString("tobacco"));
		obj.setAlcohol(rs.getString("alcohol"));
		obj.setAlcohol_duration(rs.getString("alcohol_duration"));
		obj.setSocial_saved_on(rs.getString("social_saved_on"));
		obj.setSocial_updated_on(rs.getString("social_updated_on"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getString("smoking")
		+"|"+rs.getString("smoking_duration")+"|"+rs.getString("tobacco")+"|"+rs.getString("alcohol")+"|"+rs.getString("alcohol_duration")
		+"|"+rs.getString("social_saved_on")+"|"+rs.getString("social_updated_on"));
		return obj;
	}

}
