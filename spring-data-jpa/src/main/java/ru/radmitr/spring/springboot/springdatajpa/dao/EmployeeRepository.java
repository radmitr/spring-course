package ru.radmitr.spring.springboot.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.radmitr.spring.springboot.springdatajpa.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByName(String name);

    List<Employee> findAllBySalaryBetween(int min, int max);

    List<Employee> findAllByDepartment(String department);
}
