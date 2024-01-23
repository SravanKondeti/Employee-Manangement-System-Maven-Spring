package com.employeemanagement.business;

import com.employeemanagement.dto.Employee;

public interface EmployeeBusiness {

    void printEmployeeHikes();

    void insertEmployees(Employee employee);

    Employee getEmployeeById(String id);
}
