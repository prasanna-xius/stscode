package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Document_dischargeRow implements RowMapper<Document_dischargeBean>{
	@Override
	public Document_dischargeBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Document_dischargeBean obj = new Document_dischargeBean();
		obj.setDocument_discharge_id(rs.getInt("document_discharge_id"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
		obj.setDownloadfile(rs.getBytes("document_discharge_file"));
		obj.setDocument_discharge_saved_on(rs.getString("document_discharge_saved_on"));
//		obj.setDocument_discharge_title(rs.getString("dosument_discharge_title"));
		obj.setDocument_discharge_type(rs.getString("document_discharge_type"));
		
//		obj.setMedical_document_saved_on(rs.getString("medical_document_saved_on"));
//		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("medical_document_id")+rs.getBytes("medical_document_file")+"|"+rs.getString("medical_document_saved_on"));
		
		
		return obj;
	}
}
