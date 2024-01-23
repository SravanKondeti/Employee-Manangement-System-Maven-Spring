package com.employeemanagement.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employeemanagement.dao.EmployeeDao;
import com.employeemanagement.dto.Employee;

public class EmployeeBusinessImpl implements EmployeeBusiness {

    @Autowired
    private EmployeeDao employeeDao;

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    /** Print the hikes of employees */
    public void printEmployeeHikes() {
        
        /** Ask dao for employee data */
        List<Employee> employees= employeeDao.findAllEmployees();

        /** Conditions based on request*/
        if(employees!=null){
            for(Employee employee: employees){
                if(employee.getExp()>=15){
                    System.out.println("Employee "+employee.getName()+" with Id: "+employee.getId()+", got hike of 30%");
                }
                else if(employee.getExp()>=10){
                    System.out.println("Employee "+employee.getName()+" with Id: "+employee.getId()+", got hike of 25%");
                }
                else if(employee.getExp()>=5){
                    System.out.println("Employee "+employee.getName()+" with Id: "+employee.getId()+", got hike of 20%");
                }
                else{
                    System.out.println("Employee "+employee.getName()+" with Id: "+employee.getId()+", got hike of 15%");
                }
            }
        }

    }

   
    public void insertEmployees(Employee employee) {

        employeeDao.insertEmployee(employee);
    }

    public Employee getEmployeeById(String id) {
        
        return employeeDao.getEmployeeById(id);
    }

}
