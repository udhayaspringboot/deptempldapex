package com.deptempldapappln.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.deptempldapappln.model.Department;
import com.deptempldapappln.model.Employee;
@Repository
public class DeptEmpDaoImpl implements DeptEmpDao{

	
	@Autowired
	DeptRepo deptRepo;
	@Autowired
	DeptPageRepo deptPage;
	@Autowired
	EmpRepo empRepo;
	
	@Override
	public boolean createDept(Department dept) {
		deptRepo.save(dept);
		return false;
	}

	@Override
	public boolean updateDept(Department dept) {
		deptRepo.save(dept);
		return false;
	}

	@Override
	public List<Department> readAllDept() {
		List<Department> lDept = (List<Department>) deptRepo.findAll();
		return lDept;
	}
	
	@Override
	public Page<Department> readAllDeptPage(Pageable pageable) {
		Page<Department> lDept = (Page<Department>) deptPage.findAll(pageable);
		return lDept;
	}

	@Override
	public boolean delteDept(String deptId) {
		deptRepo.deleteByDeptId(deptId);
		//deptRepo.deleteAll(deptId);
		return false;
	}

	@Override
	public boolean createEmp(Employee employee) {
		empRepo.save(employee);
		return false;
	}

	@Override
	public boolean updateEmp(Employee employee) {
		empRepo.save(employee);
		return false;
	}

	@Override
	public List<Employee> readEmpFromDept(int deptId) {
		List<Employee> lEmp = empRepo.findByDepartment(deptId);
		return lEmp;
	}

	@Override
	public boolean deleteEmpFromDept(int deptId, int empId) {
		System.out.println("values at dao impl "+" dept id "+deptId + " empId" +empId);
		empRepo.deleteByEmpIdAndDepartment(empId,deptId);
		return false;
	}

	
	
	
	

}
