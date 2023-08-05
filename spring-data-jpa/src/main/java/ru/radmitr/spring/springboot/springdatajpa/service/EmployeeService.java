package ru.radmitr.spring.springboot.springdatajpa.service;

import ru.radmitr.spring.springboot.springdatajpa.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);

    List<Employee> findAllByName(String name);

    List<Employee> findAllBySalaryBetween(int min, int max);

    List<Employee> findAllByDepartment(String department);
}
