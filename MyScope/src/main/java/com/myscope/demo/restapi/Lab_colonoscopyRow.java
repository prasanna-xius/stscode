package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Lab_colonoscopyRow  implements RowMapper<Lab_colonoscopyBean>{

	@Override
	public Lab_colonoscopyBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Lab_colonoscopyBean obj = new Lab_colonoscopyBean();
		obj.setLab_colonoscopy_id(rs.getInt("lab_colonoscopy_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("lab_colonoscopy_file"));
		obj.setLab_colonoscopy_saved(rs.getString("lab_colonoscopy_saved"));
//		obj.setLab_colonoscopy_title(rs.getString("lab_colonoscopy_title"));
		obj.setLab_colonoscopy_type(rs.getString("lab_colonoscopy_type"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("lab_colonoscopy_id")+rs.getBytes("lab_colonoscopy_file")+"|"+rs.getString("lab_colonoscopy_saved"));
		
		
		return obj;
	}

}
