package com.employeemanagement.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.employeemanagement.dao.rowmappers.EmployeeRowMapper;
import com.employeemanagement.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() { 
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //Insert new employee details into DB
    public void insertEmployee(Employee employee) {

        /** SQL query to insert values in to Database */
        //String sql= "insert into employee('"+employee.getId()+"','"+employee.getName()+"',"+employee.getExp()+")";
        

        /** We can also use below format instead of above */
        String sql= "insert into employee values(?,?,?)";

        jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getExp());
    }

    /** Get list of all the employees */
    public List<Employee> findAllEmployees() {

        EmployeeRowMapper rowMapper=new EmployeeRowMapper();
        List<Employee> employees=jdbcTemplate.query("select * from employee  where exp>?",rowMapper,5);
        return employees;
    }

    /** Get only a particular employee based on Id */
    public Employee getEmployeeById(String id) {
        
        EmployeeRowMapper rowMapper=new EmployeeRowMapper();
        Employee employee=jdbcTemplate.queryForObject("select * from employee where id=?",rowMapper,id);

        return employee;
    }
    
}
