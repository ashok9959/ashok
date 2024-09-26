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
public class Rule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer roleId;
	String roleName;
	String roleDesc;
	@ManyToMany(cascade = {CascadeType.ALL} ,fetch = FetchType.LAZY)
	List<Workflow> workflows;
	@ManyToMany(mappedBy = "roles" )
	@JsonIgnore
	@Column(nullable = true)
	List<UserGroup> userGroups;
}
