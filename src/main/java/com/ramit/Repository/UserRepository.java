package com.ramit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramit.Model.User;
import com.ramit.Model.UserGroup;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	// List<User> findByUser_UsersId(Integer id);
	
}
