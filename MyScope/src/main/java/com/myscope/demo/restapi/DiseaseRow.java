package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import ch.qos.logback.core.net.SyslogOutputStream;

public class DiseaseRow implements RowMapper<DiseaseBean> {

	@Override
	public DiseaseBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
			DiseaseBean obj = new DiseaseBean();
			
		obj.setMobile_no(rs.getString("mobile_no"));
		obj.setKnown_condition(rs.getString("known_condition"));
		obj.setDisease_status(rs.getString("disease_status"));
		obj.setDisease_duration(rs.getString("disease_duration"));
		obj.setWhen_started(rs.getString("when_started"));
		obj.setWhen_ended(rs.getString("when_ended"));
		obj.setDisease_note(rs.getString("disease_note"));
		obj.setId(rs.getInt("disease_id"));
		obj.setDisease_save_on(rs.getString("disease_save_on"));
		obj.setDisease_updated_on(rs.getString("disease_updated_on"));
	
	
//		System.out.println("----------"+rs.getInt("disease_id"));


		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getString("known_condition")+"|"+rs.getString("disease_status")+"|"+rs.getString("disease_duration")+"|"+rs.getString("when_started")
		+"|"+rs.getString("when_ended")+"|"+rs.getString("disease_note")+rs.getInt("disease_id")
		+"|"+rs.getString("disease_save_on")+"|"+rs.getString("disease_updated_on"));
	
		return obj;
	
}
}
