package com.rbs.solution.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "table_employee_details")
public class EmployeeDetails {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	@Column
	private String empName;
	@Column
	private long empSalary;
	@Column
	private LocalDate hiringDate;

	public EmployeeDetails(String empName, long empSalary, LocalDate hiringDate) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.hiringDate = hiringDate;
	}

	public EmployeeDetails() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	@JsonIgnore
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}

	public LocalDate getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(LocalDate hiringDate) {
		this.hiringDate = hiringDate;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", hiringDate="
				+ hiringDate + "]";
	}

}
