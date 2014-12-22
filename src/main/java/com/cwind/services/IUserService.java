package com.cwind.services;

import java.util.List;

import com.cwind.entity.User;

public interface IUserService {
	public User get(Integer id);
	public Integer save(User user);
	public void update(User user);
	public void delete(User user);
	public void delete(Integer id);
	public List<User> findAll();
}
