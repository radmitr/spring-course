package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/* ---------------------------- 3. Основы Hibernate ------------------------------ */
/* 5. Сохранение Java объектов в БД */
/* 6. Генерация значений для столбца Primary Key */
/* 7. Получение Java объектов из БД */
    // 1-st class
public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml") // if the name is "hibernate.cfg.xml" we can use just configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Dmitriy", "Radionov", "IT", 500_000);
//            Employee emp = new Employee("Mikhail", "Ivanov", "HR", 750_000);
//            Employee emp = new Employee("Alexandr", "Smirnov", "Sales", 700_000);
            Employee emp = new Employee("Alexandr", "Ivanov", "IT", 600_000);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();

            System.out.println("Done!");
            System.out.println(emp);
        } finally {
            factory.close();
        }
    }
}
