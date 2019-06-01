package com.jitin.mybatisspringboot.dao;

import java.util.List;

import com.jitin.mybatisspringboot.model.Address;
import com.jitin.mybatisspringboot.model.Employee;

public interface Repository {
	public Employee getEmployee(Long id);

	public List<Employee> getAllEmployees();

	public int saveEmployee(Employee employee);

	public int deleteEmployee(Long id);

	public int updateEmployee(Employee employee);
	
	public int saveAddress(Address address);
	
	public int deleteAddress(Long employeeId);
	
}
