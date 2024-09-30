package com.ramit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ramit.Model.User;
import com.ramit.Model.UserGroup;
import com.ramit.Service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	// select all the roles
	
//
//	@GetMapping("/user/{id}") 
//	public List<User> getUserforUserId(@PathVariable Integer id){
//		return userService.getUserforUserId(id);
//	}
//	
	@GetMapping("/user")
	public List<User> getALLUser() {

		return userService.getAllUser();
	}

	
	
	
	
	@PostMapping("/addUser")
	public boolean addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	

	@PutMapping("/addUser")
	public boolean updateUser(@RequestBody User user) {
		return userService.addUser(user);
	}


}
