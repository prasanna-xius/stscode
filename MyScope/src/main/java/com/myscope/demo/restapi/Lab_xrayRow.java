package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Lab_xrayRow  implements RowMapper<Lab_xrayBean>{

	@Override
	public Lab_xrayBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Lab_xrayBean obj = new Lab_xrayBean();
		obj.setLab_xray_id(rs.getInt("lab_xray_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("lab_xray_file"));
		obj.setLab_xray_saved(rs.getString("lab_xray_saved"));
//		obj.setLab_xray_title(rs.getString("lab_xray_title"));
		obj.setLab_xray_type(rs.getString("lab_xray_type"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("lab_xray_id")+rs.getBytes("lab_xray_file")+"|"+rs.getString("lab_xray_saved"));
		
		
		return obj;
	}


}
