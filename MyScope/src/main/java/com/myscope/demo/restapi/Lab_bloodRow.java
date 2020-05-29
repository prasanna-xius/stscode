package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Lab_bloodRow implements RowMapper<Lab_bloodBean>{

	@Override
	public Lab_bloodBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Lab_bloodBean obj = new Lab_bloodBean();
		obj.setLab_blood_id(rs.getInt("lab_blood_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("lab_blood_file"));
		obj.setLab_blood_saved(rs.getString("lab_blood_saved"));
//		obj.setLab_blood_title(rs.getString("lab_blood_title"));
		obj.setLab_blood_type(rs.getString("lab_blood_type"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("lab_blood_id")+rs.getBytes("lab_blood_file")+"|"+rs.getString("lab_blood_saved"));
		
		
		return obj;
	}

}
