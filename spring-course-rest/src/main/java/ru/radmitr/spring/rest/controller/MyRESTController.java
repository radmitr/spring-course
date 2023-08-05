package ru.radmitr.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.radmitr.spring.rest.entity.Employee;
import ru.radmitr.spring.rest.exception_handling.NoSuchEmployeeException;
import ru.radmitr.spring.rest.service.EmployeeService;

import java.util.List;

/* ------------------------------ 6. Spring REST --------------------------------- */
/* 1. Знакомство с REST API */
/* 2. Знакомство с JSON */
/* 4. Стандарты REST API */
/* 5. Конфигурация приложения */
/* 6. Получение списка всех работников */
/* 7. Получение одного работника по ID */
/* 8. Обработка исключений */
/* 9. Глобальная обработка исключений */
/* 10. Добавление нового работника */
/* 11. Изменение существующего работника */
/* 12. Удаление работника */
@RestController
@RequestMapping("/api")
public class MyRESTController {

    // http://localhost:8080/spring_course_rest/api/employees
    // http://localhost:8080/spring_course_rest/api/employees/1

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
        if (employee == null) {
            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in Database");
        }
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
        Employee employee = employeeService.getEmployee(id);
        if (employee == null) {
            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in Database");
        }
        employeeService.deleteEmployee(id);
        return "Employee with ID = " + id + " was deleted";
    }
}
