package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Lab_stressRow  implements RowMapper<Lab_stressBean>{

	@Override
	public Lab_stressBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Lab_stressBean obj = new Lab_stressBean();
		obj.setLab_stresstest_id(rs.getInt("lab_stresstest_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("lab_stresstest_file"));
		obj.setLab_stresstest_saved(rs.getString("lab_stresstest_saved"));
//		obj.setLab_stresstest_title(rs.getString("lab_stresstest_title"));
		obj.setLab_stresstest_type(rs.getString("lab_stresstest_type"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("lab_stresstest_id")+rs.getBytes("lab_stresstest_file")+"|"+rs.getString("lab_stresstest_saved"));
		
		
		return obj;
	}

}
