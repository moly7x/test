//
package com.as1_Spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.as1_Spring.config.SpringRootConfig;
import com.as1_Spring.dao.UserDAO;
import com.as1_Spring.domain.User;

public class TestUserDaoUpdate {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userDao=ctx.getBean(UserDAO.class);
		// the user details will be taken form Reg-form
		User u=new User();
		u.setUserId(2);
		u.setName("Amit updated");;
		u.setPhone("7431245");
		u.setEmail("test2@mail.com");
		u.setAddress("NEU2");
		u.setRole(1);
		u.setLoginStatus(1); //active
		
		userDao.update(u);
		System.out.println("----- Data Updated -----");
	}
	
}
