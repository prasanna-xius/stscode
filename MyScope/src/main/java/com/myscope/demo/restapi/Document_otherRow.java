package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Document_otherRow implements RowMapper<Document_otherBean>{
	@Override
	public Document_otherBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Document_otherBean obj = new Document_otherBean();
		obj.setDocument_other_id(rs.getInt("document_other_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("document_other_file"));
		obj.setDocument_other_saved_on(rs.getString("document_other_saved_on"));
//		obj.setDocument_other_title(rs.getString("document_other_title"));
		obj.setDocument_other_type(rs.getString("document_other_type"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("document_other_id")+rs.getBytes("document_other_file")+"|"+rs.getString("document_other_saved_on"));
		
		
		return obj;
	}

}
