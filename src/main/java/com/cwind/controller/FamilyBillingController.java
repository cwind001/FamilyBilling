package com.cwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cwind.entity.User;
import com.cwind.services.UserService;

@Controller
@RequestMapping("billing")
public class FamilyBillingController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/account/userList", method=RequestMethod.GET)
	@ResponseBody
	public List<User> getAllUsers() { 
		List<User> users = userService.findAll();
		return users;
	}

	@RequestMapping(value="/account/add", method=RequestMethod.PUT)
	@ResponseBody
	public List<User> addUser(@RequestBody User user){
		userService.save(user);
		List<User> users = userService.findAll();
		return users;
	}
	
	@RequestMapping(value="/account/update", method=RequestMethod.POST)
	@ResponseBody
	public List<User> updateUser(@RequestBody User user){
		userService.update(user);
		List<User> users = userService.findAll();
		return users;
	}

	@RequestMapping(value="/account/delete/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	public List<User> deleteUser(@PathVariable String id){
		if(id != null){
			userService.delete(Integer.valueOf(id));	
		}
		List<User> users = userService.findAll();
		return users;
	}
}
