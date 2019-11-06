package com.rbs.solution.service;

import java.util.List;

import com.rbs.solution.entity.EmployeeDetails;

public interface EmployeeDetailsService {

	List<EmployeeDetails> getAllEmployeeDetails(String sortingParameter,String order);

}
