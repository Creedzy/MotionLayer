package org.cg.rest;

import org.cg.Model.User;
import org.cg.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
public static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
@Autowired
UserServiceImpl userService;

@RequestMapping("/user")
public User getUser() {
	
	User user = new User();
	return user;
	
}

@RequestMapping(value="/user", method= RequestMethod.POST) 
public User addUser() {
	logger.debug("Preparing to add user");
	User user = userService.addUser();
	return user;
}

}
