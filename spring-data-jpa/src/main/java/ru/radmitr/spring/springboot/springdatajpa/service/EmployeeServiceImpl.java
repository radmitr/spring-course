package ru.radmitr.spring.springboot.springdatajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.radmitr.spring.springboot.springdatajpa.dao.EmployeeRepository;
import ru.radmitr.spring.springboot.springdatajpa.entity.Employee;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee = null;
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            // here you may trow exception, write to log and etc
        }
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        List<Employee> employees = employeeRepository.findAllByName(name);
        return employees;
    }

    @Override
    public List<Employee> findAllBySalaryBetween(int min, int max) {
        List<Employee> employees = employeeRepository.findAllBySalaryBetween(min, max);
        return employees;
    }

    @Override
    public List<Employee> findAllByDepartment(String department) {
        List<Employee> employees = employeeRepository.findAllByDepartment(department);
        return employees;
    }
}
