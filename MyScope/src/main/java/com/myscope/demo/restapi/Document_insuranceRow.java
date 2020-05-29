package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Document_insuranceRow implements RowMapper<Document_insuranceBean>{
	@Override
	public Document_insuranceBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Document_insuranceBean obj = new Document_insuranceBean();
		obj.setDocument_insurance_id(rs.getInt("document_insurance_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("document_insurance_file"));
		obj.setDocument_insurance_saved_on(rs.getString("document_insurance_saved_on"));
		obj.setDocument_insurance_type(rs.getString("document_insurance_type"));
		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("document_insurance_id")+rs.getBytes("document_insurance_file")+"|"+rs.getString("document_insurance_saved_on"));
		
		
		return obj;
	}
}
