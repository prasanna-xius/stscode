package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Lab_ecgRow  implements RowMapper<Lab_ecgBean>{

	@Override
	public Lab_ecgBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Lab_ecgBean obj = new Lab_ecgBean();
		obj.setLab_ecg_id(rs.getInt("lab_ecg_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("lab_ecg_file"));
		obj.setLab_ecg_saved(rs.getString("lab_ecg_saved"));
//		obj.setLab_ecg_title(rs.getString("lab_ecg_title"));
		obj.setLab_ecg_type(rs.getString("lab_ecg_type"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("lab_ecg_id")+rs.getBytes("lab_ecg_file")+"|"+rs.getString("lab_ecg_saved"));
		
		
		return obj;
	}

}
