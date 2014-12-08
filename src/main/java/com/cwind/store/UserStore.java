package com.cwind.store;

import java.util.List;

import com.cwind.entity.User;

/**
 * CRUD method defination for User
 * 2014/12/6
 * @author billchen01@163.com
 */

public interface UserStore {
	User get(Integer id);
	Integer save(User user);
	void update(User user);
	void delete(User user);
	void delete(Integer id);
	List<User> findAll();
}
