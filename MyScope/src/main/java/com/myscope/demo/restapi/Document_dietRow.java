package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Document_dietRow implements RowMapper<Document_dietBean>{
	@Override
	public Document_dietBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Document_dietBean obj = new Document_dietBean();
		obj.setDocument_diet_id(rs.getInt("document_diet_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("document_diet_file"));
		obj.setDocument_diet_saved_on(rs.getString("document_diet_saved_on"));
//		obj.setDocument_diet_title(rs.getString("document_diet_title"));
		obj.setDocument_diet_type(rs.getString("document_diet_type"));

		
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("document_diet_id")+rs.getBytes("document_diet_file")+"|"+rs.getString("document_diet_saved_on"));
		
		
		return obj;
	}
}
