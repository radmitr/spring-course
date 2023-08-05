package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/* ---------------------------- 3. Основы Hibernate ------------------------------ */
/* 8. Изменение Java объектов в БД */
public class Test4 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            // 1 - getting object by ID and update one object
//            Employee emp = session.get(Employee.class, 1); // by id = 1
//            emp.setSalary(1_500_000); // update object

            // 2 - createQuery(), executeUpdate()
            session.createQuery("UPDATE Employee SET salary = 1000000 " +
                    "WHERE firstName = 'Alexandr'")
                    .executeUpdate();

            session.getTransaction().commit(); // UPDATE db

            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
