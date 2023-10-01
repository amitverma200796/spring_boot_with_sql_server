package com.jpapoc.employee_management_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpapoc.employee_management_api.entity.Employee;
import com.jpapoc.employee_management_api.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save/employee")
	public Employee createNewEmployee(@RequestBody Employee emp) {
		return employeeService.saveEmployee(emp);
	}

	@PutMapping("/update/employee")
	public Employee updateNewEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmployee(emp);
	}

	@GetMapping("/get/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}

	@DeleteMapping("/delete/employee/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		return employeeService.deleteEmployee(id);

	}
}

