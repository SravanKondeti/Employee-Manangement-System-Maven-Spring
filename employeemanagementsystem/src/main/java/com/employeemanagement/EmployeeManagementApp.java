package com.employeemanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.employeemanagement.business.EmployeeBusiness;
import com.employeemanagement.business.EmployeeBusinessImpl;
//import com.employeemanagement.dto.Employee;

/**
Main program to run the entire application using the implemented methods
 */
public class EmployeeManagementApp 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new FileSystemXmlApplicationContext("F:\\Sravan\\Projects\\employeemanagementsystem\\src\\main\\java\\resources\\configmetadata.xml");
        
        EmployeeBusiness employeeBusiness= (EmployeeBusinessImpl) context.getBean("employeeBusiness");

        /** To insert the employees 
         * Provide the details of the employee at '?' 
         * **/
    
        //Employee emp=new Employee("?","?",?);
        //employeeBusiness.insertEmployees(emp);
        
        /**To print all the empolyees with their hike **/

        employeeBusiness.printEmployeeHikes();

        /** To get the details of an employee by Id **/

        /** 
        Employee employee=null;

        try {
            employee=employeeBusiness.getEmployeeById("?");
        } catch (Exception e) {
            
        }

        if(employee!=null)
            System.out.println(employee.toString());
        else{
            System.out.println("No Matching Records Found");
        }
        **/
    }
}
