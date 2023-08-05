package ru.radmitr.spring.springboot.springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.radmitr.spring.springboot.springdatajpa.entity.Employee;
import ru.radmitr.spring.springboot.springdatajpa.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee); // if there is already an id, there will be a change in the database
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return "Employee with ID = " + id + " was deleted";
    }

    @GetMapping("/employees/name/{name}")
    public List<Employee> showAllEmployeesByName(@PathVariable String name) {
        List<Employee> employees = employeeService.findAllByName(name);
        return employees;
    }

    @GetMapping("/employees/salary/{min}&{max}")
    public List<Employee> showAllEmployeesBySalaryBetween(@PathVariable int min, @PathVariable int max) {
        List<Employee> employees = employeeService.findAllBySalaryBetween(min, max);
        return employees;
    }

    @GetMapping("/employees/department/{department}")
    public List<Employee> showAllEmployeesByDepartment(@PathVariable String department) {
        List<Employee> employees = employeeService.findAllByDepartment(department);
        return employees;
    }
}
