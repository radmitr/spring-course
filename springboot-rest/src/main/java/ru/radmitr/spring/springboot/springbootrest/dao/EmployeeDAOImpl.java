package ru.radmitr.spring.springboot.springbootrest.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import ru.radmitr.spring.springboot.springbootrest.entity.Employee;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
        // 1 - Only for Hibernate
//        Session session = entityManager.unwrap(Session.class);
//
//        Query<Employee> query = session.createQuery("FROM Employee", Employee.class);
//        List<Employee> allEmployees = query.getResultList();

        // 2 - For JPA implementation
        Query query = entityManager.createQuery("FROM Employee");
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        // 1 - Only for Hibernate
//        Session session = entityManager.unwrap(Session.class);
//        session.saveOrUpdate(employee);

        // 2 - For JPA implementation
        // 2.1 - employee not change, id = 0
//        entityManager.merge(employee);
        // 2.2 - return newEmployee with id != 0
        Employee newEmployee = entityManager.merge(employee);
        employee.setId(newEmployee.getId());
    }

    @Override
    public Employee getEmployee(int id) {
        // 1 - Only for Hibernate
//        Session session = entityManager.unwrap(Session.class);
//        Employee employee = session.get(Employee.class, id);

        // 2 - For JPA implementation
        Employee employee = entityManager.find(Employee.class, id);

        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        // 1 - Only for Hibernate
//        Session session = entityManager.unwrap(Session.class);
////        Employee employee = session.delete(Employee.class, id);
//        Query<Employee> query = session.createQuery("DELETE FROM Employee WHERE id =: employeeId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate();

        // 2 - For JPA implementation
        Query query = entityManager.createQuery("DELETE FROM Employee WHERE id =: employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
