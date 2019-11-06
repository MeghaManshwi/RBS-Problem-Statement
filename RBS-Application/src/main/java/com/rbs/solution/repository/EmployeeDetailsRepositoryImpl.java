package com.rbs.solution.repository;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.rbs.solution.entity.EmployeeDetails;
import com.rbs.solution.utility.EmployeeDetailsUtil;


@Repository
@Transactional
public class EmployeeDetailsRepositoryImpl implements EmployeeDetailsRepository{
	
	private static boolean dBAvailability=false;

	@Inject
	private DBDetailsRepository dBDetailsRepository;
	@Override
	public List<EmployeeDetails> getEmployeeDBDetails() {
		
		if(!dBAvailability) {
			dBAvailability=true;
			dBDetailsRepository.save(EmployeeDetailsUtil.getInitialDBDetails());
		}
		return (List<EmployeeDetails>) dBDetailsRepository.findAll();
	}

}
