package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Lab_ultrasoundRow  implements RowMapper<Lab_ultrasoundBean>{

	@Override
	public Lab_ultrasoundBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Lab_ultrasoundBean obj = new Lab_ultrasoundBean();
		obj.setLab_ultrasound_id(rs.getInt("lab_ultrasound_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("lab_ultrasound_file"));
		obj.setLab_ultrasound_saved(rs.getString("lab_ultrasound_saved"));
//		obj.setLab_ultrasound_title(rs.getString("lab_ultrasound_title"));
		obj.setLab_ultrasound_type(rs.getString("lab_ultrasound_type"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("lab_ultrasound_id")+rs.getBytes("lab_ultrasound_file")+"|"+rs.getString("lab_ultrasound_saved"));
		
		
		return obj;
	}


}
