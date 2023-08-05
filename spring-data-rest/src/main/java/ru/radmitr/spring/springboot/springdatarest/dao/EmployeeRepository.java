package ru.radmitr.spring.springboot.springdatarest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.radmitr.spring.springboot.springdatarest.entity.Employee;

@Repository // it would be possible not to write, because extends JpaRepository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
