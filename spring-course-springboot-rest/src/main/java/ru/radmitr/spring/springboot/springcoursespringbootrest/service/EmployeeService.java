package ru.radmitr.spring.springboot.springcoursespringbootrest.service;

import ru.radmitr.spring.springboot.springcoursespringbootrest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
