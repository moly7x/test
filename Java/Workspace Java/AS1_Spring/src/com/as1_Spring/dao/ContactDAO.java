//
package com.as1_Spring.dao;

import java.util.List;

import com.as1_Spring.domain.Contact;

/**
 * This class is .
 * 
 * @author: Tân
 * @create_date: 28/05/2020
 */
public interface ContactDAO {
	public void save(Contact c);

	public void update(Contact c);

	public void delete(Contact c);

	public void delete(Integer contactID);

	public Contact findById(Integer contactID);

	public List<Contact> findAll();

	public List<Contact> findByProperty(String propName, Object propValue);
}
