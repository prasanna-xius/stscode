package com.myscope.demo.restapi;


import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PressureRow implements RowMapper<PressureBean>{

	@Override
	public PressureBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
//		
		PressureBean obj = new PressureBean();
		
		obj.setDate_of_pressure(rs.getString("date_of_pressure"));
		obj.setSystolic(rs.getString("systolic"));
		obj.setPulse(rs.getString("pulse"));
		obj.setDiastrlic(rs.getString("diastrlic"));
		obj.setHeart_rate(rs.getString("heart_rate"));
		obj.setIrregular_heart_beat(rs.getString("irregular_heart_beat"));
		obj.setPressure_notes(rs.getString("pressure_notes"));
		obj.setMobile_no(rs.getString("mobile_no"));
		obj.setPressure_id(rs.getInt("pressure_id"));
		obj.setPressure_save_on(rs.getString("pressure_save_on"));
		obj.setPressure_update_on(rs.getString("pressure_update_on"));
		
	
	
	
//		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getString("checkbox1")+rs.getString("checkbox2")
//		+rs.getString("checkbox3")+rs.getString("checkbox4")+rs.getString("checkbox5"));
		
		return obj;

	}	
}
