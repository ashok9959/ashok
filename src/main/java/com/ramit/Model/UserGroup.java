package com.ramit.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
@Entity
@Data
public class UserGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer UserGroupid;
	private String userGroupname;
	private String description;
	@ManyToMany(cascade = {CascadeType.MERGE} ,fetch = FetchType.LAZY )
	List<Rule>roles;
	@ManyToMany(mappedBy = "userGroup" )
	@JsonIgnore
	@Column(nullable = true)
	List<User> user;
	

}
