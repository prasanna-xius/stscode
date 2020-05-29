package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Lab_mriRow  implements RowMapper<Lab_mriBean>{

	@Override
	public Lab_mriBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Lab_mriBean obj = new Lab_mriBean();
		obj.setLab_mri_id(rs.getInt("lab_mri_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("lab_mri_file"));
		obj.setLab_mri_saved(rs.getString("lab_mri_saved"));
//		obj.setLab_mri_title(rs.getString("lab_mri_title"));
		obj.setLab_mri_type(rs.getString("lab_mri_type"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("lab_mri_id")+rs.getBytes("lab_mri_file")+"|"+rs.getString("lab_mri_saved"));
		
		
		return obj;
	}


}
