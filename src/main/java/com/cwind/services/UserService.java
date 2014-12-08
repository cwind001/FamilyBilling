package com.cwind.services;

import java.util.List;

import com.cwind.entity.User;
import com.cwind.store.UserStore;

public class UserService {
	private UserStore userStore;

	public UserStore getUserStore() {
		return userStore;
	}

	public void setUserStore(UserStore userStore) {
		this.userStore = userStore;
	}

	public User get(Integer id){
		return userStore.get(id);
	}
	
	public Integer save(User user){
		return userStore.save(user);
	}
	
	public void update(User user){
		userStore.update(user);
	}
	
	public void delete(User user){
		userStore.delete(user);
	}
	
	public void delete(Integer id){
		userStore.delete(id);
	}
	
	public List<User> findAll(){
		return userStore.findAll();
	}
}
