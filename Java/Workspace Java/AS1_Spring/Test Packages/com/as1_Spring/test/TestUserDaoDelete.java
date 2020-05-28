//
package com.as1_Spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.as1_Spring.config.SpringRootConfig;
import com.as1_Spring.dao.UserDAO;
import com.as1_Spring.domain.User;

public class TestUserDaoDelete {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userDao=ctx.getBean(UserDAO.class);
		// the user details will be taken form Reg-form
		userDao.delete(2);
		System.out.println("----- Data Delete -----");
	}
	
}
