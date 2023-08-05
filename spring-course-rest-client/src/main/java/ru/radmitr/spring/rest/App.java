package ru.radmitr.spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.radmitr.spring.rest.configuration.MyConfig;
import ru.radmitr.spring.rest.entity.Employee;

import java.util.List;

/* ------------------------------ 6. Spring REST --------------------------------- */
/* 13. Написание REST Client */
public class App {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

        // 1 - getAllEmployees()
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);
        System.out.println("------------------------------------------");

        // 2 - getEmployee(int id)
        Employee empById = communication.getEmployee(1);
        System.out.println(empById);

        // 3.1 - save: saveEmployee(Employee employee)
//        //Employee emp = new Employee("Sveta", "Sokolova", "HR", 900);
//        //communication.saveEmployee(emp);
        // 3.2 - update: saveEmployee(Employee employee)
//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 1200);
//        emp.setId(18);
//        communication.saveEmployee(emp);

        // 4
//        communication.deleteEmployee(18);
    }
}
