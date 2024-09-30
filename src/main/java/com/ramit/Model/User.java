package com.ramit.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 Integer userId;
	 String fName;
	 String mName;
	 String lName;
	 String pwd;
	 String cpwd;
	 String description;
	@ManyToMany(cascade = {CascadeType.ALL} ,fetch = FetchType.LAZY)
    List<UserGroup> userGroup;

}
