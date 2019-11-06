package com.rbs.solution.utility;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import com.rbs.solution.entity.EmployeeDetails;

public class EmployeeDetailsUtil {
	private EmployeeDetailsUtil() {

	}

	public static List<EmployeeDetails> getInitialDBDetails() {
		List<EmployeeDetails> initialDBDetails = new ArrayList<>();

		initialDBDetails.add(new EmployeeDetails("Ram", 10000, LocalDate.of(2018, Month.OCTOBER, 15)));
		initialDBDetails.add(new EmployeeDetails("Shyam", 15000, LocalDate.of(2017, Month.OCTOBER, 15)));
		initialDBDetails.add(new EmployeeDetails("Ghanshyam", 8000, LocalDate.of(2017, Month.OCTOBER, 15)));
		initialDBDetails.add(new EmployeeDetails("Hari", 10000, LocalDate.of(2016, Month.OCTOBER, 15)));
		initialDBDetails.add(new EmployeeDetails("Ravi", 15000, LocalDate.of(2016, Month.OCTOBER, 15)));
		initialDBDetails.add(new EmployeeDetails("Vijay", 7000, LocalDate.of(2015, Month.OCTOBER, 15)));
		initialDBDetails.add(new EmployeeDetails("Ajay", 3000, LocalDate.of(2015, Month.OCTOBER, 15)));
		initialDBDetails.add(new EmployeeDetails("Akshay", 4000, LocalDate.of(2016, Month.OCTOBER, 15)));
		initialDBDetails.add(new EmployeeDetails("Manjay", 12000, LocalDate.of(2014, Month.OCTOBER, 15)));
		initialDBDetails.add(new EmployeeDetails("Ankit", 10000, LocalDate.of(2017, Month.OCTOBER, 15)));
		initialDBDetails.add(new EmployeeDetails("Akshay", 15000, LocalDate.of(2017, Month.OCTOBER, 15)));
		initialDBDetails.add(new EmployeeDetails("Hari", 8000, LocalDate.of(2011, Month.OCTOBER, 15)));

		return initialDBDetails;
	}
}
