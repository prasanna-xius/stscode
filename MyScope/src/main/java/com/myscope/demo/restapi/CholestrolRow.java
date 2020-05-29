package com.myscope.demo.restapi;


import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CholestrolRow implements RowMapper<CholestrolBean> {

	@Override
	
	public CholestrolBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
//		
		CholestrolBean obj = new CholestrolBean();
		
		obj.setDate_of_cholestrol(rs.getString("date_of_cholestrol"));
		obj.setLdl(rs.getString("ldl"));
		obj.setHdl(rs.getString("hdl"));
		obj.setTrigly(rs.getString("trigly"));
		obj.setTotal_cholestrol(rs.getString("total_cholestrol"));
		obj.setOther_test(rs.getString("other_test"));
		obj.setCholestrol_notes(rs.getString("cholestrol_notes"));
		obj.setMobile_no(rs.getString("mobile_no"));
		obj.setCholestrol_id(rs.getInt("cholestrol_id"));
		obj.setCholestrol_save_on(rs.getString("cholestrol_save_on"));
		obj.setCholestrol_update_on(rs.getString("cholestrol_update_on"));
		
	
	
	
//		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getString("checkbox1")+rs.getString("checkbox2")
//		+rs.getString("checkbox3")+rs.getString("checkbox4")+rs.getString("checkbox5"));
		
		return obj;

	}
	
}
