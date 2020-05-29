package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Lab_echoRow  implements RowMapper<Lab_echoBean>{

	@Override
	public Lab_echoBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Lab_echoBean obj = new Lab_echoBean();
		obj.setLab_echo_id(rs.getInt("lab_echo_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("lab_echo_file"));
		obj.setLab_echo_saved(rs.getString("lab_echo_saved"));
//		obj.setLab_echo_title(rs.getString("lab_echo_title"));
		obj.setLab_echo_type(rs.getString("lab_echo_type"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("lab_echo_id")+rs.getBytes("lab_echo_file")+"|"+rs.getString("lab_echo_saved"));
		
		
		return obj;
	}
 

}
