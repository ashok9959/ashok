package com.ramit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramit.Model.User;
import com.ramit.Model.UserGroup;
import com.ramit.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public List<User> getAllUser() {
		return userRepo.findAll();
	}
//	public List<User> getUserforUserId(Integer id) {
//		return userRepo.findByUser_UsersId(id);
//		
//	}
	
	public boolean addUser(User user) {
		return  userRepo.save(user)!=null;
	}

}
