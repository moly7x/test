//
package com.as1_Spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.as1_Spring.domain.User;
import com.as1_Spring.rm.UserRowMapper;

@Repository
public class UserDAOImp extends BaseDAO implements UserDAO {

	/*
	 * @see com.as1_Spring.dao.UserDAO#save(com.as1_Spring.domain.User)
	 */
	@Override
	public void save(User u) {
		String sql = "Insert Into user(name, phone, email, address, loginName, password, role, loginStatus)"
				+ "VALUES(:name, :phone, :email, :address, :loginName, :password, :role, :loginStatus)";
		Map m = new HashMap();
		m.put("name", u.getName());
		m.put("phone", u.getPhone());
		m.put("email", u.getEmail());
		m.put("address", u.getAddress());
		m.put("loginName", u.getLoginName());
		m.put("password", u.getPassword());
		m.put("role", u.getRole());
		m.put("loginStatus", u.getLoginStatus());

		KeyHolder kh = new GeneratedKeyHolder();
		SqlParameterSource ps = new MapSqlParameterSource(m);
		super.getNamedParameterJdbcTemplate().update(sql, ps, kh);
		Integer userID = kh.getKey().intValue();
		u.setUserId(userID);
	}

	/*
	 * @see com.as1_Spring.dao.UserDAO#update(com.as1_Spring.domain.User)
	 */
	@Override
	public void update(User u) {
		String sql = "UPDATE user SET name=:name, "
				+ "phone=:phone, "
				+ "email=:email, "
				+ "address=:address, "
				+ "role=:role, "
				+ "loginStatus=:loginStatus "
				+ "WHERE userID=:userID";
		Map m = new HashMap();
		m.put("name", u.getName());
		m.put("phone", u.getPhone());
		m.put("email", u.getEmail());
		m.put("address", u.getAddress());
		m.put("role", u.getRole());
		m.put("loginStatus", u.getLoginStatus());
		m.put("userID", u.getUserId());
		getNamedParameterJdbcTemplate().update(sql,m);
		
	}

	/*
	 * @see com.as1_Spring.dao.UserDAO#delete(com.as1_Spring.domain.User)
	 */
	@Override
	public void delete(User u) {
		this.delete(u.getUserId());		
	}

	/*
	 * @see com.as1_Spring.dao.UserDAO#delete(java.lang.Integer)
	 */
	@Override
	public void delete(Integer userId) {
		String sql="DELETE FROM user WHERE userID=?";
		getJdbcTemplate().update(sql, userId);
		
	}

	/*
	 * @see com.as1_Spring.dao.UserDAO#findById(java.lang.Integer)
	 */
	@Override
	public User findById(Integer userId) {
		String sql="SELECT userID, name, phone, email, address, loginName, role, loginStatus"
				+ " FROM user WHERE userId=?";
		User u =getJdbcTemplate().queryForObject(sql, new UserRowMapper(), userId);
		return u;
	}

	/*
	 * @see com.as1_Spring.dao.UserDAO#findAll()
	 */
	@Override
	public List<User> findAll() {
		String sql="SELECT userID, name, phone, email, address, loginName, role, loginStatus"
				+ " FROM user";
//		List<User> users = getJdbcTemplate().query(sql, new UserRowMapper());
//		return users;
		return getJdbcTemplate().query(sql, new UserRowMapper()); 
		
	}

	/*
	 * @see com.as1_Spring.dao.UserDAO#findByProperty(java.lang.String,
	 * java.lang.Object)
	 */
	@Override
	public List<User> findByProperty(String propName, Object propValue) {
		String sql="SELECT userID, name, phone, email, address, loginName, role, loginStatus"
				+ " FROM user WHERE " + propName +" =?";
		return getJdbcTemplate().query(sql, new UserRowMapper(), propValue);
	}

}
