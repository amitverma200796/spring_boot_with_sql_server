package com.jpapoc.employee_management_api.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpapoc.employee_management_api.entity.Employee;
import com.jpapoc.employee_management_api.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee emp) {
		Employee employee = employeeRepository.save(emp);
		return employee;
	}

	public Employee updateEmployee(Employee emp) {
		Employee employee = employeeRepository.findByEmpId(emp.getEmpId());
		if (Objects.nonNull(employee)) {
			employee.setEmpName(emp.getEmpName());
			employee.setEmail(emp.getEmail());
			employee.setEmpSalary(emp.getEmpSalary());
			employee.setDeptNo(emp.getDeptNo());
			return employeeRepository.save(employee);

		}
		return null;
	}

	public Employee getEmployee(int id) {
		Employee employee = employeeRepository.findByEmpId(id);
		if (Objects.nonNull(employee)) {
			return employee;
		}
		return null;
	}

	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "Employee deleted";
	}
}
