package com.ramit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramit.Model.UserGroup;
@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Integer> {

	// List<UserGroup> findByUser_UserId(Integer id);

}
