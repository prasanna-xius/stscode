package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Lab_ctscanRow implements RowMapper<Lab_ctscanBean>{

	@Override
	public Lab_ctscanBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Lab_ctscanBean obj = new Lab_ctscanBean();
		obj.setLab_ctscan_id(rs.getInt("lab_ctscan_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("lab_ctscan_file"));
		obj.setLab_ctscan_saved(rs.getString("lab_ctscan_saved"));
//		obj.setLab_ctscan_title(rs.getString("lab_ctscan_title"));
		obj.setLab_ctscan_type(rs.getString("lab_ctscan_type"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("lab_ctscan_id")+rs.getBytes("lab_ctscan_file")+"|"+rs.getString("lab_ctscan_saved"));
		
		
		return obj;
	} 

}
