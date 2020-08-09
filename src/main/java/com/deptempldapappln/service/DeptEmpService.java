package com.deptempldapappln.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.deptempldapappln.model.Department;
import com.deptempldapappln.model.Employee;

@Service
public interface DeptEmpService {
	
	//create a department
		boolean createDeptServ(Department dept);
		//update a department
		boolean updateDeptServ(Department dept);
		//Get All Department
	    List<Department> readAllDeptServ();
	    //delete department with all associated employees
	    boolean delteDeptServ(String depIds);
	    //Create Employee With Associate Department id
	    boolean createEmpServ(Employee employee);
	    //Update employee details with in department
	    boolean updateEmpServ(Employee employee);
	    // Get all employees based on department id
	    List<Employee> readEmpFromDeptServ(int empId);
	    //delete employee in department
	    boolean deleteEmpFromDeptServ(int deptId,int empId);
	    Page<Department> readAllDeptPage(Pageable pageable);
	   


}
