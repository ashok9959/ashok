package com.ramit.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;


public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String pwd;
	private String cpwd;
	private String description;
	//@OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE} ,fetch = FetchType.LAZY)
   // List<UserGroup> userGroup;

}
