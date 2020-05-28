//
package com.as1_Spring.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.as1_Spring.config.SpringRootConfig;

/**
 * This class is . 
 * 
 * @author: Tân
 * @create_date: 28/05/2020
 */
public class TestDataSource {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		DataSource ds = ctx.getBean(DataSource.class);
		JdbcTemplate jt = new JdbcTemplate(ds);
		String sql="Insert into `USER`(`name`, `phone`, `email`, `address`, `loginName`, `password`) VALUES(?,?,?,?,?,?);";
		Object[] param = new Object[] {"Vikram", "0123456789", "test@gmail.com", "neu1", "v", "v123"};
		jt.update(sql, param);
		System.out.println("--------SQL executed---------");
	}
}	
