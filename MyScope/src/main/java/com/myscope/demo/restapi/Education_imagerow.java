package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Education_imagerow implements RowMapper<EducationBean> {

	@Override
	public EducationBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		EducationBean obj = new EducationBean();
		obj.setEducation_imagesno(rs.getInt("education_imagesno"));
//		obj.setMobile_no(rs.getString("mobile_no"));
//		obj.setDownloadfile(rs.get);
	
		obj.seteducationdownloadimage(rs.getBytes("education_image"));
//		System.out.println("------------>"+obj.getDownloadfile());
		obj.setEducation_imagetitle(rs.getString("education_imagetitle"));
		obj.setEducation_imagesubtype(rs.getString("education_imagesubtype"));
//		obj.setUpload_type(rs.getString("upload_type"));

//		System.out.println("result::"+rs.getString("mobile_no")+"|"+rs.getInt("p_uploadid")+rs.getBytes("p_upload")+"|"+rs.getString("upload_saved_on")+"|"+rs.getString("upload_title"));

		
	return obj;
	}

}
