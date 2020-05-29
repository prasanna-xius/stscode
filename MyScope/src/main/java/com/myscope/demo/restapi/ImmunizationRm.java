package com.myscope.demo.restapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class ImmunizationRm implements RowMapper<ImmunBean> {
	
	

	public ImmunBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		
		ImmunBean obj = new ImmunBean();
		obj.setImmuname(rs.getString("immuname"));
		obj.setImmunotes(rs.getString("immunotes"));
		obj.setImmuevent(rs.getString("immuevent"));
		obj.setImmubrand(rs.getString("immubrand"));
		obj.setImmudate(rs.getString("immudate"));
		obj.setMobile_no(rs.getString("mobile_no"));
		obj.setImmun_id(rs.getInt("immun_id"));
		obj.setImmun_saved_on(rs.getString("immun_saved_on"));
		obj.setImmun_updated_on(rs.getString("immun_updated_on"));
		
		//obj.setDate(rs.getName());
		
		
		/*System.out.println("result::"+ rs.getString("name")+"|"+rs.getString("date")
		+"|"+rs.getString("notes")+"|"+rs.getString("reaction")+"|"+rs.getString("spnrdata")+"|"+rs.getString("treatment"));*/
		
		return obj;
	}

}
