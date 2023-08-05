package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/* ---------------------------- 3. Основы Hibernate ------------------------------ */
/* 7. Получение Java объектов из БД */
    // 2-nd class
public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            // 1 - getting by ID in two transactions
            // 1.1 - existing ID
//            Employee emp = new Employee("Elena", "Petrova", "Sales", 800_000);
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();
//
//            int myId = emp.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, myId);
//            session.getTransaction().commit();
//            System.out.println(employee);
            // 1.2 - non-existent ID
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 10); // by id = 10 or other non-existent
//            session.getTransaction().commit();
//            System.out.println(employee); // >> null

            // 2 - getting by ID in one transaction
            Employee emp = new Employee("Oleg", "Sidorov", "HR", 700_000);
            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();

            int myId = emp.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(employee);

            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
