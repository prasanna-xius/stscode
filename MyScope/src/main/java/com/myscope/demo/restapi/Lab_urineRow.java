package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Lab_urineRow  implements RowMapper<Lab_urineBean>{

	@Override
	public Lab_urineBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Lab_urineBean obj = new Lab_urineBean();
		obj.setLab_urine_report_id(rs.getInt("lab_urine_report_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("lab_urine_report_file"));
		obj.setLab_urine_report_saved(rs.getString("lab_urine_report_saved"));
//		obj.setLab_urine_report_title(rs.getString("lab_urine_report_title"));
		obj.setLab_urine_report_type(rs.getString("lab_urine_report_type"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("lab_urine_report_id")+rs.getBytes("lab_urine_report_file")+"|"+rs.getString("lab_urine_report_saved"));
		
		
		return obj;
	}


}
