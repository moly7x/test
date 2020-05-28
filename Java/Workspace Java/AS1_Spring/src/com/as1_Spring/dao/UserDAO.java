//
package com.as1_Spring.dao;

import java.util.List;

import com.as1_Spring.domain.User;

/**
 * This class is .
 * 
 * @author: Tân
 * @create_date: 28/05/2020
 */
public interface UserDAO {
	public void save(User u);

	public void update(User u);

	public void delete(User u);

	public void delete(Integer userID);

	public User findById(Integer userId);

	public List<User> findAll();

	public List<User> findByProperty(String propName, Object propValue);
}
