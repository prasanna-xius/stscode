package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Document_educationRow implements RowMapper<Document_educationBean>{
	@Override
	public Document_educationBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Document_educationBean obj = new Document_educationBean();
		obj.setDocument_education_id(rs.getInt("document_education_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("document_education_file"));
		obj.setDocument_education_saved_on(rs.getString("document_education_saved_on"));
//		obj.setDocument_education_title(rs.getString("document_education_title"));
		obj.setDocument_education_type(rs.getString("document_education_type"));
//		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("document_education_id")+rs.getBytes("document_education_file")+"|"+rs.getString("document_education_saved_on"));
			return obj;
	}
}


