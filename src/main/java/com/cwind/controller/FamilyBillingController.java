package com.cwind.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cwind.entity.User;
import com.cwind.services.UserService;

@Controller
@RequestMapping("test")
public class FamilyBillingController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/userList", method=RequestMethod.GET)
	@ResponseBody
	public List<User> getAllUsers(HttpServletRequest request) { 
		List<User> users = userService.findAll();
		return users;
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	@ResponseBody
	public String test(HttpServletRequest request) { 
		return "success!";
	}
}
