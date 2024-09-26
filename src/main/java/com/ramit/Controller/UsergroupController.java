package com.ramit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ramit.Model.UserGroup;
import com.ramit.Service.UserGroupService;

@RestController
public class UsergroupController {
	@Autowired
	UserGroupService userGroupService;
	
	@GetMapping("/userGroup/{id}") 
	public List<UserGroup> getUserGroupforUserId(@PathVariable Integer id){
	return userGroupService .getUserGroupforUserId(id);
	}
	
	@GetMapping("/userGroup") 
	public List<UserGroup> getUserGroup(){
	return userGroupService.getUserGroup();
	}

	@PostMapping("/addUserGroup")
	public boolean addUserGroup(@RequestBody UserGroup userGroup) {
		return userGroupService.addUserGroup(userGroup);
	}
	
	@PutMapping("/addUserGroup")
	public boolean updateUserGroup(@RequestBody UserGroup userGroup) {
		return userGroupService.addUserGroup(userGroup);
	}


}
