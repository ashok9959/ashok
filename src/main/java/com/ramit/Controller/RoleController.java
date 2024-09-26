package com.ramit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ramit.Model.Rule;
import com.ramit.Model.Workflow;
import com.ramit.Service.rolesService;

@RestController
public class RoleController {
	@Autowired
	rolesService roleService;

	// select all the roles
	@GetMapping("/roles")
	public List<Rule> getALLRoles() {

		return roleService.getAllRoles();
	}

	@GetMapping("/workflow/{id}") 
	public List<Workflow> getWorkFlowforroleId(@PathVariable Integer id){
	return roleService.getWorkFlowforRoleId(id);
	}
	
	@GetMapping("/workflow") 
	public List<Workflow> getWorkFlowf(){
	return roleService.getWorkFlow();
	}
	
	@PostMapping("/addRole")
	public boolean addRole(@RequestBody Rule role) {
		return roleService.addRole(role);
	}
	

	@PutMapping("/addRole")
	public boolean updateRole(@RequestBody Rule role) {
		return roleService.addRole(role);
	}


}
