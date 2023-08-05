package ru.radmitr.spring.mvc_hibernate_aop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.radmitr.spring.mvc_hibernate_aop.entity.Employee;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
//    @Transactional // without service
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

        // 1
//        session.save(employee);

        // 2
//        if (employee.getId() == 0) {
//            session.save(employee);
//        } else {
//            session.update(employee);
//        }

        // 3
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
