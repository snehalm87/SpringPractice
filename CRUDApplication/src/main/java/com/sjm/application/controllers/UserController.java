package com.sjm.application.controllers;

import org.springframework.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sjm.application.model.User;
import com.sjm.application.service.interfaces.UserService;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@ResponseBody
	@RequestMapping(value="/user",method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public String createNewUser(@RequestParam("userId")String userId,@RequestParam("username")String username,@RequestParam("address")String address) {
		User user = new User(userId,username,address);
		return userService.saveUser(user);
			
	}
}
