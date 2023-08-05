package ru.radmitr.spring.springboot.springbootrest.dao;

import ru.radmitr.spring.springboot.springbootrest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
