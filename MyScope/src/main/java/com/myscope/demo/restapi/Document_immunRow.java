package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Document_immunRow implements RowMapper<Document_immunBean>{
	@Override
	public Document_immunBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Document_immunBean obj = new Document_immunBean();
		obj.setDocument_immunization_id(rs.getInt("document_immunization_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("document_immunization_file"));
		obj.setDocument_immunization_saved_on(rs.getString("document_immunization_saved_on"));
//		obj.setDocument_immunization_title(rs.getString("document_immunization_title"));
		obj.setDocument_immunization_type(rs.getString("document_immunization_type"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("document_immunization_id")+rs.getBytes("document_immunization_file")+"|"+rs.getString("document_immunization_saved_on"));
		
		
		return obj;
	}

}
