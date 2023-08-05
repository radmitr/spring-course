package ru.radmitr.spring.mvc_hibernate_aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.radmitr.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import ru.radmitr.spring.mvc_hibernate_aop.entity.Employee;
import ru.radmitr.spring.mvc_hibernate_aop.service.EmployeeService;

import java.util.List;

/* ---------------------- 5. Spring MVC + Hibernate + AOP ------------------------ */
/* 1. Конфигурация приложения Spring MVC + Hibernate */
/* 2. Отображение списка всех работников */
/* 3. Аннотация @Service */
/* 4. Добавление нового работника */
/* 5. Изменение существующего работника */
/* 6. Удаление работника */
/* 7. Добавление в проект функционала AOP */
@Controller
public class MyController {

    // http://localhost:8080/spring_course_mvc_hibernate_aop

    // 1 - without service
//    @Autowired
//    private EmployeeDAO employeeDAO;

    // 2 - with service
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") int id, Model model) {
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }
}
