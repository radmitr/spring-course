package ru.radmitr.spring.springboot.springbootrest.service;

import ru.radmitr.spring.springboot.springbootrest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
