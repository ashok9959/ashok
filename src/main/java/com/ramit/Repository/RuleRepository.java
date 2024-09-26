package com.ramit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramit.Model.Rule;
@Repository
public interface RuleRepository extends JpaRepository<Rule, Integer> {

}
