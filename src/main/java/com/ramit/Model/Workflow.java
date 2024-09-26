package com.ramit.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Workflow {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer workFlowId;
	String workFlowDesc;
	@ManyToMany(mappedBy = "workflows" )
	@JsonIgnore
	List<Rule> roles;
}
