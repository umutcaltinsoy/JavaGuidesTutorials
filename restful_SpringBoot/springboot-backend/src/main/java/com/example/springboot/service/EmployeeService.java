package com.example.springboot.service;

import com.example.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    // get all emp.
    List<Employee> getAllEmployees();
    // get emp. by id
    Employee getEmployeeById(long id);
    // update emp.
    Employee updateEmployee(Employee employee, long id);
    // delete emp
    void deleteEmployee(long id);

}
