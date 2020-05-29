package com.myscope.demo.restapi;


import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class GlucoseRow implements RowMapper<GlucoseBean> {
	@Override
	public GlucoseBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
//		
		GlucoseBean obj = new GlucoseBean();
		
		obj.setDate_of_test(rs.getString("date_of_test"));
		obj.setTest(rs.getString("test"));
		obj.setTest_result(rs.getString("test_result"));
		obj.setGlucose_notes(rs.getString("glucose_notes"));
		obj.setMobile_no(rs.getString("mobile_no"));
		obj.setGlucose_save_on(rs.getString("glucose_save_on"));
		obj.setGlucose_update_on(rs.getString("glucose_update_on"));
		obj.setGlucose_update_on(rs.getString("glucose_update_on"));
		
		obj.setGlucose_id(rs.getInt("glucose_id"));

		
		
		
//		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getString("checkbox1")+rs.getString("checkbox2")
//		+rs.getString("checkbox3")+rs.getString("checkbox4")+rs.getString("checkbox5"));
		
		return obj;
	}

}
