package ru.radmitr.spring.springboot.springcoursespringbootrest.dao;

import ru.radmitr.spring.springboot.springcoursespringbootrest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
