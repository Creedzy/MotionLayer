package org.cg.rest;

import java.util.List;
import java.util.ArrayList;
import org.cg.Model.User;
import org.cg.service.UserService;
import org.cg.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class UserController {
	public static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@RequestMapping(value="/user/{id}" , method=RequestMethod.GET)
	public User getUser(@PathVariable("id") String userId) {
		logger.debug("Getting user with id:{}",userId);
		User user = userService.getUser(userId);
		return user;

	}
	@RequestMapping("/user")
	public List<User> getAllUsers() {
		logger.debug("Returning all users");
		List<User> users = userService.getAllUsers();
		return users;
	}

	@RequestMapping(value="/user", method= RequestMethod.POST) 
	public User addUser(@RequestBody User user) {
		logger.debug("Preparing to add user");
		User newUser = userService.addUser(user);
		return newUser;
	}

	@RequestMapping(value="/user/{id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") String userId){
		logger.debug("Preparing to delete user with id:{}",userId);
		userService.deleteUser(userId);

	}

	@RequestMapping(value="/user/{id}", method=RequestMethod.PUT)
	public User updateUser(@PathVariable String userId,@RequestBody User user){
		logger.debug("In update user controller, updating user:{}",user);
		User updatedUser = userService.updateUser(userId,user);
		return updatedUser;
	}

}
