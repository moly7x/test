//
package com.as1_Spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.as1_Spring.config.SpringRootConfig;
import com.as1_Spring.dao.UserDAO;
import com.as1_Spring.domain.User;

public class TestUserDaoFindSingleRecord {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userDao=ctx.getBean(UserDAO.class);
		// the user details will be taken form Reg-form
		User u = userDao.findById(1);
		
		System.out.println("----- Data Details -----");
		System.out.println(u.getUserId());
		System.out.println(u.getName());
		System.out.println(u.getPhone());
		System.out.println(u.getEmail());
		System.out.println(u.getAddress());
		System.out.println(u.getLoginName());
		System.out.println(u.getLoginStatus());
		System.out.println(u.getRole());
	}
	
}
