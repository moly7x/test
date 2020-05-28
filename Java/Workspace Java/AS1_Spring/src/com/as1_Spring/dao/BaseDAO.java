//
package com.as1_Spring.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

/**
 * This class is . 
 * 
 * @author: Tân
 * @create_date: 28/05/2020
 */
public class BaseDAO extends NamedParameterJdbcDaoSupport{
	@Autowired
	public void setDataSource2 (DataSource ds) {
		super.setDataSource(ds);
	}
}
