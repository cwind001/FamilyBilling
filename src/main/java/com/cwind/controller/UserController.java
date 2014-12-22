package com.cwind.controller;

import java.util.Calendar;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cwind.entity.User;
import com.cwind.meta.Meta;
import com.cwind.meta.UserRole;
import com.cwind.services.UserServiceImpl;
import com.cwind.util.CipherUtils;

@Controller
@RequestMapping(value="user")
public class UserController {

	@Resource
	private UserServiceImpl userService;
	
	@RequestMapping(params="command=newUser")
	public ModelAndView newUserExec(HttpServletRequest request,HttpServletResponse response){
        String pass1 = (String) request.getParameter("pass1");
		String pass2 = (String) request.getParameter("pass2");
		ModelAndView mv = new ModelAndView("/user/userCreated");
		if(!isValidPassword(pass1, pass2)){
			mv.addObject(Meta.RESULT(), "Invalid password!");
			return mv;
		}
		String userName = (String) request.getParameter(Meta.USER_NAME());
		String email = (String) request.getParameter(Meta.EMAIL());
        User user = new User(userName, email, UserRole.ROLE_ADMIN);
        user.setPassword(CipherUtils.generatePassword(pass1));
        user.setCreated(Calendar.getInstance().getTime());
        userService.save(user);
        
        mv.addObject(Meta.RESULT(), "User created successfully: " + userName + ", " +email);
        return mv;
    }
	
	private boolean isValidPassword(String pass1, String pass2){
		if(pass1 == null||pass2 == null){
			return false;
		}
		return pass1.equals(pass2);
	}
}
