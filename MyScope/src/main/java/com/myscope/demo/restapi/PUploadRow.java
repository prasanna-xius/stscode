package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PUploadRow implements RowMapper<PrescriptionUploadBean>{

	@Override
	public PrescriptionUploadBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		PrescriptionUploadBean obj = new PrescriptionUploadBean();
		obj.setP_uploadid(rs.getInt("p_uploadid"));
		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
	
		obj.setDownloadfile(rs.getBytes("p_upload"));
		System.out.println("------------>"+obj.getDownloadfile());
		obj.setUpload_saved_on(rs.getString("upload_saved_on"));
		obj.setUpload_title(rs.getString("upload_title"));
		obj.setUpload_type(rs.getString("upload_type"));
		obj.setModel_name(rs.getString("model_name"));

		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("p_uploadid")+rs.getBytes("p_upload")+"|"+rs.getString("upload_saved_on")+"|"+rs.getString("upload_title"));
		
		
		return obj;
	}
	
	
	

}
