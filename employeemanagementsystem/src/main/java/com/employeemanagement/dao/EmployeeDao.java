package com.employeemanagement.dao;

import java.util.List;

import com.employeemanagement.dto.Employee;

public interface EmployeeDao {

    /** Method to insert an employee */
    void insertEmployee(Employee employee);

    /** Method that returns list of Employees */
    List<Employee> findAllEmployees();

    /** Method to get an employee by Id */
    Employee getEmployeeById(String id);
    
}
