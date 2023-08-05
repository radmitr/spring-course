package ru.radmitr.spring.rest.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.radmitr.spring.rest.entity.Employee;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();

        // 1.1 - variant with 1 statement
        List<Employee> allEmployees = session
                .createQuery("FROM Employee", Employee.class) // maybe: .createQuery("FROM Employee")
                .getResultList();
        // 1.2 - variant with 2 statements
//        Query<Employee> query = session.createQuery("FROM Employee", Employee.class);
//        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee employee = session.get(Employee.class, id);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
//        Employee employee = session.delete(Employee.class, id);
        Query<Employee> query = session.createQuery("DELETE FROM Employee WHERE id =: employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
