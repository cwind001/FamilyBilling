package com.cwind.services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cwind.meta.UserRole;
import com.cwind.services.UserService;
import com.cwind.entity.User;

public class TestUserService {
	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				new String[] { "src/main/resources/applicationContext.xml" });

		UserService us = (UserService) context.getBean("UserService");

//		User tmpUser;
		User tmpUser = new User("Billy", "billy.chen@angel.com", UserRole.ROLE_ADMIN);
		tmpUser.setPassword("123");
		us.save(tmpUser);
		
		List<User> userlist = us.findAll();
		for (int i = 0; i < userlist.size(); i++) {
			tmpUser = userlist.get(i);
			System.out.println(tmpUser.getUsername() + ", "
					+ tmpUser.getCreated());
		}
	}
}
