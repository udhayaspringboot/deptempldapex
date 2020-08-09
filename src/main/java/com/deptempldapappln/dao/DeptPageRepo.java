package com.deptempldapappln.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.deptempldapappln.model.Department;

public interface DeptPageRepo extends PagingAndSortingRepository<Department, Integer> {

}
