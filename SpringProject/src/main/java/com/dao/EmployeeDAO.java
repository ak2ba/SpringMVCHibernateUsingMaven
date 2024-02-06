package com.dao;

import com.entity.Employee;

public interface EmployeeDAO {
	String insert(Employee e);
	String delete(int empid);
}
