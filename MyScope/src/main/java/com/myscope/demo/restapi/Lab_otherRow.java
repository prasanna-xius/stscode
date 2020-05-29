package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Lab_otherRow  implements RowMapper<Lab_otherBean>{

	@Override
	public Lab_otherBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Lab_otherBean obj = new Lab_otherBean();
		obj.setLab_others_id(rs.getInt("lab_others_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("lab_others_file"));
		obj.setLab_others_saved(rs.getString("lab_others_saved"));
//		obj.setLab_others_title(rs.getString("lab_others_title"));
		obj.setLab_others_type(rs.getString("lab_others_type"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("lab_others_id")+rs.getBytes("lab_others_file")+"|"+rs.getString("lab_others_saved"));
		
		
		return obj;
	}


}
