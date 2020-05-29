package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmotionalRow implements RowMapper<EmotionalBean> {

	@Override
	public EmotionalBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		EmotionalBean obj = new EmotionalBean();
			
		obj.setMobile_no(rs.getString("mobile_no"));
		obj.setScore_of_wellness(rs.getString("score_of_wellness"));
		obj.setEmotional_status(rs.getString("emotional_status"));
		obj.setDuration(rs.getString("duration"));
		obj.setAny_emotional_trauma(rs.getString("any_emotional_trauma"));
		obj.setReason_of_trauma(rs.getString("reason_of_trauma"));
		obj.setEmotional_id(rs.getInt("emotional_id"));
		obj.setEmotional_saved_on(rs.getString("emotional_saved_on"));
		obj.setEmotional_updated_on(rs.getString("emotional_updated_on"));
	
	

//		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getString("known_condition")+"|"+rs.getString("disease_status")+"|"+rs.getString("disease_duration")+"|"+rs.getString("when_started")
//		+"|"+rs.getString("when_ended")+"|"+rs.getString("disease_note")+rs.getInt("disease_id")
//		+"|"+rs.getString("disease_save_on")+"|"+rs.getString("disease_updated_on"));
	
		return obj;
	
}
	
}
