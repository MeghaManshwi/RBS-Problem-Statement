package com.rbs.solution.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rbs.solution.entity.EmployeeDetails;

@Repository
public interface DBDetailsRepository extends CrudRepository<EmployeeDetails, Integer>{

}
