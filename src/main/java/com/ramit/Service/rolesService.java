package com.ramit.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramit.Model.Rule;
import com.ramit.Model.Workflow;
import com.ramit.Repository.RuleRepository;
import com.ramit.Repository.WorkflowRepository;

@Service
public class rolesService {
	@Autowired
	RuleRepository ruleRepo;
	@Autowired
	WorkflowRepository workflowRepo;
	
	public List<Rule> getAllRoles() {
		return ruleRepo.findAll();
	}	
	
	public boolean addRole(Rule role) {
		return  ruleRepo.save(role)!=null;
	}
	public List<Workflow> getWorkFlowforRoleId(Integer id) {
		return workflowRepo.findByRoles_RoleId(id);
		
	}
	
	public List<Workflow> getWorkFlow() {
		return workflowRepo.findAll();

	}

	
	
	

}
