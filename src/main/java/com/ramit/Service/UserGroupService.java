package com.ramit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramit.Model.UserGroup;
import com.ramit.Repository.UserGroupRepository;

@Service
public class UserGroupService {
	@Autowired
	UserGroupRepository userGroupRepo;
	public List<UserGroup> getUserGroupforUserId(Integer id) {
		return null ;//userGroupRepo.findByUser_UserId(id);
		
	}
	public List<UserGroup> getUserGroup() {
		return userGroupRepo.findAll();
	}
	public boolean addUserGroup(UserGroup userGroup) {
		
		return userGroupRepo.save(userGroup)!=null;
	}

}
