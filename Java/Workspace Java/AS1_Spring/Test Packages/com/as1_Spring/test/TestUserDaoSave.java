//
package com.as1_Spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.as1_Spring.config.SpringRootConfig;
import com.as1_Spring.dao.UserDAO;
import com.as1_Spring.domain.User;

public class TestUserDaoSave {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userDao=ctx.getBean(UserDAO.class);
		// the user details will be taken form Reg-form
		User u=new User();
		u.setName("Amit");;
		u.setPhone("0123456783");
		u.setEmail("test2@mail.com");
		u.setAddress("NEU2");
		u.setLoginName("amit");
		u.setPassword("amit123");
		u.setRole(1);
		u.setLoginStatus(1); //active
		userDao.save(u);
		System.out.println("----- Data Save -----");
	}
	
}
