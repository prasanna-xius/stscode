package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EducationwebRow implements RowMapper<EducationBean> {

	@Override
	public EducationBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		EducationBean obj = new EducationBean();
	//weblinks
		

		obj.setEducation_websno(rs.getInt("education_websno"));
//		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
	
		obj.setEducation_weblink(rs.getString("education_weblink"));
//		System.out.println("------------>"+obj.getDownloadfile());
		obj.setEducation_webtitle(rs.getString("education_webtitle"));
		obj.setEducation_websubtype(rs.getString("education_websubtype"));
		return obj;
	}
}
