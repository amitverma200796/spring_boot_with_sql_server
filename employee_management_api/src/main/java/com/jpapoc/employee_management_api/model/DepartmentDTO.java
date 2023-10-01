package com.jpapoc.employee_management_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {
	
	private int id;
	
	private int empNo;

	private int deptNo;

	private String deptName;

}
