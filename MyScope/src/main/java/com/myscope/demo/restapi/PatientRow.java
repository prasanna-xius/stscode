package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.myscope.demo.restapi.PatientBean;

public class PatientRow implements RowMapper<PatientBean> {

	@Override
	public PatientBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
			PatientBean obj = new PatientBean();
		
		obj.setFirst_name(rs.getString("first_name"));
		obj.setLast_name(rs.getString("last_name"));
		obj.setMobile(rs.getString("mobile_no"));
		obj.setEmail(rs.getString("email"));
//		obj.setModule_name(rs.getString("module_name"));

		System.out.println("result::"+rs.getString("first_name")+"|"+rs.getString("last_name")+"|"+rs.getString("mobile_no")+"|"+rs.getString("email"));
//		+"|"+rs.getString("module_name"));
	
		return obj;
	}
	

}
