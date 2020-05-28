//
package com.as1_Spring.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.as1_Spring.domain.User;

/**
 * This class is . 
 * 
 * @author: Tân
 * @create_date: 28/05/2020
 */
public class UserRowMapper implements RowMapper<User>{

	/* 
	* @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	*/
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User u=new User();
		u.setUserId(rs.getInt("userId"));
		u.setName(rs.getString("name"));
		u.setPhone(rs.getString("phone"));
		u.setEmail(rs.getString("email"));
		u.setAddress(rs.getString("address"));
		u.setLoginName(rs.getString("loginName"));
		u.setRole(rs.getInt("role"));
		u.setLoginStatus(rs.getInt("loginStatus"));
		return u;
	}
	
	
}
