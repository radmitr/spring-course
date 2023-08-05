package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/* ---------------------------- 3. Основы Hibernate ------------------------------ */
/* 13. Отношение Один-к-Одному (Bi-directional) */
public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            // 1 - save Mikhail's details (and auto save Mikhail (details_id = null))
//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Mikhail", "Sidorov", "HR", 850_000);
//            Detail detail = new Detail("London", "5648539521", "mishanya@gmail.com");
//            detail.setEmployee(employee);
//            session.beginTransaction();
//
//            session.save(detail);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 2 - save Nikolay's details (and auto save Nikolay)
//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Nikolay", "Ivanov", "HR", 850_000);
//            Detail detail = new Detail("New York", "6548539529", "nikolay@gmail.com");
//
//            employee.setEmpDetail(detail); // first setter
//            detail.setEmployee(employee);  // second setter
//
//            session.beginTransaction();
//
//            session.save(detail);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 3 - get Nikolay's details (and auto get Nikolay)
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 4); // by id = 4
//            System.out.println(detail.getEmployee());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 4 - delete Nikolay's details (and auto delete Nikolay) (cascade = CascadeType.ALL)
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 4); // by id = 4
//            session.delete(detail);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // 5 - delete only Dmitriy's details (not Dmitriy) (cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
            session = factory.getCurrentSession();
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1); // by id = 1
            detail.getEmployee().setEmpDetail(null); // !!!!! break the relation (delete Foreign Key in employee) !!!!!
            session.delete(detail);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
