package com.ramit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramit.Model.Workflow;
@Repository
public interface WorkflowRepository extends JpaRepository<Workflow, Integer> {
	List<Workflow> findByRoles_RoleId(Integer id);

}
