package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Document_dentalRow implements RowMapper<Document_dentalBean>{

	@Override
	public Document_dentalBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Document_dentalBean obj = new Document_dentalBean();
		obj.setDocument_dental_id(rs.getInt("document_dental_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("document_dental_file"));
		obj.setDocument_dental_saved_on(rs.getString("document_dental_saved_on"));
		obj.setDocument_dental_type(rs.getString("document_dental_type"));
//		obj.setDocument_dental_title(rs.getString("document_dental_title"));

		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("document_dental_id")+rs.getBytes("document_dental_file")+"|"+rs.getString("document_dental_saved_on"));
		
		
		return obj;
	}
}
