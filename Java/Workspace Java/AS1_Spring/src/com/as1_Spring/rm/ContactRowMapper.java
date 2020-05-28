//
package com.as1_Spring.rm;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.as1_Spring.domain.Contact;

/**
 * This class is . 
 * 
 * @author: Tân
 * @create_date: 28/05/2020
 */
public class ContactRowMapper implements RowMapper<Contact>{

	/* 
	* @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	*/
	@Override
	public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contact c=new Contact();
		c.setContactId(rs.getInt("contactId"));
		c.setUserID(rs.getInt("userId"));
		c.setName(rs.getString("name"));
		c.setEmail(rs.getString("email"));
		c.setAddress(rs.getString("address"));
		c.setPhone(rs.getString("phone"));		
		c.setRemark(rs.getString("remark"));
		return c;
	}
	
	
}
