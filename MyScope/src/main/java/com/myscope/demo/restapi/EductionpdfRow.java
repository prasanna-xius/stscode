package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EductionpdfRow implements RowMapper<EducationBean> {

	@Override
	public EducationBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		EducationBean obj = new EducationBean();
			//pdf 
			
			obj.setEducation_pdfsno(rs.getInt("education_pdfsno"));
//			obj.setMobile_no(rs.getString("mobile_no"));
//			obj.setDownloadfile(rs.get);
		
			obj.setDownloadpdf(rs.getBytes("education_pdf"));
//			System.out.println("------------>"+obj.getDownloadfile());
			obj.setEducation_pdftitle(rs.getString("education_pdftitle"));
			obj.setEducation_pdfsubtype(rs.getString("education_pdfsubtype"));
			return obj;
		}
			
}
		
		
