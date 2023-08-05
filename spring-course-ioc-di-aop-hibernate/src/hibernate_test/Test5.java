package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/* ---------------------------- 3. Основы Hibernate ------------------------------ */
/* 9. Удаление Java объектов из БД */
public class Test5 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            // 1 - getting object by ID and delete() one object
//            Employee emp = session.get(Employee.class, 1); // by id = 1
//            session.delete(emp);

            // 2 - createQuery(), executeUpdate()
            session.createQuery("DELETE Employee " +
                    "WHERE firstName = 'Alexandr'")
                    .executeUpdate();

            session.getTransaction().commit();

            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
