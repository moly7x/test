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

import com.as1_Spring.domain.Contact;
import com.as1_Spring.rm.ContactRowMapper;

@Repository
public class ContactDAOImp extends BaseDAO implements ContactDAO {

	/*
	 * @see com.as1_Spring.dao.ContactDAO#save(com.as1_Spring.domain.Contact)
	 */
	@Override
	public void save(Contact c) {
		String sql = "INSERT INTO contact (userId, name, phone, email, address, remark) VALUES(:userId, :name, :phone, :email, :address, :remark)";
		Map m = new HashMap();
		m.put("userId", c.getUserID());
		m.put("name", c.getName());
		m.put("phone", c.getPhone());
		m.put("email", c.getEmail());
		m.put("address", c.getAddress());
		m.put("remark", c.getRemark());
		SqlParameterSource ps = new MapSqlParameterSource(m);
		KeyHolder kh = new GeneratedKeyHolder();
		getNamedParameterJdbcTemplate().update(sql, ps, kh);
		c.setContactId(kh.getKey().intValue());
	}

	/*
	 * @see com.as1_Spring.dao.ContactDAO#update(com.as1_Spring.domain.Contact)
	 */
	@Override
	public void update(Contact c) {
		String sql = "UPDATE INTO contact SET userId=:userId, name=:name, phone=:phone, email=:email, address=:address, remark=:remark WHERE contactId=:contactId";
		Map m = new HashMap();
		m.put("contactId", c.getContactId());
		m.put("name", c.getName());
		m.put("phone", c.getPhone());
		m.put("email", c.getEmail());
		m.put("address", c.getAddress());
		m.put("remark", c.getRemark());
		getNamedParameterJdbcTemplate().update(sql, m);
	}

	/*
	 * @see com.as1_Spring.dao.ContactDAO#delete(com.as1_Spring.domain.Contact)
	 */
	@Override
	public void delete(Contact c) {
		this.delete(c.getContactId());
	}

	/*
	 * @see com.as1_Spring.dao.ContactDAO#delete(java.lang.Integer)
	 */
	@Override
	public void delete(Integer contactID) {
		String sql = "DELETE FROM contact WHERE contactId=?";
		getJdbcTemplate().update(sql, contactID);
	}

	/*
	 * @see com.as1_Spring.dao.ContactDAO#findById(java.lang.Integer)
	 */
	@Override
	public Contact findById(Integer contactID) {
		String sql = "SELECT contactId, userId, name, phone, email, address, remark FROM contact WHERE contactId=?";
		return getJdbcTemplate().queryForObject(sql, new ContactRowMapper(), contactID);

	}

	/*
	 * @see com.as1_Spring.dao.ContactDAO#findAll()
	 */
	@Override
	public List<Contact> findAll() {
		String sql = "SELECT contactId, userId, name, phone, email, address, remark FROM contact";
		return getJdbcTemplate().query(sql, new ContactRowMapper());
	}

	/*
	 * @see com.as1_Spring.dao.ContactDAO#findByProperty(java.lang.String,
	 * java.lang.Object)
	 */
	@Override
	public List<Contact> findByProperty(String propName, Object propValue) {
		String sql = "SELECT contactId, userId, name, phone, email, address, remark FROM contact WHERE " + propName
				+ "=?";
		return getJdbcTemplate().query(sql, new ContactRowMapper(), propValue);
	}

}
