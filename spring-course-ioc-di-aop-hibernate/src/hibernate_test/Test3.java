package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/* ---------------------------- 3. Основы Hibernate ------------------------------ */
/* 7. Получение Java объектов из БД */
    // 3-rd class
public class Test3 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            // createQuery(), getResultList()
            // 1 - returns six rows
//            List<Employee> emps = session.createQuery("FROM Employee").getResultList();
            // 2 - returns two rows
//            List<Employee> emps = session.createQuery("FROM Employee " +
//                    "WHERE firstName = 'Alexandr'")
//                    .getResultList();
            // 3 - returns one row
            List<Employee> emps = session.createQuery("FROM Employee " +
                    "WHERE firstName = 'Alexandr' AND salary > 650000")
                    .getResultList(); // Employee - class; firstName and salary - field
            // 4 - no rows
//            List<Employee> emps = session.createQuery("FROM Employee " +
//                    "WHERE firstName = 'Alexandr' AND salary > 1000000")
//                    .getResultList();

            for (Employee e : emps) {
                System.out.println(e);
            }
            session.getTransaction().commit();

            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
