package com.rbs.solution.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.rbs.solution.entity.EmployeeDetails;
import com.rbs.solution.repository.EmployeeDetailsRepository;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService{

	@Inject
	private EmployeeDetailsRepository employeeDetailsRepository;
	@Override
	public List<EmployeeDetails> getAllEmployeeDetails(String sortingParameter,String order) {
		List<EmployeeDetails> dbDetails=employeeDetailsRepository.getEmployeeDBDetails();
		Collections.sort(dbDetails,getCustomComparator(sortingParameter,order));
		return dbDetails;
	}
	private Comparator<EmployeeDetails> getCustomComparator(String sortingParameter,String order) {
		Comparator<EmployeeDetails> customComparator=null;
		switch (sortingParameter) {
		case "name":
		case "NAME":
			customComparator=(e1,e2)->e1.getEmpName().compareTo(e2.getEmpName());
			break;
		case "hiringDate":
		case "HIRINGDATE":
			customComparator=(e1,e2)->e1.getHiringDate().compareTo(e2.getHiringDate());
			break;
		case "salary":
		case "SALARY":
			customComparator=(e1,e2)->Long.compare(e1.getEmpSalary(),e2.getEmpSalary());
			break;
		default:
			customComparator=(e1,e2)->Integer.compare(e1.getEmpId(),e2.getEmpId());
			break;
		}
		return ("reverse").equalsIgnoreCase(order)?customComparator.reversed():customComparator;
	}

}
