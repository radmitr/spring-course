package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/* ---------------------------- 3. Основы Hibernate ------------------------------ */
/* 11. Отношение Один-к-Одному (Uni-directional). Часть 1 */
/* 12. Отношение Один-к-Одному (Uni-directional). Часть 2 */
public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            // 1 - save Dmitriy (and auto save his details)
//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Dmitriy", "Radionov", "IT", 500_000);
//            Detail detail = new Detail("Sevastopol", "123456789", "dmitriy.radionov@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 2 - save Oleg (and auto save his details)
//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700_000);
//            Detail detail = new Detail("Moscow", "987654321", "olejka@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 3 - get Dmitriy (and auto get his details)
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee emp = session.get(Employee.class, 1); // by id = 1
//            System.out.println(emp.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 4 - get non-existent Employee
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee emp = session.get(Employee.class, 10);
//            System.out.println(emp.getEmpDetail()); // java.lang.NullPointerException
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 5 - delete Oleg (and auto delete his details)
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 2); // by id = 2
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
